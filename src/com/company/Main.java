package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Is fraction a mixed fraction of the form a*(x/y). Write 1 for true and 0 for False");
        int check = cin.nextInt();
        Fraction f1,f2;
        long x1,y1,a1;
        if(check == 0) {
            System.out.println("Enter the First Fraction x value");
            x1 = cin.nextLong();
            System.out.println("Enter the First Fraction y value");
            y1 = cin.nextLong();
            f1 = new Fraction(x1, y1);
        }
        else
        {
            System.out.println("Enter the First Fraction a value");
            a1 = cin.nextLong();
            System.out.println("Enter the First Fraction x value");
            x1 = cin.nextLong();
            System.out.println("Enter the First Fraction y value");
            y1 = cin.nextLong();
            f1 = new Fraction(x1, y1,a1);
        }

        System.out.println("Is fraction a mixed fraction of the form a*(x/y). Write 1 for true and 0 for False");
        check = cin.nextInt();
        if(check == 0) {
            System.out.println("Enter the First Fraction x value");
            x1 = cin.nextLong();
            System.out.println("Enter the First Fraction y value");
            y1 = cin.nextLong();
            f2 = new Fraction(x1, y1);
        }
        else
        {
            System.out.println("Enter the First Fraction a value");
            a1 = cin.nextLong();
            System.out.println("Enter the First Fraction x value");
            x1 = cin.nextLong();
            System.out.println("Enter the First Fraction y value");
            y1 = cin.nextLong();
            f2 = new Fraction(x1, y1,a1);
        }
        f2.multiply(f1);
        System.out.println(f2.getX()+" "+f2.getY());

    }
}
