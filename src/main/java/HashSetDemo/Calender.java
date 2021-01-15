package HashSetDemo;

import java.util.HashMap;

/*
    2016년 1월 1일은 금요일입니다. 2016년 a월 b일은 무슨 요일일까요? 두 수 a ,b를 입력받아 2016년 a월 b일이 무슨 요일인지 리턴하는 함수,
    solution을 완성하세요. 요일의 이름은 일요일부터 토요일까지 각각 SUN,MON,TUE,WED,THU,FRI,SAT
    입니다. 예를 들어 a=5, b=24라면 5월 24일은 화요일이므로 문자열 TUE를 반환하세요.
* */
//todo 1월 달만 먼저 만들어보기
// 각 달별로 첫번째 월요일 구해서 HashSet저장
public class Calender {
    public enum Weekday{
        MON, TUE, WED, THR, FRI, SAT, SUN
    }
    HashMap MonOfMonth = new HashMap();
        MonOfMonth.put(1,5);
        MonOfMonth.put(2,3);
        MonOfMonth.put(3,3);
        MonOfMonth.put(4,1);
        MonOfMonth.put(5,3);
        MonOfMonth.put(6,5);
        MonOfMonth.put(7,4);
        MonOfMonth.put(8,2);
        MonOfMonth.put(9,0);
        MonOfMonth.put(10,5);
        MonOfMonth.put(11,4);
        MonOfMonth.put(12,3);

    public Weekday JanuarySolution (int a, int b){
        Weekday Day = null;
        switch ((a+b) % 7){
            case 0: Day = Weekday.WED;
                break;
            case 1: Day = Weekday.THR;
                    break;
            case 2: Day = Weekday.FRI;
                break;
            case 3: Day = Weekday.SAT;
                break;
            case 4: Day = Weekday.SUN;
                break;
            case 5: Day = Weekday.MON;
                break;
            case 6: Day = Weekday.TUE;
                break;
        }
        return Day;
    }
    public Weekday FebuarySolution(int a, int b){
        Weekday Day = null;
        switch ((a+b) % 7){
            case 0: Day = Weekday.FRI;
                break;
            case 1: Day = Weekday.SAT;
                break;
            case 2: Day = Weekday.SUN;
                break;
            case 3: Day = Weekday.MON;
                break;
            case 4: Day = Weekday.TUE;
                break;
            case 5: Day = Weekday.WED;
                break;
            case 6: Day = Weekday.THR;
                break;
        }
        return Day;
    }


    public static void main(String[] args) {
        Calender date = new Calender();
        //        Weekday answer = date.JanuarySolution(1,24);
//        Weekday answer2 = date.FebuarySolution(2,19);
//        System.out.println(answer);
//        System.out.println(answer2);
//    }
}
