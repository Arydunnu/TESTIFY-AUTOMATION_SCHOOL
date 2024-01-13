package AccessModifierOne;

public class ClassA {
    public static void main(String[] args) {
     ClassA seen = new ClassA();
    }
    public void classAMethod(){

        System.out.println("Method can be accessed anywhere in the project");
    }
}
