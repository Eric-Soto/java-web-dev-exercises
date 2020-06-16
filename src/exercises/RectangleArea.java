package exercises;

import java.util.Scanner;

public class RectangleArea {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Insert the length of your rectangle:");
        Double length = input.nextDouble();
        Scanner input2 = new Scanner(System.in);
        System.out.println("Insert the width of your rectangle:");
        Double width = input2.nextDouble();
        double area = width * length ;
        System.out.println("The area of your rectangle is " + area);



    }
}
