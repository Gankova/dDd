package com.company;

public class Main {
    public static boolean isSorted(int [] mas) {
        for ( int i : mas) {
            if (i < i + 1) {
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {
       int [] mas = {1, 15, 14};
	System.out.println(isSorted(mas));
    }
}
