package gameLogic;

import board.Board;
import diceCup.DiceCup;
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
            new GUI_Start("1", "", "", new Color(240, 73, 55), Color.pink),
            new GUI_Start("Void", "", "", Color.BLACK, Color.BLACK),
            new GUI_Brewery("src/pictures/towerPic(1).jpg", "Tower", "+250$ (2)", "", "", new Color(36, 155, 240), Color.BLACK),
            new GUI_Start("Void", "", "", Color.BLACK, Color.BLACK),
            new GUI_Brewery("src/pictures/sandboxcrate.jpg", "Crater", "-100$ (3)", "", "", new Color(133, 204, 41), Color.BLACK),
            new GUI_Start("Void", "", "", Color.BLACK, Color.BLACK),
            new GUI_Brewery("src/pictures/palaceGates.jpg", "Palace Gates", "+100$ (4)", "", "", new Color(26, 227, 11), Color.BLACK),
            new GUI_Start("Void", "", "", Color.BLACK, Color.BLACK),
            new GUI_Brewery("src/pictures/cold_desert.jpg", "Cold Desert","-20$ (5)", "", "", new Color(30, 230, 223), Color.BLACK),
            new GUI_Start("Void", "", "", Color.BLACK, Color.BLACK),
            new GUI_Brewery("src/pictures/walled_city.jpg", "Walled City", "+180$ (6)", "", "", new Color(26, 227, 11), Color.BLACK),
            new GUI_Start("Void", "", "", Color.BLACK, Color.BLACK),
            new GUI_Brewery("src/pictures/monastery.jpg", "Monastery", "+0$ (7)", "", "", new Color(26, 227, 11), Color.BLACK),
            new GUI_Start("Void", "", "", Color.BLACK, Color.BLACK),
            new GUI_Brewery("src/pictures/black_cave.jpg", "Black Cave", "-70$ (8)", "", "", new Color(26, 227, 11), Color.BLACK),
            new GUI_Start("Void", "", "", Color.BLACK, Color.BLACK),
            new GUI_Brewery("src/pictures/hut.jpg", "Huts in the Mountain", "+60$ (9)", "", "", new Color(26, 227, 11), Color.BLACK),
            new GUI_Start("Void", "", "", Color.BLACK, Color.BLACK),
            new GUI_Brewery("src/pictures/werewall.jpg", "The Werewall", "-80$ (10)", "", "", new Color(26, 227, 11), Color.BLACK),
            new GUI_Start("Void", "", "", Color.BLACK, Color.BLACK),
            new GUI_Brewery("src/pictures/pit.jpg", "The Pit", "-50$ (11)", "", "", new Color(26, 227, 11), Color.BLACK),
            new GUI_Start("Void", "", "", Color.BLACK, Color.BLACK),
            new GUI_Brewery("src/pictures/goldmine.jpg", "Goldmine", "+650$ (12)", "", "", new Color(26, 227, 11), Color.BLACK),
    };
    private GUI gui = new GUI(fields);
    private Message message;
    private Board board;
    private DiceCup dicecup = new DiceCup();
    GUI_Car car1 = new GUI_Car();
    GUI_Player GUIplayer1;
    GUI_Car car2 = new GUI_Car();
    GUI_Player GUIplayer2;


    public void start() {
        String languageSelection = gui.getUserSelection("Choose language", "Dansk", "English");
        this.message = new Message(languageSelection);
        board = new Board(languageSelection);

        player1.setName(gui.getUserString(message.getEnterNameMessage(player1.getName())));
        player2.setName(gui.getUserString(message.getEnterNameMessage(player2.getName())));

        GUIplayer1 = new GUI_Player(player1.getName(), player1.getBalance(), car1);
        GUIplayer2 = new GUI_Player(player2.getName(), player2.getBalance(), car2);

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
        fields[0].setCar(GUIPlayer, true);
        player.setFieldPos(0);
        gui.getUserButtonPressed(message.getTurnMessage(player.getName()),message.getRollDiceMessage());

        dicecup.rollDice();
        int[] diceValues = dicecup.getFaceValueArray();
        System.out.println( dicecup.getFaceValueSum());

        fields[0].removeAllCars();
        player.setFieldPos(1);
        for (int i = player.getFieldPos(); i <= dicecup.getFaceValueSum(); i++) {

            player.setFieldPos(i);
            fields[player.getFieldPos() * 2 - 1].setCar(GUIPlayer, true);

            try {
                Thread.sleep(300);
            } catch (Exception e) {

            }

            if (player.getFieldPos() == dicecup.getFaceValueSum())
                break;
            fields[player.getFieldPos() * 2 - 1].removeAllCars();
        }

        gui.setDice(diceValues[0], diceValues[1]);

        //field number by index
        int fieldNumber = player.getFieldPos() - 2;

        player.setBalance(player.getBalance() + board.getFieldCashPrize(fieldNumber));
        GUIPlayer.setBalance(player.getBalance());
        gui.showMessage(board.getFieldMessage(fieldNumber));

        fields[player.getFieldPos()].removeAllCars();
        if (dicecup.getFaceValueSum() == 11)
            turn(player, GUIPlayer);
        gui.getUserButtonPressed(message.getEndTurnMessage(player.getName()), message.getEndMessage());

        fields[player.getFieldPos() * 2 - 1].removeAllCars();

    }

}
