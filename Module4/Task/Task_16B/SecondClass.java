package AbstractClass;

public class SecondClass extends FirstClass{
    public static void main(String[] args) {
        SecondClass school = new SecondClass();
        school.AttendClasses();
        school.Study();
        school.AskQuestions();

    }
    @Override
    public void Study() {
        System.out.println("I'll study");
    }

    @Override
    public void AttendClasses(){
        System.out.println("I'll attend classes");
    }


}
