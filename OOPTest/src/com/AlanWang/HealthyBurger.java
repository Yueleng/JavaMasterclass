package com.AlanWang;

public class HealthyBurger extends Hamburger{
    private String heathlyExtra1Name;
    private double heathlyExtra1Price;

    private String heathlyExtra2Name;
    private double heathlyExtra2Price;
    // constructor
    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown rye");
        super.addHamburgerAddition1("Tomato", 0.27);
        super.addHamburgerAddition2("Lettuce", 0.75);
        super.addHamburgerAddition3("Cheese", 1.00);
        super.addHamburgerAddition4("Avocado", 0.50);
    }

    // method
    public void addHealthAddition1(String name, double price){
        this.heathlyExtra1Name = name;
        this.heathlyExtra1Price = price;
    }

    public void addHealthAddition2(String name, double price){
        this.heathlyExtra2Name = name;
        this.heathlyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice =  super.itemizeHamburger();
        if(this.heathlyExtra1Name != null){
            hamburgerPrice += this.heathlyExtra1Price;
            System.out.println("Added " + this.heathlyExtra1Name + " for an extra " + this.heathlyExtra1Price);
        }

        if(this.heathlyExtra2Name != null){
            hamburgerPrice += this.heathlyExtra2Price;
            System.out.println("Added " + this.heathlyExtra2Name + " for an extra " + this.heathlyExtra2Price);
        }
        System.out.println("Total price " + hamburgerPrice);
        return hamburgerPrice;
    }
}
