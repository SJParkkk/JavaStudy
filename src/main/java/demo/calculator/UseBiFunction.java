package demo.calculator;

import java.util.function.BiFunction;
/**
 * functionalInterface를 활용하여 계산기 만들기
 * funciontalInterface안의 메소드를 알고 있으면 바로 람다식으로 쓰는게 가능하겠지만
 * 메소드를 모를 땐 기존 처럼 new interface()를 한 후, 리턴 타입을 정해주는게 좀 더 이해가 쉬웠다.
 * **/
public class UseBiFunction{
    public static void main(String[] args) {
        System.out.println("test");
        Cla calculator = new Cla();
        calculator.add.myMethod(2,3);
        calculator.multi.apply(3,5);
    }
}
class Cla{
    DemoFunctional add = new DemoFunctional() {
        @Override
        public int myMethod(int a, int b) {
            return a+b;
        }
    };
    DemoFunctional minus = (a, b) -> a-b;
    BiFunction<Integer, Integer, Integer> multi = (a,b) ->a*b;
    DemoFunctional divide = new DemoFunctional() {
        @Override
        public int myMethod(int a, int b) {
            return a/b;
        }
    };
}
