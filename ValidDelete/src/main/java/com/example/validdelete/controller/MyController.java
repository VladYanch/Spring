package com.example.validdelete.controller;

import com.example.validdelete.validation.IDID;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
public class MyController {

    @GetMapping("/{ID}")
    public String getString(@PathVariable("ID") @IDID String ID) {
        return "HELLO";
    }
}