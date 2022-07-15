package com.bridgelabz.workshop;

import java.util.Scanner;

public class QuotientAndRemainder {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Computing Quotient and Remainder:");
        System.out.println();
        System.out.println("Dividing number A by number B:");

        System.out.println("Enter A:");
        double a = sc.nextDouble();

        System.out.println("Enter B:");
        Double b = sc.nextDouble();

        double quotient = (int)(a/b);
        double remainder = (int)(a%b);

        System.out.println(a+" (A) when divided by "+b+" (B) gives the quotient "+quotient+" and the remainder "+remainder);

    }
}
