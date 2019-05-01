package io.techiebear.util.input;

import java.util.Scanner;

class StringInputUtil implements InputUtil {


    @Override
    public String getUserInputAsString() {

        Scanner inputScanner = new Scanner(System.in);
        String input = inputScanner.nextLine();
        return input;
    }

    @Override
    public int getUserInputAsInt() {

        Scanner inputScanner = new Scanner(System.in);
        return inputScanner.nextInt();
    }

}
