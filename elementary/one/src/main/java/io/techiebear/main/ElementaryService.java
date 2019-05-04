package io.techiebear.main;

import io.techiebear.util.input.InputUtil;
import io.techiebear.util.validation.InputValidator;

import java.util.Calendar;

public class ElementaryService {

    public static final String NOT_ALICE_NOT_BOB_ERROR = "user is neither Alice nor Bob";

    InputUtil inputUtil;

    public ElementaryService(InputUtil inputUtil) {

        this.inputUtil = inputUtil;

    }

    public String checkIfAliceOrBob(String name) {

        if (InputValidator.validateInput(name)) {

            StringBuilder stringBuilder = new StringBuilder();
            char lowerCaseChar = name.charAt(0);
            char upperCaseChar = Character.toUpperCase(lowerCaseChar);
            stringBuilder.append(upperCaseChar);
            stringBuilder.append(name.substring(1).toLowerCase());
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

    public void guessingGame() {


    }

    public int printAddOrMultOfN(String choice) {

        int sum;
        if (choice.compareToIgnoreCase("MULT") == 0) {
            sum = fetchMultipleOfNumbersUpToN();
        } else if (choice.compareToIgnoreCase("ADD") == 0) {
            sum = fetchSumOfNumbersUpToN();
        } else {
            return -1;
        }

        return sum;

    }
    public void printMultTableTo12() {

        int spacing = 4;
        for (int i = 1; i <= 12; i++) {
            for (int j = 1; j <= 12; j++) {
                int sum = i * j;
                int digits = String.valueOf(sum).length();
                System.out.printf("%d", sum);
                addSpacing(spacing - digits);
            }
            System.out.println();
        }
    }
    private void addSpacing(int spacing) {

        for (int i = 0; i < spacing; i++) {
            System.out.print(" ");
        }

    }
    public void printLeaps() {

        int currentYear = Calendar.getInstance().get(Calendar.YEAR);

        for (int i = currentYear; i < currentYear + 20; i++) {
            if (isLeap(i)) {
                System.out.println(i + " is a leap year");
            }
        }

    }

    private boolean isLeap(int year) {

        boolean isLeap = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeap = true;
                }
            } else {
                isLeap = true;
            }
        }
        return isLeap;
    }

}
