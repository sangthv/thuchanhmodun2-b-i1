package thuchanh.KiemTraNamNhuan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int year;
        System.out.println("Enter a year: ");
        year = scanner.nextInt();
        boolean isLeapYear = false;
        if(year % 4 == 0 ){
            if(year % 100 ==0){
                if( year % 400 == 0 ){
                     isLeapYear= true;
                }
                isLeapYear = true;
            }
        }
        if(isLeapYear){
            System.out.printf("%d is a leap year", year);
        } else {
            System.out.printf("%d is not a leap year ", year);
        }

//        if(year%4==0){
//           if(year % 100 == 0){
//               if(year % 400==0){
//                   System.out.printf(" %d is a leap year", year);
//               }else {
//                   System.out.printf("  %d is not a leap year", year);
//               }
//           }else {
//               System.out.printf("%d is a leap year", year);
//           }
//        }else {
//            System.out.printf("%d is not a leap year", year);
//        }
    }
}
