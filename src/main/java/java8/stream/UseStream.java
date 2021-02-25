package java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UseStream {
    public static void main(String[] args) {
        List<OnlineClass> springClasses = new ArrayList<>();
        springClasses.add(new OnlineClass(1,"springboot",true));
        springClasses.add(new OnlineClass(2,"spring data jpa",true));
        springClasses.add(new OnlineClass(3,"spring mvc",false));
        springClasses.add(new OnlineClass(4,"spring core",false));
        springClasses.add(new OnlineClass(5,"rest api developer",false));

        List<OnlineClass> javaClasses = new ArrayList<>();
        javaClasses.add(new OnlineClass(1,"The java, test", true));
        javaClasses.add(new OnlineClass(2,"The java, code manipulation", true));
        javaClasses.add(new OnlineClass(3,"The java, 8 to 11", false));

        List<List<OnlineClass>> keesunEvents = new ArrayList<>();
        keesunEvents.add(javaClasses);
        keesunEvents.add(springClasses);

        System.out.println("spring으로 시작하는 수업");
        List<OnlineClass> spring = springClasses.stream()
                .filter(onlineClass -> onlineClass.getTitle().startsWith("spring"))
                .collect(Collectors.toList());
        spring.forEach(onlineClass -> System.out.println(onlineClass.getTitle()));
        System.out.println("====================================");
        springClasses.stream()
                .filter((oc)->oc.getTitle().startsWith("spring"))
                .forEach(onlineClass -> System.out.println(onlineClass.getTitle()));

        System.out.println("close 되지 않는 수업");
        List<OnlineClass> notClosedClass = springClasses.stream()
                .filter(onlineClass -> !onlineClass.isClosed())
                .collect(Collectors.toList());
        notClosedClass.forEach(onlineClass -> System.out.println(onlineClass.getTitle()));
        System.out.println("======================================");
        springClasses.stream()
                .filter(onlineClass -> ! onlineClass.isClosed())
                .forEach(onlineClass -> System.out.println(onlineClass.getTitle()));
        System.out.println("===============메소드 레퍼런스=================");
        springClasses.stream()
                .filter(Predicate.not(OnlineClass::isClosed))
                .forEach(oc -> System.out.println(oc.getTitle()));

        System.out.println("수업 이름만 모아서 스트림 만들기");
        Stream<String> stringStream = springClasses.stream().map(OnlineClass::getTitle);
        springClasses.stream()
                .map(oc-> oc.getTitle())
                .forEach(s -> System.out.println(s));// 메서드 레퍼런스로 변경 가능

        System.out.println("두 수업 목록에 들어있는 모든 수업 아이디 출력");
        keesunEvents.stream().flatMap(list ->list.stream())
                .forEach(oc -> System.out.println(oc.getId()));

        System.out.println("10부터 1씩 증가하는 무제한 스트림 중에서 앞에서 10개 뺴고 최대 10개 까지만");
        Stream.iterate(10, i -> i +1)
                .skip(10)
                .limit(10)
                .forEach(System.out::println);

        System.out.println("자바 수업중에 test가 들어있는 수업");
        boolean test = javaClasses.stream().allMatch(oc -> oc.getTitle().contains("test"));
        System.out.println(test);
        System.out.println("스프링 수업 중에 제목이 spring이 들어간 제목만 모아서 리스트로 만들기");
        List<String> spring1 = springClasses.stream().filter(oc -> oc.getTitle().contains("spring"))
                .map(OnlineClass::getTitle)
                .collect(Collectors.toList());
        spring1.forEach(System.out::println);
    }
}
