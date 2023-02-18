package FunctionalMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static Text.Words.playerNames;

public abstract class TextProcessing {
    public static boolean parseName(String name) {
        return playerNames.contains(name);
    }
}
