package gameLogic;

import diceCup.Die;
import gui_fields.*;
import gui_main.GUI;
import message.Message;
import player.Player;

import java.awt.*;

public class Game {
    private Player player1 = new Player();
    private Player player2 = new Player();
    private GUI gui = new GUI();
    private Message message;

    public void start() {
        String languageSelection = gui.getUserSelection("Choose language", "Dansk", "English");
        this.message = new Message(languageSelection);

        player1.setName(gui.getUserString("Player1: Enter name: "));
        player2.setName(gui.getUserString("Player1: Enter name: "));

        gui.addPlayer(new GUI_Player(player1.getName(), 1000));
        gui.addPlayer(new GUI_Player(player2.getName(), 1000));

    }

    public static void main(String[] args) {
        GUI_Field[] fields = new GUI_Field[22];
        fields[0] = new GUI_Start();
        fields[1] = new GUI_Street();
        fields[2] = new GUI_Street();
        fields[3] = new GUI_Street();
        fields[4] = new GUI_Street();
        fields[5] = new GUI_Street();
        fields[6] = new GUI_Street();
        fields[7] = new GUI_Street();
        fields[8] = new GUI_Street();
        fields[9] = new GUI_Street();
        fields[10] = new GUI_Street();
        fields[11] = new GUI_Street();
        GUI.setNull_fields_allowed(true);
        GUI gui = new GUI(fields);
        gui.setDice(3,3);
    }

}
