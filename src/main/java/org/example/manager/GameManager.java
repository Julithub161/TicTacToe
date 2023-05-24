package org.example.manager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import static org.example.Main.*;

public class GameManager implements ActionListener {

    int id;
    JButton button;

    @Override
    public void actionPerformed(ActionEvent e) {
        button = (JButton) e.getSource();
        id = Integer.parseInt(button.getText());
        if(round == 1) {
            if(!team1.containsKey(id)) {
                if(!team2.containsKey(id)) {
                    team1.put(id, button);
                    round = 2;
                    button.setBackground(Color.BLUE);
                    if(checkWin(team1)) {
                        for(int i = 1; i <= 9; i++) {
                            if(team1.containsKey(i)) {
                                team1.get(i).setBackground(Color.white);
                            }
                        }
                        for(int i = 1; i <= 9; i++) {
                            if(team2.containsKey(i)) {
                                team2.get(i).setBackground(Color.white);
                            }
                        }
                        team1.clear();
                        team2.clear();
                        round = 1;
                        System.out.println("Gewonnen: Blau");
                    }
                } else
                    System.out.println("Fehler: Dieses Feld wurde bereits vom Gegner ausgewählt, bitte benutze ein anderes");
            } else
                System.out.println("Fehler: Dieses Feld wurde bereits von dir ausgewählt, bitte benutze ein anderes");
        } else if(round == 2) {
            if(!team2.containsKey(id)) {
                if(!team1.containsKey(id)) {
                    team2.put(id, button);
                    round = 1;
                    button.setBackground(Color.RED);
                    if(checkWin(team2)) {
                        for(int i = 1; i <= 9; i++) {
                            if(team1.containsKey(i)) {
                                team1.get(i).setBackground(Color.white);
                            }
                        }
                        for(int i = 1; i <= 9; i++) {
                            if(team2.containsKey(i)) {
                                team2.get(i).setBackground(Color.white);
                            }
                        }
                        team1.clear();
                        team2.clear();
                        round = 1;
                        System.out.println("Gewonnen: Rot");
                    }
                } else
                    System.out.println("Fehler: Dieses Feld wurde bereits vom Gegner ausgewählt, bitte benutze ein anderes");
            } else
                System.out.println("Fehler: Dieses Feld wurde bereits von dir ausgewählt, bitte benutze ein anderes");
        }

    }
    public boolean checkWin(HashMap team) {
        if (team.containsKey(1)) {
            if (team.containsKey(5)) {
                if (team.containsKey(9)) {
                    return true;
                }
            }
            if (team.containsKey(4)) {
                if (team.containsKey(7)) {
                    return true;
                }
            }
            if (team.containsKey(2)) {
                if (team.containsKey(3)) {
                    return true;
                }
            }
        }
        if (team.containsKey(5)) {
            if (team.containsKey(3)) {
                if (team.containsKey(7)) {
                    return true;
                }
            }
            if (team.containsKey(4)) {
                if (team.containsKey(6)) {
                    return true;
                }
            }
            if (team.containsKey(2)) {
                if (team.containsKey(8)) {
                    return true;
                }
            }
        }
        if (team.containsKey(9)) {
            if (team.containsKey(3)) {
                if (team.containsKey(6)) {
                    return true;
                }
            }
            if (team.containsKey(7)) {
                if (team.containsKey(8)) {
                    return true;
                }
            }
        }
        return false;
    }
}