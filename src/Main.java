import chapter2.*;
import chapter2.first.AppleFancyFormatter;
import chapter2.first.AppleSimpleFormatter;
import chapter2.first.PrettyPrintApple;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args){
        List<Apple> apples = makeListApples();
        PrettyPrintApple.prettyPrintApple(apples, new AppleFancyFormatter());
        PrettyPrintApple.prettyPrintApple(apples, new AppleSimpleFormatter());
    }

    public static List<Apple> makeListApples(){
        List<Apple> apples = new ArrayList<Apple>();
        Random random = new Random();
        for(int i = 0; i < 2; i++){
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
