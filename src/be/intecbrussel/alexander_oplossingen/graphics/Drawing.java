package be.intecbrussel.alexander_oplossingen.graphics;

import be.intecbrussel.basis.exercise10_10.graphics.Shape;

public class Drawing {

    /*
    Declaring needed variables
     */
    private static final int MAX = 100;
    private Shape[] shapes = new Shape[MAX];
    private int size = 0;

    public void add (Shape s) {
        if (!isPresent(s)) {
            int location = getFreeLocation();
            shapes[location] = s;
            size++;
        }
    }

    public void remove (Shape s) {
        for (int i = 0; i < shapes.length; i++) {
            if (s.equals(shapes[i])) {
                shapes[i] = null;
                size--;
                return;
            }
        }
    }

    public void clear () {
        shapes = new Shape[MAX];
        size = 0;
    }

    public int getSize () {
        return size;
    }

    /* Private methods */
    private boolean isPresent (Shape s) {
        for (Shape shape : shapes) {
            if (s.equals(shape)) {
                return true;
            }
        }
        return false;
    }

    private int getFreeLocation () {
        int freeLocation = 0;
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] == null) {
                freeLocation = i;
            }
        }
        if (freeLocation == 0) {
            createNewArray();
        }
        return freeLocation;
    }

    private void createNewArray () {
        Shape[] temp = new Shape[shapes.length + MAX];
        for(int i = 0; i < shapes.length; i++){
            temp[i] = shapes[i];
        }
        shapes = temp;
    }

    public void printDrawing() {
        for (Shape s : shapes) {
            if(s != null) System.out.println(s);
            else System.out.println("Empty");
        }
    }
}
