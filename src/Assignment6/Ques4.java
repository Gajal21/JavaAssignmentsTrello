package Assignment6;

class Students {
    String name;

    Students() {
        name = "Unknown";
    }

    Students(String name) {
        this.name = name;
    }

    void show() {
        System.out.println("Name: " + name);
    }
}

public class Ques4 {
    public static void main(String[] args) {
        Students s = new Students();
        System.out.print("Without parameter: ");
        s.show();
        System.out.println();
        Students s1 = new Students("Gajal");
        System.out.print("Without parameter: ");
        s1.show();
    }
}
