package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        final int DRIVINGAGE = 16;
        String msg;

        Scanner sc = new Scanner(System.in);
        int age;

        System.out.print("What is your age? ");
        age = sc.nextInt();

        msg = (age >= DRIVINGAGE) ? "You're old enough to drive!" : "You're NOT old enough to drive.";

        System.out.println(msg);
    }
}
