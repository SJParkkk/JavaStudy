package edu.blog.demo;

import java.util.ArrayList;
import java.util.List;

public class Collections {
    public static void main(String[] args) {
        List<Integer> test = new ArrayList<>();
        test.add(5);
        test.add(4);
        test.add(3);
        test.add(2);
        test.add(1);
        Integer l = test.get(1);
        System.out.println(l);
        System.out.println(test);
    }
}
