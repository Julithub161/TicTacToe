package org.example.manager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static org.example.Main.*;

public class GameManager implements ActionListener {

    int id;
    JButton button;

    @Override
    public void actionPerformed(ActionEvent e) {
        button = (JButton) e.getSource();
        id = Integer.parseInt(button.getText());
        if(round == 1) {
            if(!team1.contains(button)) {
                if(!team2.contains(button)) {
                    team1.add(button);
                    round = 2;
                    button.setBackground(Color.BLUE);
                } else
                    System.out.println("Fehler: Dieses Feld wurde bereits vom Gegner ausgewählt, bitte benutze ein anderes");
            } else
                System.out.println("Fehler: Dieses Feld wurde bereits von dir ausgewählt, bitte benutze ein anderes");
        } else if(round == 2) {
            if(!team2.contains(button)) {
                if(!team1.contains(button)) {
                    team2.add(button);
                    round = 1;
                    button.setBackground(Color.RED);
                } else
                    System.out.println("Fehler: Dieses Feld wurde bereits vom Gegner ausgewählt, bitte benutze ein anderes");
            } else
                System.out.println("Fehler: Dieses Feld wurde bereits von dir ausgewählt, bitte benutze ein anderes");
        }

    }
}