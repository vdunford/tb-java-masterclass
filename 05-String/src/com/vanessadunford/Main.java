package com.vanessadunford;

public class Main {

    public static void main(String[] args) {
        //byte
        //short
        //long
        //float
        //double
        //char
        //boolean

        String myString = "This is a string";
        myString = myString + ", and this is more.";
        myString = myString + " \u00A9 2018";
        System.out.println("myString is equal to "+ myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println("The result is "+ numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("lastString is equal to " + lastString);
        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println("lastString is equal to " + lastString);

    }
}
