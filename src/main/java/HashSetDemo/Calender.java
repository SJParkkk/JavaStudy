package HashSetDemo;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.HashMap;

/*
    2016년 1월 1일은 금요일입니다. 2016년 a월 b일은 무슨 요일일까요? 두 수 a ,b를 입력받아 2016년 a월 b일이 무슨 요일인지 리턴하는 함수,
    solution을 완성하세요. 요일의 이름은 일요일부터 토요일까지 각각 SUN,MON,TUE,WED,THU,FRI,SAT
    입니다. 예를 들어 a=5, b=24라면 5월 24일은 화요일이므로 문자열 TUE를 반환하세요.
* */
// 1일 ,2일, 3일 , 4일, 5일 달 별로 월요일이 다르겟지? -> 이걸 어떻게 바꿀지가
public class Calender {
    public static HashMap<String,String> map = new HashMap<>();

    public Calender() {
        map.put("a","c");
    }

    public enum Weekday{
        MON, TUE, WED, THR, FRI, SAT, SUN
    }


    public static String JanuarySolution (int a, int b) {
        int [] intlist ={1,2,3};


        DayOfWeek dayOfWeek = LocalDate.of(2016, a, b).getDayOfWeek();
        String name = dayOfWeek.name();
        System.out.println(name);
        return name;
    }


    public static void main(String[] args) {
//        InputStream
//        try( Scanner scanner =  new Scanner(System.in)) {
//        }catch (Exception e){
//
//
//        }

    }
    }
        //        Weekday answer = date.JanuarySolution(1,24);
//        Weekday answer2 = date.FebuarySolution(2,19);
//        System.out.println(answer);
//        System.out.println(answer2);
//    }

