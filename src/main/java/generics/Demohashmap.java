package generics;

import java.util.HashMap;

public class Demohashmap {
    public static void main(String[] args) {
        //hashMap의 put 메소드에 들어가는 타입을 지정
        HashMap<String, Order> map =new HashMap<String, Order>();
        map.put("소정", new Order("hot-choco", 5000, 3));
        map.put("영범", new Order("IceAmeri",4100,5));
        System.out.println(map.get("소정").menu);
        System.out.println(map.get("영범").menu);

    }
}
