package com.company;


public class Vehicle {
//    private int wheels;
//    private int drive;
//    private String color;
//
//    public Vehicle(int wheels, int drive, String color) {
//        this.wheels = wheels;
//        this.drive = drive;
//        this.color = color;
//    }
//
//    public void handSteering(){
//        System.out.println("Vehicle.handSteering() called!");
//    }
//
//    public void moving(int speed){
//        System.out.println("Vehicle.moving() called! The current speed is " + speed);
//    }

    private String name;
    private String size;

    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String name, String size){
        this.name = name;
        this.size = size;

        this.currentVelocity = 0;
        this.currentDirection = 0;
    }

    public void steer(int direction){
        this.currentDirection += direction;
        System.out.println("Vehicle.steer(): Steering at " + currentDirection + " degrees.");
    }

    public void move(int velocity, int direction){
        currentVelocity = velocity;
        currentDirection = direction;
        System.out.println("Vehicle.move(): Moving at " + currentVelocity + " in direction " + currentDirection);
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void stop(){
        this.currentVelocity = 0;
    }
}
