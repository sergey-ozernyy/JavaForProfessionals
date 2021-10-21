package chapter2.first;

import chapter2.Apple;

import java.util.List;

public class PrettyPrintApple {

    public static void prettyPrintApple(List<Apple> inventory, AppleFormatter formatter){
        for (Apple apple: inventory){
            String output = formatter.accept(apple);
            System.out.println(output);
        }
    }
}






