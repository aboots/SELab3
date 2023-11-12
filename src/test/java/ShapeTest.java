package test.java;

import org.junit.Assert;
import org.junit.Test;

public class ShapeTest {
    @Test
    public void testRectangleArea() {
        Rectangle rectangle = new Rectangle(8, 10);
        Assert.assertEquals(80, rectangle.area());
    }
}
