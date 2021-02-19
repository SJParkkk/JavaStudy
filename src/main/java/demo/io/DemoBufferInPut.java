package demo.io;

import java.io.*;

/**
 *  보조스트림 : Stream 의 기능을 보완하기 위한 보조스트림
 *  실제 데이터를 주고받는 스트림이 아니므로
 *  FilterStream 의 자손들
 *  그 중 Buffer 를 이용한 성능 향상
 *  버퍼를 이용해 여러 바이트를 입출력하는 것이 효율적
 *  외부 입력 소스로 부터 읽는 것보다 내부의 버퍼로 부터 읽는 것이 성능이 좋다.
 *  Buffer 가 가득 찼을 때에만 출력하므로 bufferOutputStrem close() flush()로 버퍼를 비워줘야 한다
 *  -> try with resource
 *  **/
public class DemoBufferInPut {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "/Users/sjpark/IdeaProjects/JavaStudy/123.txt";
        try{
            FileOutputStream file = new FileOutputStream(path);// 출력은 FileOutputStream이 구현
            BufferedOutputStream bos = new BufferedOutputStream(file,2);
            for (int i = '1'; i <= '9'; i++) {
                bos.write(i);
            }
            file.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
