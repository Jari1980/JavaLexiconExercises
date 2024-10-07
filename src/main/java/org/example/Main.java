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
                    case 3:
                        exercise3();
                        break;
                    case 4:
                        exercise4();
                        break;
                    case 5:
                        exercise5();
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
    public static void exercise5(){
        System.out.println("Asking user for his/her name, saving it in local variable then greeting user with his/her name.");
        System.out.println();
        var scan = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String name = scan.nextLine();
        System.out.println("Hello " + name);
    }

    public static void exercise4(){
        System.out.println("Writing a program that prints the average of three numbers.");
        System.out.println();
        var scan = new Scanner(System.in);
        System.out.println("Enter first number: ");
        try{
            double num1 = scan.nextDouble();
            System.out.println("Enter second number: ");
            try{
                double num2 = scan.nextDouble();
                System.out.println("Enter third number: ");
                try{
                    double num3 = scan.nextDouble();
                    System.out.println("(" + num1 + " + " + num2 + " + " + num3 + ")/" + "3" + "=" + (num1 + num2 + num3) / 3);
                }
                catch(Exception e){
                    System.out.println("Bad third number, closing");
                    System.exit(0);
                }
            }
            catch(Exception e){
                System.out.println("Bad second number, closing");
                System.exit(0);
            }
        }
        catch(Exception e){
            System.out.println("Bad first number, closing");
            System.exit(0);
        }
    }

    public static void exercise3(){
        System.out.println("Creating a program that takes two numbers and calculates their sum/sub/mul/div.");
        System.out.println();
        var scan = new Scanner(System.in);
        System.out.println("Enter first number: ");
        try{
            double num1 = scan.nextDouble();
            System.out.println("Enter second number: ");
            try{
                double num2 = scan.nextDouble();
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
            }
            catch(Exception e){
                System.out.println("Bad second number, closing this.");
                System.exit(0);
            }
        }
        catch(Exception e){
            System.out.println("Bad first number, closing program");
            System.exit(0);
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