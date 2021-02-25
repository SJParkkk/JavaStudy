package edu.blog.demo;

public class App {
    public static void main(String[] args) {
        // 생성자를 private 으로 선언시 new로 인스턴스를 만들려고 하면 에러
//        UtilityClass util = new UtilityClass();
        UtilityClass.hello("소정");
    }
}
