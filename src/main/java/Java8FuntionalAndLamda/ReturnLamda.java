package Java8FuntionalAndLamda;

public class ReturnLamda {
    int outerBaseNumber = 10;

    public ReturnLamda() {
    }

    public static void main(String[] args) {
        ReturnLamda lamda = new ReturnLamda();
        System.out.println(lamda.notStaticMethod());
        PureFuntion pure = (number) -> {
            return number * 100;
        };
        System.out.println(pure.run(1));
        System.out.println(pure.run(1));
        System.out.println(pure.run(1));
        System.out.println(pure.run(12));
        System.out.println(pure.run(12));
        System.out.println(pure.run(12));
        PureFuntion var10000 = new PureFuntion() {
            int innerBaseNumber = 10;

            public int run(int number) {
                ++this.innerBaseNumber;
                return number + this.innerBaseNumber;
            }
        };
    }

    public int notStaticMethod() {
        ++this.outerBaseNumber;
        return this.outerBaseNumber;
    }
}