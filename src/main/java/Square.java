package main.java;

import main.java.Shape;

public class Square extends Shape {
    private int edge;

    public Square(int edge) {
        this.edge = edge;
    }

    public int getEdge() {
        return edge;
    }

    public void setEdge(int edge) {
        this.edge = edge;
    }

    @Override
    public int area() {
        return this.edge * this.edge;
    }
}
