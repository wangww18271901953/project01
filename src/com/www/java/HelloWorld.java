package com.www.java;

import java.util.ArrayList;
import java.util.List;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        List<String> namesList = new ArrayList<>();

        addNameToList(namesList, "Alice");
        addNameToList(namesList, "Bob");
        addNameToList(namesList, "Charlie");

        printNames(namesList);
    }

    public static void addNameToList(List<String> list, String name) {
        list.add(name);
    }

    public static void printNames(List<String> list) {
        for (String name : list) {
            System.out.println(name);
        }
    }
}

