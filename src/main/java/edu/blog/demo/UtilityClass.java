package edu.blog.demo;
/**
  생성자에 private 이 있으면 외부에서 접근이 불가능 하므로 인스턴스를 생성못한다 .
  다른 클래스는 이클래스를 상속받지 못한다.**/
public class UtilityClass {
    //Suppresses default constructor, ensuring non-instantiability
    //이런식으로 주석을 달아 줘야한다.
    private UtilityClass() {
    }

    static void hello(String name){
        System.out.println("hi"+ name);
    }

}
