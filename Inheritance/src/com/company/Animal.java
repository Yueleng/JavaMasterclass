package com.company;

public class Animal {
    private int name;
    private int brain;
    private int body;
    private int size;
    private int weight;

    public void eat(){

    }

    public void move(){

    }

    public int getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }

    public Animal(int name, int brain, int body, int size, int weight) {

        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }
}
