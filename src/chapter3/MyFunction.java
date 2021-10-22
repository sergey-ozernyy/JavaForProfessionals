package chapter3;

import chapter2.Apple;
import chapter2.Color;
import com.sun.tools.javac.Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class MyFunction {

    //Написать параметризованную функцию, где в качестве параметра будет объект типа Function (стандартной библиотеки)
    //нужно сопоставить массиву из строк массив чисел, соответствующих длине каждого слова

    public <T,R> List<R> map(List<T> list, Function<T,R> f){
        List<R> result = new ArrayList<>();
        for (T t:list) {
            result.add(f.apply(t));
        }
        return result;
    }

    //Клиентский код:
    public List<Integer> intList = map(
            Arrays.asList("aaaa", "bbb", "cc"),
            (String s) -> s.length()
    );

    //Клиентский код:
    public List<String> colorAppleList = map(
            Arrays.asList(new Apple(150, Color.GREEN.toString()), new Apple(100, Color.RED.toString()), new Apple(50, Color.GREEN.toString())),
            (Apple a) -> a.getColor()
    );

    //Написать функцию, которая получает тип Apple и возвращает булево значение, если яблоко зеленое
    @FunctionalInterface
    public interface IsAnywhere<T> {
        boolean is(T t);

    }

    public <T> List<Boolean> isAny(List<T> list, IsAnywhere<T> isAnywhere){
        List<Boolean> booleanList = new ArrayList<>();
        for (T t:list ) {
            booleanList.add(isAnywhere.is(t));
        }
        return booleanList;
    }

    


}
