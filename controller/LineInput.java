package controller;
import java.awt.Point;


/**
 * Write a description of class LineInput here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LineInput extends InputShape {
    private Point start, end;
    public boolean complete () {
        return inputs.size() == 2;
    }
}
