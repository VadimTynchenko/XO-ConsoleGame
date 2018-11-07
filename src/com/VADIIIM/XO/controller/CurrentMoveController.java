package com.VADIIIM.XO.controller;

import com.VADIIIM.XO.model.Field;
import com.VADIIIM.XO.model.Figure;
import com.VADIIIM.XO.model.exceptions.InvalidPointException;

import java.awt.*;

public class CurrentMoveController {

    public Figure currentMove(final Field field) throws InvalidPointException {
        int countFigure = 0;
        for (int x = 0; x < field.getSize(); x++) {
                countFigure += countFiguresInTheRow(field, x);
            }

        if (countFigure == field.getSize() * field.getSize())
            return null;

        if (countFigure % 2 == 0) {
            return Figure.X;
        }
        return Figure.O;
    }

    private int countFiguresInTheRow(final Field field, final int row) throws InvalidPointException {
        int countFigure = 0;
        for (int x = 0; x < field.getSize(); x++) {
            if (field.getFigure(new Point(x, row)) != null)
                countFigure++;
        }
        return countFigure;
    }
}
