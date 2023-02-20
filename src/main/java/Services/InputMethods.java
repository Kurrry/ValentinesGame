package Services;

import java.util.Scanner;

public class InputMethods {
    private Scanner textInput;
    private Scanner tokenInput;

    public InputMethods() {
        textInput = new Scanner(System.in);
        tokenInput = new Scanner(System.in);
    }

    public Scanner getTextInput() {
        return textInput;
    }

    public Scanner getTokenInput() {
        return tokenInput;
    }
}
