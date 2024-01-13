package com.greham;

import java.util.Arrays;

public class JavaArrays {
    public static void main(String[] args) {
        String [][] fruit = new String[3][4];
        fruit [0][0] = "Banana";
        fruit [0][1] = "Apple";
        fruit [0][2] = "Orange";
        fruit [0][3] = "Grapes";
        System.out.println(Arrays.deepToString(fruit));
    }
}
