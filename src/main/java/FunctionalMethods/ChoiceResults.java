package FunctionalMethods;

import Text.DialogueStrings;

public abstract class ChoiceResults {
    public static void choice1Result(int choice) {
        switch (choice) {
            case 1 -> System.out.println(DialogueStrings.choice1First);
            case 2 -> System.out.println(DialogueStrings.choice1Second);
            case 3 -> System.out.println(DialogueStrings.choice1Third);
        }
    }
}
