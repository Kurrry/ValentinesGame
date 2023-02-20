package App;

import States.GameState;

public class Main {
    public static void main(String[] args) {
        GameState gameState = new GameState();
        gameState.cleanUp();
    }
}