package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**Stream 이란
 * - 연속된 데이터를 처리하는 오퍼레이션들의 모임
 *  sequence of element
 *  Stream pipline : 처리를 한번만 한다 데이터가 처리를 한번만 지나간다는 것
 *  자체가 데이터가 아님 데이터를 소스로 사용해서 처리를 하는 것
 *  Funtional in nature : src를 변경하지 않는다.
 *  데이터가 무제한 일수도 있음 : Short Circuit(무제한이지만 처음에 오는 10개 데이터만 다루겠다)
 *  중개 오퍼레이션(계속 이어짐 : lazy함 return Stream): lazy하다는게 뭐야?
 *  종료 오퍼레이션(return not Stream):
 *
 * **/
public class App {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Keesun");
        names.add("whiteship");
        names.add("toby");
        names.add("foo");

        Stream<String> stringStream = names.stream()
                .map(String::toUpperCase);
        // 중개형 오퍼레이터는 종료형 오퍼레이터 올 때 까지 출력이 안됨 정의만 한 것 뿐
        System.out.println("================중개형 오퍼레이터를 사용했을 떄================");
        names.stream().map(s -> {
            System.out.println(s);
            return s.toUpperCase(Locale.ROOT);
        });
        System.out.println("================종료형 오퍼레이터를 사용했을 떄================");
        List<String> collect = names.stream().map(s -> {
            System.out.println(s);
            return s.toUpperCase(Locale.ROOT);
        }).collect(Collectors.toList());
        System.out.println("리스트를 출력해보면"+ collect);// list 전체를 묶어서 출력 왜냐면 담는게 리스트니깐
        collect.forEach(System.out::println);
        System.out.println("=================원본 데이터의 출력 결과====================");
        // 원본 데이터는 그대로 소문자로 남아있는다.
        names.forEach(System.out::println);
        System.out.println("=================Stream 을 구지 쓰는 경우: 병렬 처리 가능====================");
        // 병렬 처리 context switching 비용이 많이 들수도 잇어
        // 데이터가 정말 방대하게 큰 경우만 병렬 처리가 효과적일 수 있음
        List<String> collect1 = names.parallelStream().map(s -> {
            System.out.println(s + "  " + Thread.currentThread().getName());
            return s.toUpperCase(Locale.ROOT);
        }).collect(Collectors.toList());
        collect1.forEach(System.out::println);
    }
}
