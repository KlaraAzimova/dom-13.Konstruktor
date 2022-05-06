package com.company;

public class Main {

    public static void main(String[] args) {
        Class cl = new Class(1, "Peaksoft", new int[]{0, 1, 2});
        System.out.println(cl.getNumber() + " " + cl.getWord() + " " + cl.getArray());
    }
}
