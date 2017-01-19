package com.company;


public class CoolMate {

    public static int fibi(int n){
        int m = 0;
        if (n == 1) {
            System.out.println("Is fibi");
            return 0;
        } else{
            return fibi(m-1) + fibi(m-2);
        }
    }
}
