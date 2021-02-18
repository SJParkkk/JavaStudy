package demo.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

/**
 * ByteStreamInput class, ByeStreamOutput class를 활용하여
 * 1..input 데이터를 읽어 temp 배열 만든 후 , temp 배열의 3번째 부터 5개 출
 *  read() 함수, write() 함수
 * 2..inSrc 바이트 배열을 통해 outSrc 바이트 배열 생성
 *
 * 바이트배열의 특징
 * - 사용하는 resource(메모리)
 * - 메모리만을 사용하는 자원 특징 : 가비지 컬렉터에 의해 자동적으로 자원을 반환
 * ** 스트림의 특징 : 단방향성 연속적인 데이터의 흐름! **
 * - 그래서 한번 사용한 자원은 알아서 소멸!! 아래의 코드를 보면 입력받는 값을 하나로 재사용 하였는데 한번 사용한 자원은 반환되므로
 *  input2의 존재에 따라 output 출력값이 달라진다 (사용되지 않은 자원만을 반환)
 * - 다른 자원과 달리 close()로 스트림을 닫지 않아도 됨
 * **/

public class DemoStreamIO {
    public static void main(String[] args) {
        byte[] inSrc = {1,2,3,4,5,6};
        byte[] outSrc = null;
        byte[] outCustomize = null;
        byte[] temp = new byte[10]; //읽어온 데이터를 담을 배열 초기 생성

        ByteArrayInputStream input = new ByteArrayInputStream(inSrc);
        //input2가 없으면 사용되지 않은 지원만 outSrc로 저장이 된다.
//        ByteArrayInputStream input2 = new ByteArrayInputStream(inSrc);
        ByteArrayOutputStream outputOrigin = new ByteArrayOutputStream();
        ByteArrayOutputStream outputTemp = new ByteArrayOutputStream();

        input.read(temp, 5,5); // 읽어온 데이터를 배열 temp에 담는다 off(index 시작점),len 시작점으로부터 갯수
        outputTemp.write(temp, 3, 5);
        outCustomize = outputTemp.toByteArray();

        int data = 0;
        while((data = input.read()) != -1)
            outputOrigin.write(data);
        outSrc = outputOrigin.toByteArray();


        System.out.println("Temp : "+Arrays.toString(temp));
        System.out.println("OutputCustomize : "+ Arrays.toString(outCustomize));
        System.out.println("Input Source:" + Arrays.toString(inSrc));
        System.out.println("OutputOrigin Source:" + Arrays.toString(outSrc));
    }
}
