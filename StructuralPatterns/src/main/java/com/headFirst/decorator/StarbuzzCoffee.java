package com.headFirst.decorator;

public class StarbuzzCoffee {

    public static void main(String[] args) {
        Beverage beverage = new Expresso();
        System.out.println(beverage.getDescription() + " $" + String.format("%.2f", beverage.cost()) + ", Size " + beverage.getSize());

        Beverage beverage1 = new DarkRoast();
        beverage1.setSize(Beverage.Size.GRANDE);
        beverage1 = new Mocha(beverage1);
        beverage1.setSize(Beverage.Size.GRANDE);
        beverage1 = new Mocha(beverage1);
        beverage1.setSize(Beverage.Size.GRANDE);
        beverage1 = new Whip(beverage1);
        beverage1.setSize(Beverage.Size.GRANDE);
        System.out.println(beverage1.getDescription() + " $" + String.format("%.2f", beverage1.cost()) + ", Size " + beverage1.getSize());

        Beverage beverage2 = new HouseBlend();
        beverage2.setSize(Beverage.Size.TALL);
        beverage2 = new Soy(beverage2);
        beverage2.setSize(Beverage.Size.TALL);
        beverage2 = new Mocha(beverage2);
        beverage2.setSize(Beverage.Size.TALL);
        beverage2 = new Whip(beverage2);
        beverage2.setSize(Beverage.Size.TALL);
        System.out.println(beverage2.getDescription() + " $" + String.format("%.2f", beverage2.cost()) + ", Size " + beverage2.getSize());
    }
}
