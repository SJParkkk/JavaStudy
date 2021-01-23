package DemoStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// int[]에 값을 추가하고 싶으면
public class Stream {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        List<Integer> arrlist = Arrays.stream(arr).boxed().collect(Collectors.toList());
        arrlist.add(100);
        System.out.println(arrlist);

        String[] arr2= {"a","b","c","d","e"};
        List<String> arr2list = Arrays.stream(arr2).collect(Collectors.toList());
//        List<String> arr2list = Arrays.stream(arr2)
//                .map(s -> s.toUpperCase(Locale.ROOT))
//                .toArray(String::);

        arr2list.add("hello");
        System.out.println(arr2list);

    }
}
