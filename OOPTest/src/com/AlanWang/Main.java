package com.AlanWang;

public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.00);
        double price = hamburger.itemizeHamburger();

        System.out.println("****************************************************");

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHealthAddition1("Egg", 0.5);
        healthyBurger.addHealthAddition2("Lentils", 0.2);
        healthyBurger.itemizeHamburger();

        System.out.println("*****************************************************");

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.itemizeHamburger();
    }
}
