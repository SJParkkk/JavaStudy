package java8.functional;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Spliterator;

public class AppCollection {
    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        name.add("keesun");
        name.add("whiteshi");
        name.add("toby");
        name.add("foo");
        // 메소드 레퍼런스 consumer 리턴이 없음
        name.forEach(System.out::println);
        for (String s : name) {
            System.out.println(s);
        }

        //spliterator 쪼갤수 있는

        Spliterator<String> spliterator = name.spliterator();
//        Spliterator<String> spliterator1 = spliterator.trySplit();
//        while(spliterator.tryAdvance(System.out::println));
//        System.out.println("===========================");
//        while(spliterator1.tryAdvance(System.out::println));

//        name.stream().map(String::toUpperCase)
//                .filter(s -> s.startsWith("k"))
//                .collect(Collectors.toList());
//        System.out.println(name);
        Comparator<String> compareToIgnoreCase = String::compareToIgnoreCase;
        name.sort(compareToIgnoreCase.reversed());
        System.out.println("정답은"+ name);
    }
}
