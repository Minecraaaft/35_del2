package gameLogic;

import diceCup.Die;
import gui_fields.GUI_Field;
import gui_fields.GUI_Shipping;
import gui_fields.GUI_Start;
import gui_fields.GUI_Street;
import gui_main.GUI;

public class Game {

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
