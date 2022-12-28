package Assignment6;

class Employee {
    String name;
    int year;
    String Address;

    void display() {
        System.out.println(name + " || " + year + " || " + Address);
    }

}

public class Ques3 {
    public static void main(String[] args) {

        Employee robert = new Employee();
        Employee sam = new Employee();
        Employee john = new Employee();
        robert.name = "Robert";
        sam.name = "Sam";
        john.name = "John";
        robert.year = 1994;
        sam.year = 2000;
        john.year = 1999;
        robert.Address = "64C- Walls Street";
        sam.Address = "68D- Walls Street";
        john.Address = "26B- Walls Street";
        System.out.println("Name" + " || " + "YearOfJoining" + " || " + "Address");
        robert.display();
        sam.display();
        john.display();
    }
}
