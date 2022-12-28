package Assignment6;

class Complex {

    int real, imaginary;

    Complex() {
    }

    Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    Complex addComp(Complex C1, Complex C2) {

        Complex add = new Complex();

        add.real = C1.real + C2.real;

        add.imaginary = C1.imaginary + C2.imaginary;

        return add;
    }

    Complex subtractComp(Complex C1, Complex C2) {

        Complex sub = new Complex();

        sub.real = C1.real - C2.real;

        sub.imaginary = C1.imaginary - C2.imaginary;

        return sub;
    }

    Complex mulComp(Complex C1, Complex C2) {

        Complex mul = new Complex();

        mul.real = C1.real * C2.real;

        mul.imaginary = C1.imaginary * C2.imaginary;

        return mul;
    }

    void printComplexNumber() {
        System.out.println("Complex number: "
                + real + " + "
                + imaginary + "i");
    }
}

public class Ques6 {

    // Main function
    public static void main(String[] args) {

        Complex C1 = new Complex(3, 2);

        Complex C2 = new Complex(9, 5);

        Complex C3 = new Complex();

        C3 = C3.addComp(C1, C2);

        System.out.print("Addition ");
        C3.printComplexNumber();

        C3 = C3.subtractComp(C1, C2);

        System.out.print("Subtraction:");
        C3.printComplexNumber();

        C3 = C3.mulComp(C1, C2);

        System.out.print("Multiplication:");
        C3.printComplexNumber();
    }
}