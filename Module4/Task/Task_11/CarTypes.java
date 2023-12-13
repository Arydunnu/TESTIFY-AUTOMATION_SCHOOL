package OOP;

public class CarTypes {
    String name ;
    float plateNumber;

    public void carDetails(String MyName, float MyPlateNumber){
        name = MyName;
        plateNumber = MyPlateNumber;
        System.out.println(name + " " + plateNumber);
    }
}
