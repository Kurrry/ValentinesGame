package Players;

public class NPCText {
    public NPCText() {

    }

    public void printText(int choice) {
        switch (choice) {
            case 0 ->
                    System.out.println("\nWow I love how you make me feel. Just being near you in enough to make me fall in love with you.");
            case 1 ->
                    System.out.println("\nYou know, I never thought that somebody like you existed. Perfection isn't supposed to be real, but here you are.");
            case 2 ->
                    System.out.println("\nI can't get enough of being around you. I want to do everything with you from now on. You're so amazing.");
            case 3 ->
                    System.out.println("\nEtta James wrote a song about a love like I feel for you. At last my love has come along, my lonely days are over.");
            case 4 ->
                    System.out.println("\nBards in days long past wrote of their desire to find a love as pure as ours. I can't help but love you.");
            case 5 ->
                    System.out.println("\nSomebody like you only comes along once in 1 million years. You're a miracle gifted to me and I'm so grateful.");
            case 6 ->
                    System.out.println("\nHaving you by my side is the greatest gift I could ever get. I hope I'm lucky enough to have you forever.");
            case 7 ->
                    System.out.println("\nWoah you must be using some kind of power on me. I can't resist the allure of your love!");
            case 8 ->
                    System.out.println("\nYou're the only person I think about and the only person I want to be with. You're the best thing in the universe.");
        }
    }

    public void finalPower() {
        System.out.println("\nWill you be mine forever? I never want to be without you again. You're the person I want by my side until the end.");
        System.out.println("I love you so much, forever and ever and ever.");
    }
}
