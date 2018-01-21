package com.AlanWang;

class Car {
    private String name;
    private boolean engine;
    private int cylinder;
    private int wheels;

    // Constructor

    public Car(String name, int cylinder) {
        this.name = name;
        this.cylinder = cylinder;
        this.wheels = 4;
        this.engine = true;
    }

    public String getName() {
        return name;
    }

    public int getCylinder() {
        return cylinder;
    }

    public String startEngine() {
        return "Car -> startEngine()";
    }

    public String accelerate() {
        return "Car -> accelerate()";
    }

    public String brake() {
        return "Car -> brake()";
    }
}

class Mitsubish extends Car{
    public Mitsubish(String name, int cylinder) {
        super(name, cylinder);
    }

    @Override
    public String startEngine() {
        return "Mitsubishj -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Mitsubishi -> accelerate()";
    }

    @Override
    public String brake() {
        return "Mitsubishi -> brake()";
    }
}

class Ford extends Car{
    public Ford(String name, int cylinder) {
        super(name, cylinder);
    }

    @Override
    public String startEngine() {
        return "Ford -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Ford -> accelerate()";
    }

    @Override
    public String brake() {
        return "Ford -> brake()";
    }
}

class Holden extends Car{
    public Holden(String name, int cylinder) {
        super(name, cylinder);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " -> startEngine()";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " -> accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " -> brake()";
    }
}



public class Main {

    public static void main(String[] args) {
        Car car = new Car("Base car", 4);
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Mitsubish mitsubish = new Mitsubish("Outlander VRW 4WD", 6);
        System.out.println(mitsubish.startEngine());
        System.out.println(mitsubish.accelerate());
        System.out.println(mitsubish.brake());

        Ford ford = new Ford("Ford Falcon", 6);
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

        Holden holden = new Holden("Ford Falcon", 6);
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());
    }


}
