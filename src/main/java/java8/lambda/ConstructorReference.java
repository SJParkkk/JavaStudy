package java8.lambda;


import java.util.function.Function;
import java.util.function.Supplier;

class Menu{
    private String name;

    public Menu(String s) {
        System.out.println("m2생성되었습니다");
    }

    public Menu() {
        System.out.println("m1생성되었습니다");
    }
}
public class ConstructorReference {
    public static void main(String[] args) {
        Supplier<Menu> coffee = Menu::new;// 객체의 생성x
        System.out.println("Menu 예상 생성 시점");
        Menu m1 = coffee.get();// 실제 생성
        Function<String, Menu> tt = Menu::new;// 객체의 생성x성
        System.out.println("Menu 예상 생성 시점");
        Menu m2 = tt.apply("Tea");// 실제 생
    }
}
