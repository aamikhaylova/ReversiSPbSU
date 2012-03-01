package ru.logic;

import javax.swing.*;

/**
 * Alexandra Mikhaylova mikhaylova@yandex-team.ru
 */
public class GameWindow {
    private final JFrame gameWindow;

    public GameWindow() {
        final GameWindowBuilder gameWindowBuilder = new GameWindowBuilder();
        this.gameWindow = gameWindowBuilder.buildGameWindow();
    }
    public void showGameWindow() {
        this.gameWindow.setVisible(true);
    }
}
