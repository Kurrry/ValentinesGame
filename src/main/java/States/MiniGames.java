package States;

import Services.InputMethods;
import Text.MiniGameStrings;
import Text.WhiteList;

import static FunctionalMethods.TextProcessing.quizValidation;

public abstract class MiniGames {
    public static void quizMiniGame(InputMethods inputMethods) {
        System.out.println(MiniGameStrings.quizMGIntro);
        System.out.print(MiniGameStrings.quizMGQues1);
        boolean result = quizValidation(inputMethods.getTextInput().nextLine(), WhiteList.quizMGQ1A);
        if (result) {
            System.out.println(MiniGameStrings.correctAnswer);
        } else {
            System.out.println(MiniGameStrings.wrongAnswer);
        }
    }


}
