package FunctionalMethods;

import java.util.List;

import static Text.WhiteList.playerNames;

public abstract class TextProcessing {
    public static boolean parseName(String name) {
        return playerNames.contains(name);
    }

    public static boolean quizValidation(String answer, List<String> validAnswers) {
        return validAnswers.contains(answer);
    }
}
