package org.example.gui;

import org.example.manager.GameManager;

import javax.swing.*;
import java.awt.*;

public class Gui {
    JFrame frame;
    public static JButton button1;
    public static JButton button2;
    public static JButton button3;
    public static JButton button4;
    public static JButton button5;
    public static JButton button6;
    public static JButton button7;
    public static JButton button8;
    public static JButton button9;

    public static JLabel text;
    public Gui() {
        frame = new JFrame("TicTacToe");
        frame.setBounds(0,0 , 358, 415);
        frame.getContentPane().setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        initalButton(button1, 10, 10, 1);
        initalButton(button2, 120, 10, 2);
        initalButton(button3, 230, 10, 3);
        initalButton(button4, 10, 120, 4);
        initalButton(button5, 120, 120, 5);
        initalButton(button6, 230, 120, 6);
        initalButton(button7, 10, 230, 7);
        initalButton(button8, 120, 230, 8);
        initalButton(button9, 230, 230, 9);

        text = new JLabel();
        text.setBounds(104, 330, 200, 50);
        frame.add(text);

        frame.setVisible(true);
    }

    private void initalButton(JButton button, int x, int y, int id) {
        button = new JButton(String.valueOf(id));
        button.setBounds(x, y, 100, 100);
        button.setBackground(Color.WHITE);
        button.addActionListener(new GameManager());
        frame.add(button);
    }
}
