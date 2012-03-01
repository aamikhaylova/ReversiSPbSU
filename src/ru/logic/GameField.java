package ru.logic;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Alexandra Mikhaylova mikhaylova@yandex-team.ru
 */
public class GameField extends JPanel {
    private final int elementSide = 30;
    private final int circleSize = 28;

    private final boolean [][] circles = new boolean[10][10];

    private void addCircle(final int x, final int y) {
        final int centerX = x / elementSide;
        final int centerY = y / elementSide;
        if (centerX < 10 && centerY < 10) {
            circles[centerX][centerY] = true;
            this.repaint();
        }
    }

    public GameField() {
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                addCircle(e.getX(),e.getY());
            }
        });
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // vertical lines
        for (int i = 0; i <= 10; i ++) {
            g.drawLine(elementSide * i, 0, elementSide * i, elementSide * 10);
        }
        // horizontal lines
        for (int i = 0; i <= 10; i ++) {
            g.drawLine(0, elementSide * i, elementSide * 10, elementSide * i);
        }
        // circles
        for (int i = 0; i < 10; i ++) {
            for (int j = 0; j < 10; j ++) {
                if (this.circles[i][j]) {
                    g.drawOval(elementSide * i + 1, elementSide * j + 1, circleSize, circleSize);
                }
            }
        }
    }
}
