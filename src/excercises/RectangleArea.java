package excercises;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length & breadth of rectangle: ");
        double length = in.nextDouble();
        double breadth = in.nextDouble();
        double area = length * breadth;
        System.out.println("The area of rectangle is "+area);
    }
}
