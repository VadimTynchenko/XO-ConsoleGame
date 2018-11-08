package com.VADIIIM.XO;

import com.VADIIIM.XO.model.Field;
import com.VADIIIM.XO.model.Figure;
import com.VADIIIM.XO.model.Game;
import com.VADIIIM.XO.model.Player;
import com.VADIIIM.XO.model.exceptions.InvalidPointException;
import com.VADIIIM.XO.view.ConsoleView;

public class XOCLI {

    public static void main(String[] args) throws InvalidPointException {
        final String name1 = "Vadim";
        final String name2 = "Max";

        final Player[] players = new Player[2];
        players[0] = new Player(name1 , Figure.X);
        players[1] = new Player(name2, Figure.O);

        final Game gameXO = new Game(players, new Field(3), "XO");

        final ConsoleView consoleView = new ConsoleView();
        consoleView.show(gameXO);
        while (consoleView.move(gameXO)) {
            consoleView.show(gameXO);
        }

    }

}
