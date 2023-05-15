package com.example.validdelete.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.Optional;

public class UuidConstraint implements ConstraintValidator<IDID, String> {

    private static final String ID_PATTERN
            = "\\d{4}";

    @Override
    public void initialize(IDID constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String id, ConstraintValidatorContext context) {
        return Optional.ofNullable(id)
                .filter(s -> !s.isBlank())
                .map(s -> s.matches(ID_PATTERN))
                .orElse(false);
    }
}