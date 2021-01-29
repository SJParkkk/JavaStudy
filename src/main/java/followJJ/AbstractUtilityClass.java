package followJJ;

/**
 * 정적 메서드는 인스턴스화 해서 사용할 수 없다.**/
public abstract class AbstractUtilityClass{
    static void hello(String name){
        System.out.println("Hello"+name);
    }
    public static void main(String[] args) {
//     AbstractUtilityClass ab = new AbstractUtilityClass();
        AbstractUtilityClass.hello("소정");
    }
}
