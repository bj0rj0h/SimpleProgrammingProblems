package io.techiebear.controllers;

import io.techiebear.main.ElementaryService;
import io.techiebear.main.Helloer;
import io.techiebear.util.input.InputUtil;
import io.techiebear.util.input.InputUtilFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ElementaryController {

    private InputUtil inputUtil;
    private ElementaryService elementaryService;

    public ElementaryController(InputUtil inputUtil) {

        elementaryService = new ElementaryService(InputUtilFactory.getNewInstance());
        this.inputUtil = inputUtil;

        Helloer.helloWorld();

    }

    public void startProgram() {

        //fetchAndValidateNameOfUser();
        //printSumOrFactorialOfN();
        //printMultTableTo12();
        //startGuessingGame();
        printLeaps();
    }
    private void printLeaps() {
        elementaryService.printLeaps();

    }

    private void fetchAndValidateNameOfUser() {

        System.out.println("What is your name?");
        String name = inputUtil.getUserInputAsString();
        System.out.println("Hello " + elementaryService.checkIfAliceOrBob(name));
    }

    private void printSumOrFactorialOfN() {

        System.out.println("Add or mult?");
        String choice = inputUtil.getUserInputAsString();
        System.out.println("Enter n");
        int result = elementaryService.printAddOrMultOfN(choice);
        if (result != -1) {
            System.out.printf("Sum is: %d \n", result);
        } else {
            System.out.println("Invalid choice. Must be mult or add");
        }
    }

    private void printMultTableTo12() {

        elementaryService.printMultTableTo12();
    }

    private void startGuessingGame() {

        boolean over = false;

        int choice;
        int guesses = 0;
        List pastGuesses = new ArrayList<>();
        Random rn = new Random();
        int answer = rn.nextInt(10000);

        while (!over) {
            System.out.println("Take a guess");
            choice = inputUtil.getUserInputAsInt();

            if (!pastGuesses.contains(choice)) {
                guesses++;
            }
            if (choice == answer) {
                System.out.println("You won! Num guesses = " + guesses);
                over = true;
            } else {
                String guessLocation = choice < answer ? "above" : "below";
                System.out.println("Answer is " + guessLocation + " your guess");
            }

        }

    }

}
