package be.intecbrussel.alexander_oplossingen.graphics;

import be.intecbrussel.basis.exercise10_10.graphics.Circle;
import be.intecbrussel.basis.exercise10_10.graphics.Rectangle;
import be.intecbrussel.basis.exercise10_10.graphics.Square;

public class DrawingApp {
    public static void main (String[] args) {

        /*
        Making some needed instances
         */
        Drawing drawing = new Drawing();
        Rectangle rectangle = new Rectangle(5, 6);
        Square square = new Square(5);

        /*
        Add the created shapes to drawing

        manually
         */
        drawing.add(rectangle);
        drawing.add(square);

//        drawing.printDrawing();

        /*
        Much faster way
         */
        for (int i = 0; i < 1001; i++) {

            drawing.add(new Circle(i));
        }

        drawing.printDrawing();

        /*
        Printing out the size of the list
         */
        System.out.println("Size of list: " + drawing.getSize());

        /*
        Removing some shapes again
         */
        drawing.remove(new Square(5));
        drawing.remove(new Circle(200));
        System.out.println("Size of list: " + drawing.getSize());

        /*
        Remove more shapes
         */
        drawing.remove(new Circle(200));
        System.out.println("Size of list: " + drawing.getSize());

        /*
        Drop db
         */
        drawing.clear();
        System.out.println("Size of list: " + drawing.getSize());
    }
}
