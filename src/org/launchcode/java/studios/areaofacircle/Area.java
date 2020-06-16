package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print(("Enter a radius: "));

        Double radius = input.nextDouble();

        while (radius < 0){
            System.out.println("Please insert a positive number next time");
            input = new Scanner(System.in);
            System.out.print(("Enter a radius: "));
            radius = input.nextDouble();
        }
        Double area = Circle.getArea(radius) ;
        System.out.print("The area of a circle of radius " + radius + " is: " + area);

    }
}
