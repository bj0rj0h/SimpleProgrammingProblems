package io.techiebear.controllers;

import io.techiebear.main.ElementaryService;
import io.techiebear.main.Helloer;
import io.techiebear.util.input.InputUtil;
import io.techiebear.util.input.InputUtilFactory;

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
        printMultTableTo12();
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

    private void printMultTableTo12(){
        elementaryService.printMultTableTo12();
    }

}
