package view;

import java.awt.Graphics;
import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Cursor;

public class Pixel {
    private int width;
    private int x, y;
    private Color color;
    private boolean isSelected;
    private view.shapes.ShapeView parentShape;
    public Pixel(int x, int y, int width, Color color){
        this.width = width;
        this.x = x;
        this.y = y;
        this.color = color;
        isSelected = false;
        parentShape = null;
    }
    
    public Pixel(int x, int y, int width){
        this(x, y, width, Color.BLACK);
    }
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    
    public void setParentShape (view.shapes.ShapeView pS) {
        parentShape = pS;
    }
    
    public view.shapes.ShapeView getParentShape () {
        return parentShape;
    }
    
    public int getXPlane () {
        return x;
    }
    
    public int getYPlane () {
        return y;
    }
    
    public void setColor (Color color) {
        this.color = color;
    }
    
    public void paintFill(Graphics g) {
        g.setColor(color);
        g.fillRect(x*width, y*width, width, width);
    }
    
    public void select () {
        isSelected = true;
    }
    
    public void unselect () {
        isSelected = false;
    }
    
    public void paint(Graphics g) {
        if(isSelected) g.setColor(new Color(42, 42, 42));
        else g.setColor(color);
        g.fillRect(x*width, y*width, width, width);
    }
    
    @Override
    public boolean equals (Object o) {
        if(this == o) return true;
        if(o instanceof Pixel) {
            Pixel otro = (Pixel)o;
            return otro.getX() == x && otro.getY() == y;
        }
        return false;
    }
}
