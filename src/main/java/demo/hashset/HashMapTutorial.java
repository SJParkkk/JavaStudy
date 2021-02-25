package demo.hashset;

import java.util.HashMap;

public class HashMapTutorial {
    public static void main(String[] args) {
        HashMap map = new HashMap();
           map.put(1,5);
        map.put(2,3);
        map.put(3,3);
        map.put(4,1);
        map.put(5,3);
        map.put(6,5);
        map.put(7,4);
        map.put(8,2);
        map.put(9,0);
        System.out.println(map.get(1));
//        for (Object o : map.keySet()) {
//            System.out.println(map.get(o));
//        }
    }
}
