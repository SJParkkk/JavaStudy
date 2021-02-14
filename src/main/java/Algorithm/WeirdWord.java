package Algorithm;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class WeirdWord {
    public static String solution(String s){
        List<String> arr;
        arr = Arrays.asList(s.split(""));
        System.out.println(arr);
        String answer = "";
        int flag = 0;
        for (String e : arr) {
            if(e == " "){
                answer += e;
                flag = 0;
                continue;
            }
            else if(flag % 2 == 0){
                answer += e.toUpperCase(Locale.ROOT);
            }
            else
                answer += e.toLowerCase(Locale.ROOT);
            flag++;
        }
        return answer;
    }

    public static void main(String[] args) {
        String s = "try hello world";
        System.out.println(solution(s));// TrY HeLlO WoRlD
    }
}
