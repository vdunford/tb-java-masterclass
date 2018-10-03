package com.vanessadunford;

public class Main {

    public static void main(String[] args) {
        //width of 16 (2 bytes)
        char myChar = '\u00A9';
        System.out.println("Unicode output was: " + myChar);

        boolean myBoolean = false;
        boolean isFemale = true;

        char regChar = '\u00AE';
        System.out.println("Unicode output was: " + regChar);

    }
}
