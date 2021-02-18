package Algorithm;

/**
 * String to int : Integer.ParseInt
 * **/

public class StrToInt {
   public static int solution(String s){
       int answer = Integer.parseInt(s);
       return answer;
   }

    public static void main(String[] args) {
        String str1 = "1234";
        String str2 = "-1234";
        System.out.println(solution(str1));//1234
        System.out.println(solution(str2));//-1234
    }
}
