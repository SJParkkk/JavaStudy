package Java8FuntionalAndLamda;

public class BasicLamda {
    public BasicLamda() {
    }

    public static void main(String[] args) {
        DemoFuntional funtional = () -> {
            System.out.println("런 함수에 이름을 출력하고 싶습니다.");
            System.out.println("박소정");
        };
        funtional.run();
    }
}
