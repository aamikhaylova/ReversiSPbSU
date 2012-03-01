package ru;

import javax.swing.*;
import java.awt.*;

/**
 * Alexandra Mikhaylova mikhaylova@yandex-team.ru
 */
public class GameWindowBuilder {
    public JFrame buildGameWindow() {
        // initial settings
        final JFrame gameWindow = new JFrame("Reversi");
        gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameWindow.setLayout(new BorderLayout());
        gameWindow.setSize(600, 400);

        // logic field
        final GameField field = new GameField();
        gameWindow.add(field);
        field.setLocation((int) gameWindow.getLocation().getX() + 10, (int) gameWindow.getLocation().getY() + 10);
        field.setSize(350, 350);
        field.setVisible(true);

        return gameWindow;
    }
}
