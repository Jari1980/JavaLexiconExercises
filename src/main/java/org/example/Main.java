package org.example;

import java.util.Random;
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
                    case 6:
                        exercise6();
                        break;
                    case 7:
                        exercise7();
                        break;
                    case 8:
                        exercise8();
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
    public static void exercise8(){
        System.out.println("Creating a random number and letting user guess value.");
        System.out.println();
        var rand = new Random();
        var scan = new Scanner(System.in);
        int randomNum = rand.nextInt(0,501);
        System.out.println("Guess the random number between 0-500:");
        while(true){
            try{
                int num = scan.nextInt();
                if (num == randomNum){
                    System.out.println("Great guess!");
                    break;
                }
                else if(num > randomNum){
                    System.out.println("You guessed too high, guess again:");
                }
                else{
                    System.out.println("You gessed too low, guess again:");
                }
            }
            catch(Exception e){
                System.out.println("Bad guess, closing");
                System.exit(0);
            }
        }
    }

    public static void exercise7(){
        System.out.println("Converting seconds into hours minutes and seconds.");
        System.out.println();
        var scan = new Scanner(System.in);
        System.out.println("Enter number for (whole) seconds to convert: ");
        try{
            int secondsInput = scan.nextInt();
            int hours = secondsInput / (60 * 60);
            int minutes = (secondsInput - (hours * (60 * 60))) / 60;
            int seconds = secondsInput - (hours * (60 * 60)) - (minutes * 60);
            System.out.println(hours + ":" + minutes + ":" + seconds);
        }
        catch(Exception e){
            System.out.println("not valid number, closing");
            System.exit(0);
        }
    }

    public static void exercise6(){
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
        System.out.println("Creating a program that calculates the sum/mul/div/sub of two numbers");
        System.out.println();
        System.out.println("45 + 11 = " + (45 + 11));
        System.out.println("12 * 4 = " + (12 * 4));
        System.out.println("24 / 6 = " + (24 / 6));
        System.out.println("55 - 12 = " + (55 - 12));
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