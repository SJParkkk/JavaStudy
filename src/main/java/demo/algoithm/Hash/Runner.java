package demo.algoithm.Hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Runner {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        ArrayList<String> runner = new ArrayList<>();
        Map<String, Integer> runnerInfo = new HashMap<>();
        for(String complete: completion){
            runnerInfo.put(complete,1);
        }
        for(String str: participant){
           runnerInfo.computeIfPresent(str, (s, integer) -> --integer);
           runnerInfo.putIfAbsent(str,1);
        }
        runnerInfo.forEach((s, integer) -> {
            if (!integer.equals(0)) {
//                answer = s;
            }
        });
        answer = runner.toString();
        return answer;
    }

    public static void main(String[] args) {
        String[] participant1 = {"leo", "kiki", "eden"};
        String[] completion1 ={"eden", "kiki"} ;
        String[] participant2 = {"mislav", "stanko", "mislav", "ana"};
        String[] completion2 ={"stanko", "ana", "mislav"} ;
        Runner runner = new Runner();
        String answer1= runner.solution(participant1, completion1);//"leo"
        System.out.println(answer1);
        String answer2 =runner.solution(participant2, completion2);//"mislav"
        System.out.println(answer2);
    }

}
