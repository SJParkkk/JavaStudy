package demo.algoithm.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public List<Integer> solution(int[] array, int[][] commands) {
        ArrayList<Integer> temp_list = new ArrayList<>();
        List<Integer> answer_list = new ArrayList<>();
        for(int[] com : commands) {
            temp_list.clear();
            int start = com[0] - 1;
            int end = com[1];
            int index = com[2] - 1;
            for (int i = start; i < end; i++) {
                temp_list.add(array[i]);
            }
            answer_list.add(
                    temp_list.stream()
                            .sorted()
                            .collect(Collectors.toList())
                            .get(index));
        };
        return answer_list;
    }
    /**
     * Do not change return type
     * **/
    public int[] solution_version2(int[] array, int[][] commands){
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++){
            int start = commands[i][0] - 1;
            int end = commands[i][1];
            int index = commands[i][2] - 1;

            int[] temp = Arrays.copyOfRange(array,start, end);
            Arrays.sort(temp);
            answer[i] = temp[index];

        }
        return answer;
    }
}

public class Knum {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands= {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
//        for (int[] com : commands){
//            Arrays.stream(com).forEach(System.out::println);
//        }

        System.out.println(sol.solution_version2(array, commands));

    }
}
