package edu.blog.demo;

public class Test {
    public static void main(String[] args) {
        try {
            // 예외 생성
            NumberFormatException ex = new NumberFormatException("Exception");

            ex.initCause(new NullPointerException("근본 원인"));
            throw ex;
        } catch (NumberFormatException ex) {
//            ex.printStackTrace();
            ex.getCause().printStackTrace();
        }

        //checked exception ->unchecked exception
        throw new RuntimeException(new Exception("런타임 예외로 변경"));
    }
}
