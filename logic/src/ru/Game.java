package ru;

/**
 * Alexandra Mikhaylova mikhaylova@yandex-team.ru
 */
public class Game {
    private final GameWindow gameWindow;

    public Game() {
        this.gameWindow = new GameWindow();
    }

    public void startGame() {
        this.gameWindow.showGameWindow();
    }
}
