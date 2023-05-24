package org.example;

import org.example.gui.Gui;

import javax.swing.*;
import java.util.HashMap;

public class Main {
    public static int round = 1;
    public static HashMap<Integer, JButton> team1 = new HashMap();
    public static HashMap<Integer, JButton> team2 = new HashMap();
    static Gui gui;
    public static void main(String[] args) {
       gui = new Gui();
    }
}