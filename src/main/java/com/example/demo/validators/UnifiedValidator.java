package com.example.demo.validators;

import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.service.PartService;
import com.example.demo.service.PartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.logging.Logger;

public class UnifiedValidator implements ConstraintValidator<ValidProductOrPart, Part> {
    @Autowired
    private ApplicationContext context;

    public static ApplicationContext myContext;

    @Override
    public void initialize(ValidProductOrPart constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(Part part, ConstraintValidatorContext constraintValidatorContext) {
        constraintValidatorContext.disableDefaultConstraintViolation();

        return constraintMin(part, constraintValidatorContext) && constraintMax(part, constraintValidatorContext);
    }

    public boolean constraintMin(Part part, ConstraintValidatorContext constraintValidatorContext) {
        if (part.getInv() < part.getMin()) {
            constraintValidatorContext.buildConstraintViolationWithTemplate("Inventory must be greater than min.").addConstraintViolation();
            return false;
        }
        return true;
    }

    public boolean constraintMax(Part part, ConstraintValidatorContext constraintValidatorContext) {
        if (part.getInv() > part.getMax()) {
            constraintValidatorContext.buildConstraintViolationWithTemplate("Inventory must be less than max.").addConstraintViolation();
            return false;
        }
        return true;
    }
}