package thuchanh.GiaiPhuongTrinhBac1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Given a equation as 'a * x+b = c' , please enter constants: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("a: ");
        double a = scanner.nextDouble();
        System.out.println("b: ");
        double b = scanner.nextDouble();
        System.out.println("c: ");
        double c = scanner.nextDouble();
        if (a != 0) {
            double answer = (c - b) / a;
            System.out.printf("Equation pass width x= %2.2f!\n", answer);
        } else {
            if (b == c) {
                System.out.println("the solution is all x!");
            } else {
                System.out.println("no solution!");
            }
        }
    }
}

