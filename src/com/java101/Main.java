package com.java101;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double radius, area, perimeter;
        Scanner input = new Scanner(System.in);
        System.out.print("Please type the radius of the circle :");
        radius = input.nextDouble();
        area = Math.PI * radius * radius;
        perimeter = 2 * Math.PI * radius;
        System.out.println("Area of the circle :" + area + "\nPerimeter of the circle :" + perimeter);
        System.out.print("Please type the central angle of the sector :");
        double centralAngle=input.nextDouble();
        double areaOfSector=(Math.PI*(radius*radius)*centralAngle)/360;
        System.out.print("Area of the sector :" + areaOfSector);
    }
}
