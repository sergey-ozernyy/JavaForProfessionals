package chapter2.first;

import chapter2.Apple;

public class AppleSimpleFormatter implements AppleFormatter{
    @Override
    public String accept(Apple apple) {
            return "An apple of " + apple.getWeight() + "g";
    }
}
