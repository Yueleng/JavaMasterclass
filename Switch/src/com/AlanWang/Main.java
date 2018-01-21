package com.AlanWang;

import com.sun.org.apache.xpath.internal.SourceTree;

public class Main {

    public static void main(String[] args) {
        int switchValue = 6;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("was a 3, or a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;

            default:
                System.out.println("Was not 1,2,3,4 or 5");
                break; // This break could be removed, but for readability, it is recommended.

        }

    char charValue = 'G';
    switch (charValue){
        case 'A':
            System.out.println("A was found");
            break;

        case 'B':
            System.out.println("B was found");
            break;

        case 'C': case 'D': case 'E':
            System.out.println(charValue + " was found");

        default:
            System.out.println("Could not find A, B, C, D, or E");
            break;
    }


    String month = "JuNuary";
    switch(month.toLowerCase()){
        case "janurary":
            System.out.println("Jan");
            break;

        case "june":
            System.out.println("Jun");
            break;

        default:
            System.out.println("Not sure");
    }

        // https://stackoverflow.com/questions/8563970/switch-without-break
    }
}
