package com.company;

import java.util.ArrayList;

class IntClass {
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {

        return myValue;
    }
}

public class Main {

    public static void main(String[] args) {
	    String[] strArray = new String[10];
	    int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Alan");

//        ArrayList<int> intArrayList = new ArrayList<int>;
        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54));


        // Concept of autoboxing
        Integer integer = new Integer(54);
        Double doubleValue = new Double(43.01);

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for(int i = 0; i<= 10; i++){
            intArrayList.add(Integer.valueOf(i));
        }

        for (int i = 0; i <= 10; i++){
            System.out.println(i + "-->" + intArrayList.get(i).intValue());
        }

        // autoboxing unboxing

        Integer myIntValue = 56; // Integer.valueOf(56);  <-- what the compiler do
        int myInt = myIntValue; // myIntValue.intValue(); <-- what the compiler do.
        // it is recommended to using the feature of autoboxing and unboxing

        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for (double dbl = 0.0; dbl <= 10.0; dbl += 0.5) {
            myDoubleValues.add(Double.valueOf(dbl));  // use dbl
        }

        for (int i = 0; i < myDoubleValues.size(); i++) {
            double value = myDoubleValues.get(i).doubleValue();  // use myDoubleValues.get(i)
            System.out.println(i + " --> " + value);
        }


    }
}
