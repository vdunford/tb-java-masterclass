package com.vanessadunford;

public class Main {

    public static void main(String[] args) {

//        //int has a width of 32
//        int myMinValue = -2_147_483_648;
//        int myMaxValue = 2_147_483_647;
//        int myTotal = (myMinValue/2);
//        System.out.println("myTotal = " + myTotal);
//
//        //byte has a width of 8
//        byte myByteValue = -128;
//        byte myNewByteValue = (byte) (myByteValue/2); //casting (byte) - treat "(myByteValue/2)" as byte
//        System.out.println("myNewByteValue = " + myNewByteValue);
//
//        //short has a width of 16
//        short myShortValue = 32767;
//        short myNewShortValue = (short) (myShortValue/2); //casting (short)
//        System.out.println("myNewShortValue = " + myNewShortValue);
//
//        //long has a width of 64
//        long myLongValue = 9_223_372_036_854_775_807L;

        byte myByte = 10;
        short myShort = 20;
        int myInt = 50;
        long longTotal = 50000L + 10L * (myByte + myShort + myInt);
        short shortTotal = (short) (1000 + 10 * (myByte + myShort + myInt));
        System.out.println("longTotal =" + longTotal);
        System.out.println("shortTotal =" + shortTotal);

    }
}
