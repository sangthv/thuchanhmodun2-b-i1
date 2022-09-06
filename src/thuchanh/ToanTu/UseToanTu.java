package thuchanh.ToanTu;

import java.util.Scanner;

public class UseToanTu {
    public static void main(String[] args) {
        float height;
        float width;
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter width: ");
        width = scanner.nextFloat();
        height = scanner.nextFloat();
        float area= width*height;
        System.out.println("area is: "+ area);
    }
}
