package org.launchcode.java.studios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Area {

    public static void main(String args[]){
        double radius = 0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Enter a radius:");
            radius = sc.nextDouble();
            if(radius <= 0) {
                System.out.println("The radius is less or equal to zero. Please enter value greater than 0.");
            }
        }while (radius <= 0);
        double area = Math.PI * radius * radius;
        DecimalFormat df = new DecimalFormat("###.###");
        System.out.println("The area of circle of radius "+radius+" is: "+df.format(area));
        sc.close();
    }
}