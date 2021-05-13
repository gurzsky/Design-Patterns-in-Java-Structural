package com.headFirst.decorator;

public class StarbuzzCoffee {

    public static void main(String[] args) {
        Beverage beverage = new Expresso();
        System.out.println(beverage.getDescription() + " $" + String.format("%.2f", beverage.cost()) + ", Size " + beverage.getSize());

        Beverage beverage1 = new Whip(new Mocha(new Mocha(new DarkRoast())));
        System.out.println(beverage1.getDescription() + " $" + String.format("%.2f", beverage1.cost()) + ", Size " + beverage1.getSize());

        Beverage beverage2 = new Whip(new Mocha(new Soy(new HouseBlend())));
        System.out.println(beverage2.getDescription() + " $" + String.format("%.2f", beverage2.cost()) + ", Size " + beverage2.getSize());
    }
}
