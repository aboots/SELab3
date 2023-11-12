package test.java;

import org.junit.Assert;
import org.junit.Test;

import main.java.Rectangle;

public class ShapeTest {
    @Test
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
}
