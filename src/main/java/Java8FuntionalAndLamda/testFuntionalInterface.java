package Java8FuntionalAndLamda;

import java.util.function.Function;

public class testFuntionalInterface {
    public testFuntionalInterface() {
    }

    public static void main(String[] args) {
        Plus10 plus10 = new Plus10();
        System.out.println(plus10.apply(100));
        Function<Integer, Integer> inplus10 = (number) -> {
            return number + 10;
        };
        Function<Integer, Integer> multply = (number) -> {
            return number * 10;
        };
        System.out.println(inplus10.apply(5));
        System.out.println(multply.apply(10));
        Function<Integer, Integer> multyplyfirst = inplus10.compose(multply);
        System.out.println(multyplyfirst.apply(5));
        Function<Integer, Integer> plusfirst = inplus10.andThen(multply);
        plusfirst.apply(5);
    }
}