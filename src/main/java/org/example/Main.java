package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        int num;
        while (true) {
            System.out.println("Which exercise do you want to see, 1-8 :");
            try {
                num = scan.nextInt();
                switch (num) {
                    case 1:
                        exercise1();
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

    public static void exercise1(){}
}