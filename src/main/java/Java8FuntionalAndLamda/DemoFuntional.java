package Java8FuntionalAndLamda;

@FunctionalInterface
public interface DemoFuntional {
    void run();

    default void run2() {
        System.out.println("추상 메소드의 body를 인터페이스에서 선언 가능");
    }

    static void run3() {
        System.out.println("정적 매소드 구현체 내부에서 수정 불가");
    }
}
