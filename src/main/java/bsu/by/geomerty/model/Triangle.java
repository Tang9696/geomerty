package bsu.by.geomerty.model;

public class Triangle implements Shape{
    double x;
    double y;
    double z;

    public Triangle(double x,double y,double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public double calculateArea() {
        double p = (x+y+z)/2;
        double area=Math.sqrt(p*(p-x)*(p-y)*(p-z));
        return area;
    }

    @Override
    public double calculatePerimeter() {
        return (x + y + z);
    }
}
