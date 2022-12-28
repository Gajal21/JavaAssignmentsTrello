package Assignment6;

class Traingle {
    int side1, side2, side3;

    void area() {
        //huron's formula
        int s=(side1+side2+side3)/2;
        int val=s*(s-side1)*(s-side2)*(s-side3);
        int area=(int)Math.sqrt(val);
       System.out.println("Area: "+area);
    }

    void perimeter() {
        int per = side1 + side2 + side3;
        System.out.println("Perimeter of traingle: " + per);
    }
}

public class Ques2 {
    public static void main(String[] args) {
        Traingle t1 = new Traingle();
        t1.side1 = 3;
        t1.side2 = 4;
        t1.side3 = 5;
        t1.area();
        t1.perimeter();

    }
}
