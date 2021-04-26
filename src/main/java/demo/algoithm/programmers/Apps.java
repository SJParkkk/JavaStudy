package demo.algoithm.programmers;

import java.util.ArrayList;
import java.util.List;

public class Apps {
    public static void main(String[] args) {
        int brown = 50;
        int brown2 =9;
        int yellow = 22;
        int yellow2 = 3;
        Carpet carpet = new Carpet();
//        carpet.solution1(brown, yellow);
//        carpet.solution1(brown2, yellow2);
        carpet.solution2(brown, yellow);
        carpet.solution2(brown2, yellow2);

    }
}

class Carpet {
        public int[] solution1(int brown, int yellow) {
            int flag = brown + yellow;
            int count = (int) Math.sqrt(flag);

            List<Integer> flag_list = new ArrayList<>();
            for (int i = 1; i < count + 1; i++) {
                if (flag % i == 0) {
                    flag_list.add(i);
                    flag_list.add(flag / i);
                }
            }
            System.out.println(flag_list);
            System.out.println(flag_list.size());

            int a = flag_list.get(flag_list.size() - 1);
            int b = flag_list.get(flag_list.size() - 2);
            int[] answer = new int[2];
            answer[0] = a;
            answer[1] = b;
            for (int i : answer) {
                System.out.println(i);
            }
            return answer;
        }

        public int[] solution2(int brown, int yellow) {
            int count = (int) Math.sqrt(yellow);
            for (int i = 1; i < count + 1; i++) {
                if (yellow % i == 0) {
                    if (2*(i + yellow/i) == brown-4) {
                        return new int[]{yellow/i +2, i + 2};
                    }
                }

            }
            return null;
        }
    }
