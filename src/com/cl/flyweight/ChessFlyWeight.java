package com.cl.flyweight;

/**
 * Fly weight
 * @author Can Li
 */

public interface ChessFlyWeight {
    void setColor(String color);
    String getColor();
    void display(Coordinate c);
}

class ConcereteChess implements ChessFlyWeight{

    private String color;

    public ConcereteChess(String color) {
        this.color = color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void display(Coordinate c) {
        System.out.println("chess color: " + color);
        System.out.println("chess position: " + c.getX() + "----" + c.getY());
    }
}
