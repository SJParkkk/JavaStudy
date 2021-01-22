package Java8FuntionalAndLamda;

import java.util.function.Function;

public class Plus10 implements Function<Integer, Integer> {
    public Plus10() {
    }

    public Integer apply(Integer integer) {
        return integer + 100;
    }
}