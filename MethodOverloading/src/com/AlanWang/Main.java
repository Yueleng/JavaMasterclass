package com.AlanWang;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Tim", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();
        calcFeetAndInchesToCentimeters(-10,1);
        calcFeetAndInchesToCentimeters(10,1);
        calcFeetAndInchesToCentimeters(6,0);
        calcFeetAndInchesToCentimeters(100);
        calcFeetAndInchesToCentimeters(156);
    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player "+ playerName + " scoured " + score + " points");
        return score * 100;
    }



    public static int calculateScore(int score){
        System.out.println("Unnamed Player scoured " + score + " points");
        return score * 100;
    }


    public static int calculateScore(){
        System.out.println("no player name, no player score");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if((feet >= 0) && (inches >= 0) && (inches <= 12)){
            double centimetres = feet * 12 * 2.54 + inches * 2.54;
            System.out.println(feet + " feet, " + inches + " inches = " + centimetres + " cm");
            return centimetres;
        }
        System.out.println("Invalid feet or inches parameters.");
        return -1;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if (inches < 0){
            return -1;
        }
        double feet = (int) inches / 12;
        double remainderInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainderInches + " inches");
        return calcFeetAndInchesToCentimeters(feet, remainderInches);
    }


}
