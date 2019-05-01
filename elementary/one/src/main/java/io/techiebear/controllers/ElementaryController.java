package controllers;

import io.techiebear.main.ElementaryService;
import io.techiebear.main.Helloer;
import util.input.InputUtil;
import util.input.InputUtilFactory;

public class ElementaryController {

    private InputUtil inputUtil;
    private ElementaryService elementaryService;

    public ElementaryController(InputUtil inputUtil) {

        elementaryService = new ElementaryService(InputUtilFactory.getNewInstance());
        this.inputUtil = inputUtil;

        Helloer.helloWorld();

    }

    public void startProgram() {

        fetchAndValidateNameOfUser();
        printSumOrFactorialOfN();
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

}
