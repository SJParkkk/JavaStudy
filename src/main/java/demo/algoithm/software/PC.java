package demo.algoithm.software;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class PC {
    public static void main(String[] args) {
//        String input = null;
//        Scanner sc = new Scanner(System.in);
//        input = sc.nextLine();
//
//        String[] info = input.split("");
//
//        Arrays.asList(info);
//        System.out.println(info);
        ArrayList<Integer> list1 = new ArrayList(List.of(2,3,5));
        int[] flag = new int[list1.size()];
        ArrayList<Integer> answer_list = new ArrayList<>();
        powerSet(answer_list,list1, flag, 0);
        List<Integer> tt = answer_list.stream().filter(s ->s<=4).collect(Collectors.toList());
        Integer answer = Collections.max(tt);
        System.out.println(answer);

    }
    private static void powerSet(ArrayList<Integer> answer_list,ArrayList<Integer> list1, int[] flag, int n){
        if(n == list1.size()){
            printData(answer_list,list1, flag);
            return;
        }

        flag[n] = 1;
        powerSet(answer_list,list1, flag, n+1);

        flag[n] = 0;
        powerSet(answer_list,list1,flag, n+1);
    }
    private static void printData(ArrayList<Integer> answer_list,ArrayList<Integer> list1, int[] flag) {
        int sum = 0;
        for (int i = 0; i < flag.length; i++) {
            if(flag[i] ==1){
                sum += list1.get(i);

                System.out.print(list1.get(i));
            }
        }
//        answer_list.add(sum);
//        return answer_list;
//        System.out.println(" ");
//        System.out.println(sum);
        System.out.println("-");
        answer_list.add(sum);
        return;
    }
}
