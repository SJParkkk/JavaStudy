package demo.io;

import java.io.IOException;
/**
 * SYSTEM.OUT VS SYSTEM.ERR DIFFERENCE
 * "REDIRECTION"
 * **/
public class DemoSystem {
    public static void main(String[] args) {
        int bt;
        //바이트 단위의 표준 출력
        System.out.println("Test System START");
        try{
            while((bt =System.in.read()) != -1){
                System.out.write(bt);
            }

        }catch(IOException e){
            //에러발생시 에러를 출력한다
            System.err.println(e);
        }
        System.out.println("Test System END");
    }
}
