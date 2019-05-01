package main;

import util.input.InputUtilFactory;

public class Main {


    public static void main(String[] args) {

        Helloer.helloWorld();

        ElementaryService elementaryService = new ElementaryService(InputUtilFactory.getNewInstance());
        System.out.println("What is your name?");
        System.out.println(elementaryService.fetchIfAliceOrBob());
        System.out.println("Add or mult?");
        System.out.println("Enter n");
        int result = elementaryService.printAddOrMultOfN();
        System.out.printf("Sum is: %d \n", result);
    }

}
