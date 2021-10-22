import chapter2.*;
import chapter2.first.AppleFancyFormatter;
import chapter2.first.AppleSimpleFormatter;
import chapter2.first.PrettyPrintApple;
import chapter3.MyFunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args){
        List<Apple> apples = makeListApples();
//        PrettyPrintApple.prettyPrintApple(apples, new AppleFancyFormatter());
//        PrettyPrintApple.prettyPrintApple(apples, new AppleSimpleFormatter());
        System.out.println(new MyFunction().isAny(
                apples,
                (Apple apple) -> apple.getColor() == "GREEN"
        ));

        System.out.println(new MyFunction().isAny(
                Arrays.asList(2, 4, 6),
                (Integer i )-> i%2 == 0
        ));
    }



    public static List<Apple> makeListApples(){
        List<Apple> apples = new ArrayList<Apple>();
        Random random = new Random();
        for(int i = 0; i < 22; i++){
            int weight = random.nextInt(200);
            String color;
            if(i%2 == 0){
                color = Color.GREEN.toString();
            } else { color = Color.RED.toString();}
            Apple apple = new Apple(weight, color);
            apples.add(apple);
        }
        return apples;
    }

}
