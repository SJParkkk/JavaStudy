package demo.io;

import java.io.IOException;
import java.io.InputStream;

public class DemoSystemClass {

    public static void main(String[] args) throws IOException {
        System.out.println("1. 여름");
        System.out.println("2. 겨울");
        System.out.println("3.. 가을");
        System.out.println("좋아하는 계절은 ?");
        InputStream comment = System.in;
        char inputchar = (char)comment.read();
        System.out.println(inputchar);
    }
}
