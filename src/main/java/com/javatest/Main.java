package com.javatest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        List<String> list = Arrays.asList("Kayal","Senthil","Harini");

        System.out.println(list.stream().filter(a->a.startsWith("K")).collect(Collectors.toList()));

    }
}