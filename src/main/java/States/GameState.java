package States;

import FunctionalMethods.TextProcessing;
import Players.Player;
import Text.Strings;

import java.util.Scanner;
import org.apache.commons.text.WordUtils;



public class GameState {
    private Scanner textInput;
    private Scanner tokenInput;
    private Player player;
    private Player npc;
    private String[] powersOfLove = new String[5];
    private String playerName = "";
    public GameState() {
        textInput = new Scanner(System.in);
        tokenInput = new Scanner(System.in);
        startUp();
    }

    private void startUp() {
        while (!TextProcessing.parseName(playerName)) {
            System.out.print(Strings.playerChoice);
            playerName = textInput.nextLine();
        }
        playerName = WordUtils.capitalize(playerName);
        System.out.println(Strings.powerChoice);

        for (int i = 0; i < powersOfLove.length; i++) {
            System.out.print(Strings.powerEntry);
            powersOfLove[i] = textInput.nextLine();
        }

        player = new Player(playerName, powersOfLove);

        if (playerName.equalsIgnoreCase("katie")) {
            npc = new Player("Avery");
        } else {
            npc = new Player("Katie");
        }

        System.out.println(Strings.welcomeText);

        choice1();
    }

    private void choice1() {
        System.out.printf(Strings.youAre, player.getName(), npc.getName());
        System.out.printf(Strings.choice1, npc.getName());
    }
}
