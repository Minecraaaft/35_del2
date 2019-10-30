package gameLogic;

import diceCup.DiceCup;
import diceCup.Die;
import gui_fields.*;
import gui_main.GUI;
import message.Message;
import player.Player;

import java.awt.*;

public class Game {
    private Player player1 = new Player();
    private Player player2 = new Player();
    GUI_Field[] fields = {
                            new GUI_Start(),
                             new GUI_Start("1", "", "", Color.BLACK, Color.pink),
                            new GUI_Refuge("src/pictures/towerPic.jpg", "Tower", " Tower 100$", "", Color.GRAY, Color.BLACK),

                            new GUI_Street("Tower", "100$", "", "", Color.GRAY, Color.BLACK),
                            new GUI_Jail("src/pictures/towerPic.jpg", "Tower", " Tower 100$", "", Color.GRAY, Color.BLACK),
                            new GUI_Start("Tower", "100$","100$", Color.GRAY, Color.BLACK),
                            new GUI_Brewery("src/pictures/towerPic(1).jpg", "Tower", "100$", "", "", new Color(36, 155, 240), Color.BLACK),
                            new GUI_Street(),
                            new GUI_Street(),
                            new GUI_Street(),
                            new GUI_Street(),
                            new GUI_Street(),
                            new GUI_Street(),
            new GUI_Start("Void", "", "", Color.BLACK, Color.BLACK),
            new GUI_Start("Void", "", "", Color.BLACK, Color.BLACK),
            new GUI_Start("Void", "", "", Color.BLACK, Color.BLACK),
            new GUI_Start("Void", "", "", Color.BLACK, Color.BLACK),
            new GUI_Start("Void", "", "", Color.BLACK, Color.BLACK),
            new GUI_Start("Void", "", "", Color.BLACK, Color.BLACK),
            new GUI_Start("Void", "", "", Color.BLACK, Color.BLACK),
    };
    private GUI gui = new GUI(fields);
    private Message message;
    private DiceCup dicecup = new DiceCup();
    GUI_Car car1 = new GUI_Car();
    GUI_Player GUIplayer1 = new GUI_Player(player1.getName(), player1.getBalance(), car1);
    GUI_Car car2 = new GUI_Car();
    GUI_Player GUIplayer2 = new GUI_Player(player2.getName(), player2.getBalance(), car2);


    public void start() {
        String languageSelection = gui.getUserSelection("Choose language", "Dansk", "English");
        this.message = new Message(languageSelection);

        player1.setName(gui.getUserString("Player1: Enter name: "));
        player2.setName(gui.getUserString("Player1: Enter name: "));

        gui.addPlayer(GUIplayer1);
        gui.addPlayer(GUIplayer2);

        fields[0].setCar(GUIplayer1, true);
        fields[0].setCar(GUIplayer2, true);

        while (!player1.getHasWon() && !player2.getHasWon()) {
            turn(player1, GUIplayer1);
            if (player1.getHasWon()) {
                break;
            }
            turn(player2, GUIplayer2);
        }
    }

    public void turn(Player player, GUI_Player GUIPlayer) {
        gui.getUserButtonPressed(player.getName() + "s turn.","Roll dice");

        dicecup.rollDice();
        int[] diceValues = dicecup.getFaceValueArray();

        fields[player.getFieldPos()].removeAllCars();
        player.setFieldPos(dicecup.getFaceValueSum() - 1);
        fields[player.getFieldPos()].setCar(GUIPlayer, true);

        gui.setDice(diceValues[0], diceValues[1]);

        gui.getUserButtonPressed("hey", "End turn");

        fields[player.getFieldPos()].removeAllCars();
        player.setFieldPos(0);
        fields[player.getFieldPos()].setCar(GUIPlayer, true);

    }

}
