package Assignment6;

class Student{
    String name;
    int EnrollmentNo;
    void display(){
        System.out.println(name);
        System.out.println(EnrollmentNo);
    }
}
public class Ques1{
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Amay";
        s1.EnrollmentNo=132;
        System.out.println("Printing details of Amay");
        s1.display();

    }
}