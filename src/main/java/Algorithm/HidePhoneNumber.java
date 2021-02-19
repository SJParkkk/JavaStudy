package Algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * List<String></String>
 * 보다 char[]로 접근하는 방법
 * toCharArray
 * String.ValueOf(ch)**/
public class HidePhoneNumber {
    public static String hidePhone(String phone_number){
        List<String> arr  = Arrays.asList(phone_number.split(""));
        List<String> answer = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
             if(i < arr.size() - 4){
                 answer.add("*");
             }
             else{
                 answer.add(arr.get(i));
             }
        }
        return String.join("", answer);
    }
    public static String hidePhone2(String Ph){
        char[] ch = Ph.toCharArray();
        for (int i = 0; i < ch.length - 4; i++) {
            ch[i] = '*';
        }
        return String.valueOf(ch);
    }

    public static void main(String[] args) {
        String a = "010333344444";
        String b = "027778888";
        System.out.println(hidePhone(a));// "********4444"
        System.out.println(hidePhone(b));// "*****8888"
        System.out.println(hidePhone2(a));// "********4444"
        System.out.println(hidePhone2(b));// "*****8888"
    }
}

