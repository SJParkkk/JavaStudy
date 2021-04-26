package java8.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class DemoFilter {
    public static boolean test(int i){
        return i < 3;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList(List.of(1,2,3));
        List<Integer> answer = arr1.stream().filter(a->test(a)).collect(Collectors.toList());
    }
}
