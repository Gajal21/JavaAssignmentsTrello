package Assignment2;

import java.util.Scanner;

public class Ques10 {
    public static void main(String[] args) {
        double basic_salary, gross, da, hra;

        /* Input basic salary of employee */
        System.out.println("Enter basic salary of an employee: ");
        basic_salary = new Scanner(System.in).nextDouble();

        if (basic_salary <= 15000) {
            da = basic_salary * 0.82;
            hra = basic_salary * 0.25;
        } else if (basic_salary <= 22000) {
            da = basic_salary * 0.9;
            hra = basic_salary * 0.27;
        } else {
            da = basic_salary * 0.95;
            hra = basic_salary * 0.36;
        }

        gross = basic_salary + hra + da;

        System.out.println("GROSS SALARY OF EMPLOYEE: " + gross);

    }
}
