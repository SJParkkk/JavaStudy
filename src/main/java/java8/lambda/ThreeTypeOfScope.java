package java8.lambda;

import java.util.function.Consumer;

public class ThreeTypeOfScope {
    public static void main(String[] args) {
        ThreeTypeOfScope threeScope = new ThreeTypeOfScope();
        threeScope.run();

    }
    private void run() {
        final int baseNumber = 10;
//        int baseNumber = 10;
//============================================================================================
        //로컬클래스
        class LocalClass{
            void printNumber(){
//                baseNumber++;// 에러남 - final로 선언한 변수를 수정하려고 하니깐
                int baseNumber = 5;
                System.out.println(baseNumber);
            }
        }
//=============================================================================================
        //익명클래스
        Consumer<Integer> integerConsumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
//                baseNumber++;// 에러남
                int baseNumber = 5;
                System.out.println(baseNumber);
            }
        };
//=============================================================================================
        Consumer<Integer> printInt = value -> {
            // 람다식에 사용한 변수는 final 혹은 effective final 이라함
//            int baseNumber = 5;컴파일 에러
            System.out.println(value + baseNumber);
        };
        printInt.accept(5);
    }
}
