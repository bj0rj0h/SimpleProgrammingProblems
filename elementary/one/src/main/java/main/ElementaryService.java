package main;

import util.input.InputUtil;
import util.validation.InputValidator;

public class ElementaryService {

    public static final String NOT_ALICE_NOT_BOB_ERROR = "User is neither Alice nor Bob";

    InputUtil inputUtil;

    public ElementaryService(InputUtil inputUtil) {

        this.inputUtil = inputUtil;

    }

    public String fetchIfAliceOrBob() {

        String input = inputUtil.getUserInputAsString();
        if (InputValidator.validateInput(input)) {

            StringBuilder stringBuilder = new StringBuilder();
            char lowerCaseChar = input.charAt(0);
            char upperCaseChar = Character.toUpperCase(lowerCaseChar);
            stringBuilder.append(upperCaseChar);
            stringBuilder.append(input.substring(1).toLowerCase());
            return stringBuilder.toString();

        } else {
            return NOT_ALICE_NOT_BOB_ERROR;
        }
    }

    public int fetchSumOfNumbersUpToN() {

        int n = inputUtil.getUserInputAsInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (InputValidator.isMultipleOf5or3(i)) {
                sum += i;
            }
        }
        return sum;
    }


    public int fetchMultipleOfNumbersUpToN() {

        int n = inputUtil.getUserInputAsInt();
        if (n == 0) {
            return 0;
        }
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum = i * sum;
        }
        return sum;

    }
    public int printAddOrMultOfN() {

        int sum = 0;

        String choice = inputUtil.getUserInputAsString();
        if (choice.compareToIgnoreCase("MULT") == 0) {
            sum = fetchMultipleOfNumbersUpToN();
        } else if (choice.compareToIgnoreCase("ADD") == 0) {
            sum = fetchSumOfNumbersUpToN();
        }

        return sum;

    }
}
