package com.example.animal.controller;

import com.example.animal.model.Animal;
import com.example.animal.model.AnimalCart;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Set;

@AllArgsConstructor
@Controller
public class AnimalController {
    private final AnimalCart animalCart;

    @GetMapping("/")
    public String get(Model model) {
        Set<Animal> animals = animalCart.getAnimals();

        model.addAttribute("animals", animals);
        model.addAttribute("animal", new Animal());
        System.out.println("снова get");
        return "index";
    }
    @PostMapping("/")
    public String add(Animal animal) {
        animalCart.add(animal);
        return  "redirect:/";
    }
}