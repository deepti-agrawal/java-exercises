package excercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the amount of gas filled:");
        double gas = in.nextDouble();
        System.out.println("Enter the miles travelled:");
        double miles = in.nextDouble();
        double average = miles/gas;
        System.out.println("Averge per gallon is: "+Math.round(average));
    }
}
