package App;

import Players.Player;
import Players.NPCText;
import States.GameState;
import Text.Strings;

import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        new GameState();

        /*int choice = input.nextInt();

        switch (choice) {
            case 1 -> System.out.println("""
                    \nYou don't want to seem too eager, but you know this is somebody you could fall in love with.
                    You already love how easy they are to talk to and the care show for you.
                    Deep down you hope that this could be the relationship you've been hoping for since you were a child.
                    """);
            case 2 -> System.out.println("""
                    \nYou've secretly imagined what this person could be like, but the distance always seemed to be an obstacle.
                    Maybe them bringing this up is their way of saying that they've thought the same.
                    Is this your chance? Best not to waste the only chance you'll get. They're so perfect.
                    """);
            case 3 -> System.out.println("""
                    \nYou're the cutest ever. You make me laugh and smile and full of happiness.
                    Everything you do must be magic because it always makes my day better.
                    """);
        }

        System.out.printf("""
                %s says they've been interested in you for a while, but didn't know how to bring it up.
                You are cautious of what's ahead, but optimistic for a new journey.
                You still have no idea this person is going to be your fiance one day.
                """, npc.getName());

        System.out.printf("""
                \nSome time passes and you are about to meet in person for the first time.
                You're pretty confident that %s feels the same way for you as you do for them, but you want to be sure.
                To do this, you have devised some powers of love for yourself. It's time to use the powers of love.
                WE WILL SUCCEED THROUGH THE POWER OF LOVE!!!!!
                """, npc.getName());

        System.out.println("\nPlease choose from your powers of love to get a message from " + npc.getName() + " <3");
        NPCText text = new NPCText();
        Random random = new Random();

        while (player.getLovePoints() != 5) {
            player.printPowers();
            input.nextInt();
            if (player.getLovePoints() == 4) {
                text.finalPower();
                player.incrementLovePoints();
            } else {
                text.printText(random.nextInt(9));
                player.incrementLovePoints();
            }
        }*/

        System.out.println("""
                                               .--.                         ___       ___                   ___                            ___                                                \s
                                               |  |                        (   )     (   )                 (   )                          (   )                                               \s
                 ___  ___    .--.    ___  ___  '..'  ___ .-.      .--.      | |_      | | .-.     .--.      | |.-.     .--.       .--.     | |_         .--.    ___  ___    .--.    ___ .-.   \s
                (   )(   )  /    \\  (   )(   )      (   )   \\    /    \\    (   __)    | |/   \\   /    \\     | /   \\   /    \\    /  _  \\   (   __)      /    \\  (   )(   )  /    \\  (   )   \\  \s
                 | |  | |  |  .-. ;  | |  | |        | ' .-. ;  |  .-. ;    | |       |  .-. .  |  .-. ;    |  .-. | |  .-. ;  . .' `. ;   | |        |  .-. ;  | |  | |  |  .-. ;  | ' .-. ; \s
                 | |  | |  | |  | |  | |  | |        |  / (___) |  | | |    | | ___   | |  | |  |  | | |    | |  | | |  | | |  | '   | |   | | ___    |  | | |  | |  | |  |  | | |  |  / (___)\s
                 | '  | |  | |  | |  | |  | |        | |        |  |/  |    | |(   )  | |  | |  |  |/  |    | |  | | |  |/  |  _\\_`.(___)  | |(   )   |  |/  |  | |  | |  |  |/  |  | |       \s
                 '  `-' |  | |  | |  | |  | |        | |        |  ' _.'    | | | |   | |  | |  |  ' _.'    | |  | | |  ' _.' (   ). '.    | | | |    |  ' _.'  | |  | |  |  ' _.'  | |       \s
                  `.__. |  | '  | |  | |  ; '        | |        |  .'.-.    | ' | |   | |  | |  |  .'.-.    | '  | | |  .'.-.  | |  `\\ |   | ' | |    |  .'.-.  ' '  ; '  |  .'.-.  | |       \s
                  ___ | |  '  `-' /  ' `-'  /        | |        '  `-' /    ' `-' ;   | |  | |  '  `-' /    ' `-' ;  '  `-' /  ; '._,' '   ' `-' ;    '  `-' /   \\ `' /   '  `-' /  | |       \s
                 (   )' |   `.__.'    '.__.'        (___)        `.__.'      `.__.   (___)(___)  `.__.'      `.__.    `.__.'    '.___.'     `.__.      `.__.'     '_.'     `.__.'  (___)      \s
                  ; `-' '                                                                                                                                                                     \s
                   .__.'                                                                                                                                                                      \s
                """);
    }
}