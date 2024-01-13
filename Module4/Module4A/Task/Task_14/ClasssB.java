package OOP;

public class ClasssB {
    public static void main(String[] args) {
        // Creating an object of ClassA
        ClassA square = new ClassA();

        // Setting values for length and breadth
        square.setShapeLength(4.0);
        square.setShapeBreadth(4.0);

        // Calculating the area
        double area = square.getShapeLength() * square.getShapeBreadth();

        
    }

}
