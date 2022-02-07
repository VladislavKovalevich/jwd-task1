package by.vlad.task1.validation.impl;

import by.vlad.task1.validation.CustomValidator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomValidatorImpl implements CustomValidator {
    private static CustomValidatorImpl stringValidator;

    private CustomValidatorImpl(){
    }

    public static CustomValidatorImpl getInstance() {
        if (stringValidator == null){
            stringValidator = new CustomValidatorImpl();
        }

        return stringValidator;
    }

    private static final String PATTERN_STRING = "^(\\s*(\\-)?[1-9](\\d+)?\\s*)$";

    @Override
    public boolean validateString(String line) {
        Pattern pattern;
        Matcher matcher;

        pattern = Pattern.compile(PATTERN_STRING);
        matcher = pattern.matcher(line);

        return matcher.matches();
    }
}
