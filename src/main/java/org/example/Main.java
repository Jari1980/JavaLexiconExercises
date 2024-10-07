package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        int num;
        while (true) {
            System.out.println();
            System.out.println("Which exercise do you want to see, 1-8 :");
            try {
                num = scan.nextInt();
                switch (num) {
                    case 1:
                        exercise1();
                        break;
                    case 2:
                        exercise2();
                        break;
                    default:
                        break;
                }
            }
            catch (Exception e){
                System.out.println("Invalid exercise. Closing program");
                System.exit(0);
            }
        }
    }
    public static void exercise2(){
        System.out.println("Creating a program that take a year from user and checks if its a leap year or not.");
        System.out.println();
        var scan = new Scanner(System.in);
        System.out.println("Enter a year: ");
        try{
            int year = scan.nextInt();
            if (year % 100 == 0){
                if (year % 400 == 0){
                    System.out.println("Year " + year + " is a century and a leap year.");
                }
                else{
                    System.out.println("Year " + year + " is a century and Not a leap year.");
                }
            }
            else{
                if (year % 4 == 0){
                    System.out.println("Year " + year + " is a leap year.");
                }
                else{
                    System.out.println("Year " + year + " is Not a leap year.");
                }
            }
        }
        catch (Exception e){
            System.out.println("Bad year, closing program.");
            System.exit(0);
        }
    }

    public static void exercise1(){
        System.out.println("Creating a program that prints 'Hello' in first line and my name on the second.");
        System.out.println();
        System.out.println("Hello");
        System.out.println("Jari!");
    }
}