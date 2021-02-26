package generics.hashmap;

import java.util.HashMap;


public class Apps {
    public static void main(String[] args) {
        HashMap<String, Integer> testHash = new HashMap<>();
        testHash.put("thwjd",100);
        testHash.put("test", 200);
        testHash.put("query", 300);
        Integer b = testHash.remove("test");
        System.out.println(b);
        Integer a = testHash.get("thwjd");
        System.out.println(a);

    }
}
