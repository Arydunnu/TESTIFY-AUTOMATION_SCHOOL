package JavaKeywords;

public class Class B {
    public static int sharedVariable = 42;
}

    public class ClasB {
        public void useSharedVariable() {
            System.out.println("Value of sharedVariable from ClassA: " + ClasA.sharedVariable);
        }
    }
