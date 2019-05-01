package io.techiebear.util.validation;

public class InputValidator {

    public static boolean validateInput(String input) {

        return input.compareToIgnoreCase("Alice") == 0 || input.compareToIgnoreCase("Bob") == 0;
    }

    public static boolean isMultipleOf5or3(int val) {

        return val % 5 == 0 || val % 3 == 0;
    }

}
