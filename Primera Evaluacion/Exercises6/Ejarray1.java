package Exercises6;

import java.util.Arrays;

public class Ejarray1{
    public static void main(String[] args){

        int a[] = new int[16];
    
        int num = 0;
        int b;

        for(b= 0; b<a.length-1; b++){
            a[b]  = a[b+1];

            //a[b]= a;
            //return num;
        }

    }
}