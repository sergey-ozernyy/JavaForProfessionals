import chapter2.*;
import chapter2.first.AppleFancyFormatter;
import chapter2.first.AppleSimpleFormatter;
import chapter2.first.PrettyPrintApple;
import chapter3.MyFunction;
import chapter4.Dish;
import chapter5.Trader;
import chapter5.Transaction;

import java.time.Year;
import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.stream.Collectors.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class Main {

    public static void main(String[] args){


        //long howManyDishes = menu.stream().collect(counting());
//        Comparator<Dish> dishCaloriesComparator = Comparator.comparingInt(Dish::getCalories);
//        Optional<Dish> mostCalorieDish = menu.stream()
//                        .collect(maxBy(dishCaloriesComparator));
//        IntSummaryStatistics menuStatistics = menu.stream().collect(summarizingInt(Dish::getCalories));
//        String stringMenu = menu.stream().map(Dish::getName).collect(joining(", "));
//        Map<Dish.Type, List<Dish>> dishesByType = menu.stream().collect(groupingBy(Dish::getType, filtering(dish -> dish.getCalories() > 500, toList())));
//        Map<Dish.Type, Optional<Dish>> dishesByType = menu.stream()
//                .collect(groupingBy(Dish::getType,
//                        maxBy(Comparator.comparingInt(Dish::getCalories))
//                ));

        System.out.println();

    }



    static class Coordinate{

        public Coordinate(int a, int b) {
            this.a = a;
            this.b = b;
        }

        public int getA() {
            return a;
        }

        public void setA(int a) {
            this.a = a;
        }

        public int getB() {
            return b;
        }

        public void setB(int b) {
            this.b = b;
        }

        private int a;
        private int b;
    }


    static Trader raoul = new Trader("Raoul", "Cambridge");
    static Trader mario = new Trader("Mario","Milan");
    static Trader alan = new Trader("Alan","Cambridge");
    static Trader brian = new Trader("Brian","Cambridge");

    final static List<Transaction> transactions = Arrays.asList(
            new Transaction(brian, 2011, 300),
            new Transaction(raoul, 2012, 1000),
            new Transaction(raoul, 2011, 400),
            new Transaction(mario, 2012, 710),
            new Transaction(mario, 2012, 700),
            new Transaction(alan, 2012, 950)
    );



    final static List<Dish> menu = Arrays.asList(
            new Dish("pork", false, 800, Dish.Type.MEAT),
            new Dish("beef", false, 700, Dish.Type.MEAT),
            new Dish("chicken", false, 400, Dish.Type.MEAT),
            new Dish("french fries", true, 530, Dish.Type.OTHER),
            new Dish("rice", true, 350, Dish.Type.OTHER),
            new Dish("season fruit", true, 120, Dish.Type.OTHER),
            new Dish("pizza", true, 550, Dish.Type.OTHER),
            new Dish("prawns", false, 300, Dish.Type.FISH),
            new Dish("salmon", false, 450, Dish.Type.FISH) );
//

//    public static List<Apple> makeListApples(){
//        List<Apple> apples = new ArrayList<Apple>();
//        Random random = new Random();
//        for(int i = 0; i < 22; i++){
//            int weight = random.nextInt(200);
//            String color;
//            if(i%2 == 0){
//                color = Color.GREEN.toString();
//            } else { color = Color.RED.toString();}
//            Apple apple = new Apple(weight, color);
//            apples.add(apple);
//        }
//        return apples;
//    }

}
