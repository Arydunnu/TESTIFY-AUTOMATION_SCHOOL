package Inheritance;

import com.sun.tools.javac.Main;

import java.util.DoubleSummaryStatistics;

public class Mother extends Father {
    public static void main(String[] args) {
        // Object for Mother Class

        Mother Mary = new Mother();

//       invoke method from Father class

        Mary.Provides();
        Mary.Protects();
        Mary.leads();

//        Invoke method from Mother Class
        Mary.Prays();
        Mary.Cares();
    }

    public void Prays() {
        System.out.println("Mary Prays");
    }

    public void Cares() {
        System.out.println("Mary Cares");

    }

}
