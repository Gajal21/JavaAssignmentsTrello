package Assignment6;

class Rectangle {
    int length, breadth;

    Rectangle() {

    }

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    Rectangle(int num) {
        this.length = num;
        this.breadth = num;
    }

    void displayArea() {
        int area = length * breadth;
        System.out.println("Area: " + area);
    }
}

public class Ques5 {
    public static void main(String[] args) {
        Rectangle rnone = new Rectangle();
        System.out.print("with no parameters: ");
        rnone.displayArea();
        System.out.println();
        Rectangle rtwo = new Rectangle(10, 200);
        System.out.print("with two parameters: ");
        rtwo.displayArea();
        System.out.println();
        Rectangle rone = new Rectangle(100);
        System.out.print("with one parameter: ");
        rone.displayArea();

    }
}
