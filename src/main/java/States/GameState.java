package States;

import FunctionalMethods.ChoiceResults;
import FunctionalMethods.TextProcessing;
import Players.Hero.Player;
import Services.InputMethods;
import Text.DialogueStrings;

import org.apache.commons.text.WordUtils;



public class GameState {
    private final InputMethods inputMethods;
    private Player player;
    private Player npc;
    public GameState() {
        inputMethods = new InputMethods();
        startUp();
    }

    private void startUp() {
        String playerName = "";
        while (!TextProcessing.parseName(playerName)) {
            System.out.print(DialogueStrings.playerChoice);
            playerName = inputMethods.getTextInput().nextLine();
        }
        playerName = WordUtils.capitalize(playerName);
        System.out.println(DialogueStrings.powerChoice);
        String[] powersOfLove = new String[5];

        for (int i = 0; i < powersOfLove.length; i++) {
            System.out.print(DialogueStrings.powerEntry);
            powersOfLove[i] = inputMethods.getTextInput().nextLine();
        }

        player = new Player(playerName, powersOfLove);

        if (playerName.equalsIgnoreCase("katie")) {
            npc = new Player("Avery");
        } else {
            npc = new Player("Katie");
        }

        System.out.println(DialogueStrings.welcomeText);

        choice1();
    }

    private void choice1() {
        System.out.printf(DialogueStrings.youAre, player.getName(), npc.getName());
        System.out.printf(DialogueStrings.choice1, npc.getName());
        ChoiceResults.choice1Result(inputMethods.getTokenInput().nextInt());
    }

    public void cleanUp() {
        System.out.println(DialogueStrings.outroText);
    }

}
