package io.techiebear.util.input;

public class InputUtilFactory {

    public static InputUtil getNewInstance() {

        return new StringInputUtil();
    }

}
