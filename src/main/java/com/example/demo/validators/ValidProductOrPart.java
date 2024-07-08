package com.example.demo.validators;

import com.example.demo.validators.UnifiedValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = UnifiedValidator.class)
@Target({ ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidProductOrPart {
    String message() default "Invalid part inventory, needs to be between min and max";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
