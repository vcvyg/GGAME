package io.github.some_example_name;

public class Gamemanager {
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;

    public static void main(String[] args) {
        // Initialize the game
        Game game = new Game();
        game.create();

        // Main game loop
        while (true) {
            game.render();
            try {
                Thread.sleep(16); // Approximate 60 FPS
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
