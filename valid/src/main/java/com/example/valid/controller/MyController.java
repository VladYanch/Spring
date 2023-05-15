package com.example.valid.controller;

import com.example.valid.validation.IdValidation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RestController
public class MyController {

    @GetMapping("/{id}")
    public String getString(@PathVariable("id") @IdValidation String id) {
        return "HELLO " + id;
    }


}
