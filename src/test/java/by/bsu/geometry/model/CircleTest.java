package by.bsu.geometry.model;

import bsu.by.geomerty.model.Circle;
import bsu.by.geomerty.model.Rectangle;
import bsu.by.geomerty.model.Triangle;
import org.junit.Assert;
import org.junit.Test;

public class CircleTest {


    @Test
    public void testCircleArea(){
        Circle circle = new Circle(1,1,1);
        double area = circle.calculateArea();
        Assert.assertEquals(3.14,area,0.01);
    }

    @Test
    public void testCircleNegativeArea(){
        Circle circle = new Circle(-1,-1,1);
        double area = circle.calculateArea();
        Assert.assertEquals(3.14,area,0.01);
    }

    @Test
    public void testCirclePerimeter(){
        Circle circle = new Circle(1,1,1);
        double perimeter = circle.calculatePerimeter();
        Assert.assertEquals(6.28,perimeter,0.03);
    }
    @Test
    public void testCircleNegativePerimeter(){
        Circle circle = new Circle(-1,-1,1);
        double perimeter = circle.calculatePerimeter();
        Assert.assertEquals(6.28,perimeter,0.03);
    }
    @Test
    public void testRectangleArea(){
        Rectangle rectangle = new Rectangle(3,9);
        double area1 = rectangle.calculateArea();
        Assert.assertEquals(27,area1,0);
    }
    @Test
    public void testRectangleNegativeArea(){
        Rectangle rectangle = new Rectangle(-3,-9);
        double area1 = rectangle.calculateArea();
        Assert.assertEquals(27,area1,0);
    }

    @Test
    public void testRectanglePerimeter(){
        Rectangle rectangle = new Rectangle(3,9);
        double perimeter1 = rectangle.calculatePerimeter();
        Assert.assertEquals(24,perimeter1,0);
    }

    @Test
    public void testRectangleNegativePerimeter(){
        Rectangle rectangle = new Rectangle(-3,-9);
        double perimeter1 = rectangle.calculatePerimeter();
        Assert.assertEquals(-24,perimeter1,0);
    }

    @Test
    public void testTriangleArea(){
        Triangle triangle = new Triangle(3,4,5);
        double area2 = triangle.calculateArea();
        Assert.assertEquals(6,area2,0);
    }
    @Test
    public void testTriangleNegativeArea(){
        Triangle triangle = new Triangle(-3,-4,-5);
        double area2 = triangle.calculateArea();
        Assert.assertEquals(6,area2,0);
    }

    @Test
    public void testTrianglePerimeter(){
        Triangle triangle = new Triangle(3,4,5);
        double perimeter2 = triangle.calculatePerimeter();
        Assert.assertEquals(12,perimeter2,0);
    }

    @Test
    public void testTriangleNegativePerimeter(){
        Triangle triangle = new Triangle(-3,-4,5);
        double perimeter2 = triangle.calculatePerimeter();
        Assert.assertEquals(-2,perimeter2,0);
    }

}
