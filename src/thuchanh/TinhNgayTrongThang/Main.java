package thuchanh.TinhNgayTrongThang;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("which month that you want to count days?  ");
        int month = scanner.nextInt();
        String daysInmonth="";
        switch (month) {
            case 2:
                daysInmonth = "28 or 29";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysInmonth = "31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysInmonth = "30";
                break;
            default:
                daysInmonth = "";
        }
            if(!daysInmonth.equals("")) {
                System.out.printf("the month '%d' has %s days!", month, daysInmonth);
            }
                else{
                    System.out.print("invalid input");
                }
            }
        }


