package com.company;

public class Main {

    public static int byteConverter(int a, String b){
        int l;
        if (b == "kb"){
            l = a * 1024;
            return l;
        }
        if (b == "b") {
            l = a * (1024 * 1024);
            return l;
        }
        l= a;
       return l;


    }

    public static void main(String[] args) {
        System.out.println(byteConverter(115, "kb"));

        }

    }

