package com.company;

public class Motherboard {
    private String model;
    private String manufacturer;
    private int ranSlots;
    private int cardSlots;
    private String bios;

    public void loadProgram(String programName){
        System.out.println("Program " + programName + " is now loading ...");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getRanSlots() {
        return ranSlots;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public String getBios() {
        return bios;
    }


    public Motherboard(String model, String manufacturer, int ranSlots, int cardSlots, String bios) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ranSlots = ranSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }
}

