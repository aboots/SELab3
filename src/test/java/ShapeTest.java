package test.java;

import org.junit.Assert;
import org.junit.Test;

import main.java.Rectangle;
import main.java.Square;

public class ShapeTest {
    @Test
    // add test for area of rectangle
    public void testRectangleArea() {
        Rectangle rectangle = new Rectangle(8, 10);
        Assert.assertEquals(80, rectangle.area());
    }

    @Test
    // add test for getter of width 
    public void testRectangleWidth() {
        Rectangle rectangle = new Rectangle(8, 10);
        Assert.assertEquals(8, rectangle.getWidth());
    }

    @Test
    // add test for getter of height
    public void testRectangleHeight() {
        Rectangle rectangle = new Rectangle(8, 10);
        Assert.assertEquals(10, rectangle.getHeight());
    }

    @Test
    // add test for setter of width
    public void testRectangleSetWidth() {
        Rectangle rectangle = new Rectangle(8, 10);
        rectangle.setWidth(5);
        Assert.assertEquals(50, rectangle.area());
    }

    @Test
    // add test for setter of height
    public void testRectangleSetHeight() {
        Rectangle rectangle = new Rectangle(8, 10);
        rectangle.setHeight(5);
        Assert.assertEquals(40, rectangle.area());
    }

    @Test
    // add test for area of square
    public void testSquareArea() {
        Square square = new Square(5);
        Assert.assertEquals(25, square.area());
    }

    @Test
    // add test for getter of edge
    public void testSquareEdge() {
        Square square = new Square(5);
        Assert.assertEquals(5, square.getEdge());
    }

    @Test
    // add test for setter of edge
    public void testSquareSetEdge() {
        Square square = new Square(5);
        square.setEdge(10);
        Assert.assertEquals(100, square.area());
    }
    
}
