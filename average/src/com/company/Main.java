package com.company;

public class Main {
    public static int average(int[] mas) {
        int summas = 0;
        for (int i = 0; i < mas.length; i ++) {
            summas = summas + mas[i];
        }
        return summas / mas.length;
    }

    public static void main(String[] args) {
        int [] mas = {5, 4 ,14, 10};
        System.out.print("Среднее значение:  ");
        System.out.print(average(mas));
    }
}
