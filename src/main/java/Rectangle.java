package main.java;

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWidth(){
        return this.width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight(){
        return this.height;
    }

    @Override
    public int area() {
        return this.width * this.height;
    }
}