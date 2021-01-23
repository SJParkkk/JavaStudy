package Java8FuntionalAndLamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class testFuntionalInterface {
    public testFuntionalInterface() {
    }

    public static void main(String[] args) {
        Plus10 plus10 = new Plus10();
        System.out.println(plus10.apply(100));
        Function<Integer, Integer> inplus10 = (number) ->number + 10;

        Function<Integer, Integer> multply = (number) -> number * 10;

        System.out.println(inplus10.apply(5));
        System.out.println(multply.apply(10));
        Function<Integer, Integer> multyplyfirst = inplus10.compose(multply);
        System.out.println(multyplyfirst.apply(5));
        Function<Integer, Integer> plusfirst = inplus10.andThen(multply);
        plusfirst.apply(5);

        String []  a=  {"a","B"};

        Predicate<Integer> evenPredicate =integer -> integer % 2 == 0;

        Arrays.stream(a).forEach(System.out::println);

        List<Integer>  integers =List.of(1,2,3,4,5,6,7,8);

        System.out.println(integers);
        List<Integer> integerList = integers.stream().filter(evenPredicate.negate()).collect(Collectors.toList());
        System.out.println(integerList);

        //===========================================================================
        List<List<Integer>> listList = new ArrayList<>();

        List<Integer> list = Arrays.asList(12, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> list1 = Arrays.asList(112, 12, 13, 14, 15, 16, 17);
        listList.add(list);
        listList.add(list1);

        List<Integer> collect = listList.stream()
                .flatMap(integers1 -> integers1.stream())
                .filter(evenPredicate)
                .collect(Collectors.toList());
        System.out.println(listList);
        System.out.println(collect);

        List<Integer> oddcollect = listList.stream()
                .flatMap(integers1 -> integers1.stream())
                .filter(evenPredicate.negate())
                .collect(Collectors.toList());
        System.out.println(oddcollect);

        //================================

        Book book  = new Book("박소정멍청",10,"박소정");
        Book book2  = new Book("바보빅터",14000,"호야킴 데 포사다");
        Book book3  = new Book("자바신 김재준",100000,"김재준");

        List<Book> bookList = List.of(book,book2,book3);
        List<String> books = new ArrayList<>();
        for (Book book1 : bookList) {
            if(book1.getPrice() > 10){
                books.add(book1.getName());
            }
        }
        System.out.println(books);

        List<String> collect1 = bookList.stream()
                .filter(Book::priceCheck)
                .map(Book::getName)
                .filter(s -> s.contains("김재준"))
                .collect(Collectors.toList());
        System.out.println(collect1);
    }
}