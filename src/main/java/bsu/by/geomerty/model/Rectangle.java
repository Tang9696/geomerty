package bsu.by.geomerty.model;

public class Rectangle implements Shape{

    private double x;
    private double y;

    public Rectangle(double x,double y){
        this.x = x;
        this.y = y;
    }
    @Override
    public double calculateArea() {
        return x * y;
    }

    @Override
    public double calculatePerimeter() {
        return (x + y) * 2;
    }
}
