package com.company;

public class Car extends Vehicle {
//    private String oil;
//    private int chair;
//
//    public Car(int drive, String color, String oil, int chair) {
//        super(4, drive, color);
//        this.oil = oil;
//        this.chair = chair;
//    }
//
//    @Override
//    public void moving(int speed) {
//        System.out.println("Car.moving() called! The current speed is " + speed * 2);
//        super.moving(speed);
//    }
//
//    public void changeGears(){
//        System.out.println("Car.moving() called! The current ");
//    }

    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;

    private int currentGear;


    public Car(String name, String size, int wheels, int doors, int gears, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.setCurrentGear(): Changed to " + this.currentGear + " gear.");
    }

    public void changeVelocity(int speed, int direction){
        System.out.println("Car.changeVelocity(): Velocity " + speed + " direction " + direction);
        move(speed, direction);

    }






}
