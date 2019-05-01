package main;

import main.controllers.ElementaryController;
import util.input.InputUtilFactory;

public class Main {


    public static void main(String[] args) {

        ElementaryController elementaryController = new ElementaryController(InputUtilFactory.getNewInstance());
        elementaryController.startProgram();

    }

}
