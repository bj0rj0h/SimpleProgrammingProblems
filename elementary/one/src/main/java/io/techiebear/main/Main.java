package io.techiebear.main;

import io.techiebear.controllers.ElementaryController;
import io.techiebear.util.input.InputUtilFactory;

public class Main {


    public static void main(String[] args) {

        ElementaryController elementaryController = new ElementaryController(InputUtilFactory.getNewInstance());
        elementaryController.startProgram();

    }

}
