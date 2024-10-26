package com.atguigu.gulimall.common.valid;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ListValueConstraintValidator implements ConstraintValidator<ListValue, Integer> {

    private Set<Integer> set = new HashSet<>();

    @Override
    public void initialize(ListValue constraintAnnotation) {
        int[] values = constraintAnnotation.values();
        Arrays.stream(values).forEach(v -> set.add(v));
    }

    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext context) {
       return set.contains(value);
    }
}
