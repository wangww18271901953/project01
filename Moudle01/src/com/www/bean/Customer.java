package com.www.bean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;


public class Customer {

    public static void main(String[] args){

        System.out.println("helloworld!!!!!!");

        ArrayList list = new ArrayList<>();

        System.out.println(list);

        Date date = new Date();

        System.out.println(date);


        int num = 10;
        System.out.println("Customer.main");
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("num = " + num);
        System.out.println("num = " + num);
    }

    private static final int i = 0;

}
