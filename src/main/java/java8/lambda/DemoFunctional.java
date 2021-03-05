package java8.lambda;

import java.util.function.BiFunction;

interface testInterface1{
    boolean accept();
}
interface testInterface2{
    boolean test();
}

interface Calculator{
    int cal(int x, int y);
}

interface Cal2{
    int cal(final int y);
}
interface Cal3{
    int cal();
}

public class DemoFunctional {
    public static void main(String[] args) {
//        Cal3 mixVal = (int x, y) -> x + y; // 에러
        Cal2 running = (final int y) -> y + 1;
        int x = 2;
        int y = 3;
        Calculator test = (x1, x2) -> x1 + x2;
        System.out.println(test.cal(x, y));

        BiFunction<Integer, Integer, Integer> tt = (a, b)-> a+b;
        int answer = tt.apply(x,y);
        System.out.println(answer);


        testInterface1 test1 = new testInterface1() {
            @Override
            public boolean accept() {
                System.out.println("이게 purefunction?");
                return false;
            }
        };
        System.out.println(test1.accept());

        testInterface2 test2 = () -> {
            System.out.println("lambda expression");
            return false;
        };


        testInterface2 test3 = DemoFunctional::test;
        System.out.println(test3.test());
    }

        private static boolean test() {
        System.out.println("Method reference");
        return false;
    }



}