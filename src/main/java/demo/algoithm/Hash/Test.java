package demo.algoithm.Hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map<String,Integer> testCompute = new HashMap<>();
        String[] participant2 = {"mislav", "stanko", "mislav", "ana"};
        String[] completion2 ={"stanko", "ana", "mislav"} ;

        for (String com : completion2) {
            testCompute.put(com,testCompute.getOrDefault(com,0) +1);
        }
        for (String part : participant2) {
            //testCompute.put(part, testCompute.getOrDefault(part,0) -1);
            testCompute.put(part, testCompute.get(part) - 1);
        }

//        testCompute.forEach((s, integer) ->{
//            String answer;
//            if(integer != 0){
//                System.out.println(s);
//                answer = s;
//                System.out.println("Test"+ answer);
//            }
//        });
        String answer = "";
        for (Map.Entry<String, Integer> runner : testCompute.entrySet()) {
            if(runner.getValue()!=0){
                answer = runner.getKey();
            }

        }
        System.out.println("complete Runner:" + answer);
        System.out.println(testCompute);

        System.out.println("=========================");
        List<Integer> numList = new ArrayList<>(List.of(1,2,3,4,2,3,4,1,2,3,4));
        Map<Integer, ArrayList<Integer>> testMap = new HashMap<>();
        for (Integer integer : numList) {
            testMap.computeIfAbsent(integer, s-> new ArrayList<>()).add(integer);
        }
        System.out.println(testMap);

    }
}
