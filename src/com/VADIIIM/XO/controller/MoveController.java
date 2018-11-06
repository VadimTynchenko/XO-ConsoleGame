package com.VADIIIM.XO.controller;

import com.VADIIIM.XO.model.Field;
import com.VADIIIM.XO.model.Figure;
import com.VADIIIM.XO.model.exceptions.AlreadyOccupiedException;
import com.VADIIIM.XO.model.exceptions.InvalidPointException;

import java.awt.*;

public class MoveController {

    public void applyFigure(final Field field,
                            final Point point,
                            final Figure figure) throws InvalidPointException,
                                                        AlreadyOccupiedException {
        if (field.getFigure(point) != null) {
            throw new AlreadyOccupiedException();
        }
        field.setFigure(point, figure);
    }

}
