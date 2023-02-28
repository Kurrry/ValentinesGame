package States;

import Services.InputMethods;
import Text.MiniGameStrings;
import Text.WhiteList;

import static FunctionalMethods.TextProcessing.quizValidation;


public abstract class MiniGames {
    public static void quizMiniGame(InputMethods inputMethods) {
        int result = 0;

        System.out.println(MiniGameStrings.quizMGIntro);

        System.out.println(MiniGameStrings.quizMGQues1);
        result += quizValidation(inputMethods.getTextInput().nextLine(), WhiteList.quizMGQ1A);
        System.out.println(MiniGameStrings.quizMGQues2);
        result += quizValidation(inputMethods.getTextInput().nextLine(), WhiteList.quizMGQ2A);
        System.out.println(MiniGameStrings.quizMGQues3);
        result += quizValidation(inputMethods.getTextInput().nextLine(), WhiteList.quizMGQ3A);
        System.out.println(MiniGameStrings.quizMGQues4);
        result += quizValidation(inputMethods.getTextInput().nextLine(), WhiteList.quizMGQ4A);
        System.out.println(MiniGameStrings.quizMGQues5);
        result += quizValidation(inputMethods.getTextInput().nextLine(), WhiteList.quizMGQ5A);

        if (result <= 1) {
            System.out.println(MiniGameStrings.failScore);
        } else if (result < 5) {
            System.out.println(MiniGameStrings.averageScore);
        } else {
            System.out.println(MiniGameStrings.perfectScore);
        }
    }


}
