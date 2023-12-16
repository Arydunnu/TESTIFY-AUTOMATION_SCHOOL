package OOP;

// ClassA
public class ClassA {
    private int shapeSides;
    private double shapeLength;
    private double shapeBreadth;

    // Constructor
    public ClassA() {
        this.shapeSides = 4;
    }

    // Getter and Setter for shapeLength
    public double getShapeLength() {
        return shapeLength;
    }

    public void setShapeLength(double shapeLength) {
        this.shapeLength = shapeLength;
    }

    // Getter and Setter for shapeBreadth
    public double getShapeBreadth() {
        return shapeBreadth;
    }

    public void setShapeBreadth(double shapeBreadth) {
        this.shapeBreadth = shapeBreadth;
    }

    // Getter for shapeSides (No setter to enforce that it's always 4)
    public int getShapeSides() {
        return shapeSides;
    }
}
