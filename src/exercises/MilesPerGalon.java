package exercises;

import java.util.Scanner;

public class MilesPerGalon {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven? ");
        Double miles = input.nextDouble();
        Scanner input2 = new Scanner(System.in);
        System.out.println("How much gas in gallons have you consumed? ");
        Double gallons = input2.nextDouble();
        double milesPerGallon = miles /  gallons ;
        System.out.println("Your miles per gallon were: " + milesPerGallon);


    }
}
