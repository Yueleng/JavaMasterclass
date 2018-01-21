package com.AlanWang;

public class Main {

    public static void main(String[] args) {

        // int has a width of 32
	    int myMinValue = -2147483648;
	    int myMaxValue = 2147483647;
	    int myTotal = (myMinValue/2);
        System.out.println("myTotal = " + myTotal);


        // byte has width of 8
	    byte myByteValue1 = -128;
	    byte myByteValue2 = 127;
	    byte myNewByteValue = (byte) (myByteValue1 /2);
        System.out.println("myNewByteValue = " + myNewByteValue);

	    // short has a width of 16
	    short myShortValue = 32767;
	    short myNewShortValue = (short) (myShortValue / 2);
		System.out.println("myNewShortValue = " + myNewShortValue);

	    // long has a width of 64
        long myLongValue = -9_223_372_036_854_775_808L;

		byte byteValue = 10;
		short shortValue = 20;
		int intValue =50;
		long longTotal = 50000L + 10L * (byteValue + shortValue + intValue);
		short shortTotal = (short) (1000 + 10 * (byteValue + shortValue + intValue));
		System.out.println("longTotal = " + longTotal);
		System.out.println("shortTotal = " + shortTotal);
    }
}
