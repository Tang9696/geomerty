package bsu.by.geomerty.model;

import java.awt.*;

public class Triangle implements Shape{
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private int x3;
    private int y3;
    private double x, y, z;

    public Triangle(int x,int y,int x2,int y2,int x3,int y3){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

    @Override
    public double calculateArea() {
        Point A = new Point(x1, y1);
        Point B = new Point(x2, y2);
        Point C = new Point(x3, y3);
        x = Math.hypot((A.x - B.x), (A.y - B.y));
        y = Math.hypot((B.x - C.x), (B.y - C.y));
        z = Math.hypot((C.x - A.x), (C.y - A.y));
        double p = (x+y+z)/2;
        double area=Math.sqrt(p*(p-x)*(p-y)*(p-z));
        return area;
    }

    @Override
    public double calculatePerimeter() {
        Point A = new Point(x1, y1);
        Point B = new Point(x2, y2);
        Point C = new Point(x3, y3);
        x = Math.hypot((A.x - B.x), (A.y - B.y));
        y = Math.hypot((B.x - C.x), (B.y - C.y));
        z = Math.hypot((C.x - A.x), (C.y - A.y));
        return (x + y + z);
    }
}
