package com.example.valid.validation;


import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.Optional;

public class IdVerify implements ConstraintValidator<IdValidation, String> {

        private static final String ID_PATTERN = "\\d{4}";

        @Override
        public void initialize(IdValidation constraintAnnotation) {
                ConstraintValidator.super.initialize(constraintAnnotation);
        }

        @Override
        public boolean isValid(String value, ConstraintValidatorContext context) {
                return Optional.ofNullable(value)
                        .filter(s -> !s.isBlank())
                        .map(s -> s.matches(ID_PATTERN))
                        .orElse(false);
        }
}
