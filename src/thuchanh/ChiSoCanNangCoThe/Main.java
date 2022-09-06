package thuchanh.ChiSoCanNangCoThe;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;
        System.out.println(" enter a weight: ");
        weight = scanner.nextDouble();
        System.out.println("enter a height: ");
        height = scanner.nextDouble();
        bmi = weight / Math.pow(height, 2);
        if (bmi < 18.5) {
            System.out.printf("%-20.2f%s", bmi, "interpretation\n");
        } else if (bmi < 25) {
            System.out.printf("%-20.2f%s", bmi, "normal");
        } else if (bmi < 30) {
            System.out.printf("%-20.2f%s", bmi, "overweight");
        } else  {
            System.out.printf("beo phi" + bmi);
        }
    }
}
