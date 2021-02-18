package demo.io;


import java.io.*;
import java.io.IOException;
/**
 * FileInputStream 으로 파일을 읽는 방법
 * try-with-resource의 활용
 **/

public class DemoFileInOutStream {
    public static void main(String[] args) throws IOException {

        //System.out.println(System.getProperty("user.dir"));
        String path = "/Users/sjpark/IdeaProjects/JavaStudy/test.txt";
        FileInputStream file = null;
        // File 객체를 생성해서 Reader 하는 방법도 있음
        //일반 try-finally 문
        try {
            file = new FileInputStream(path);
            int data;
            while ((data = file.read()) != -1) {
                char c = (char) data;
                System.out.print(c);
            }
        } finally {
            if (file != null) {
                file.close(); //명시적으로 자원을 반납 해줘
            }
        }
        //try-with-resource 문
        try (
                FileInputStream file2 = new FileInputStream(path)) {
            int data;
            while ((data = file2.read()) != -1) {
                char c = (char) data;
                System.out.print(c);

            }
        }
    }
}

