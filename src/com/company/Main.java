package com.company;

public class Main {

    public static void main(String[] args) {
        Class cl = new Class(1, "Peaksoft", new int[]{0, 1, 2, 5, 10});
        System.out.println(cl.getNumber() + " " + cl.getWord() + " ");
        for (int i = 0; i < cl.getArray().length; i++) {
            System.out.print(cl.getArray()[i] + " ");

        }
    }
}
