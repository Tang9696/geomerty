package bsu.by.geomerty;

import bsu.by.geomerty.model.Circle;
import bsu.by.geomerty.model.Rectangle;
import bsu.by.geomerty.model.Triangle;
import bsu.by.geomerty.view.ShapePrinter;

public class Main {

    public static void main(String[] args){
        ShapePrinter printer = new ShapePrinter();

        Circle circle = new Circle(1,1,1);
        printer.print(circle);

        Rectangle rectangle = new Rectangle(3,9,9,4);
        printer.print(rectangle);

        Triangle triangle = new Triangle(0,0,3,3,5,6);
        printer.print(triangle);


    }
}
