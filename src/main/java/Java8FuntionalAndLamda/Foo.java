package Java8FuntionalAndLamda;

import java.util.Locale;

public interface Foo {
    void printName();
//    void printNameUpperCase(); // 상속받은 모든 곳에서 컴파일 에러 발생
    //문서화를 잘해야 한다. return null 이면 runtime exception이 나옴
    //@implSpec 이 구현체는 getName()으로 가져온 문자열을 대문자로 바꿔 출력한다.
    default void printNameUpperCase(){
        System.out.println(getName().toUpperCase(Locale.ROOT));
    }
//    default void toString()// 오브젝트의 기본 메서드 재정의 불가
    String toString();//추상 메서드로 선언하는건 가능
// 사용하는 라이브러리에 재정의하는 것은 불가능하다
    //bar라는 implements에도printName()이 있다면 defaultfoo가 양쪽 다 컴파일 에러충돌하는 경우 직접 오버라이드 해야함
    //static 매소드
    // foreach()/

    String getName();
    static void printAnything(){
        System.out.println("Foo");
    }
}
