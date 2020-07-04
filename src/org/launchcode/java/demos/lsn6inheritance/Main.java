package org.launchcode.java.demos.lsn6inheritance;

public class Main {


    public static void main(String[] args){

        Cat plainCat = new Cat(8.6);
        HouseCat garfield = new HouseCat("Garfield", 12);
        garfield.eat();
        System.out.println(garfield.isTired());   // prints true

        HouseCat spike = new HouseCat("Spike");
        System.out.println(spike.getWeight());   // prints 13

        System.out.println(spike.noise());
        System.out.println(plainCat.noise());
    }

}

