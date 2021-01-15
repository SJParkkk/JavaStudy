package HashSetDemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
//todo HashSet의 기본 로직 : 중복된 요소를 저장하지 않는다
// "1" vs Integer(1) : 다른 객체로 간주함
public class Example1 {
    public static void main(String[] args) {
        Set set = new HashSet();
        Object[] objArr = {"1", new Integer(1), "2","2","3","3","4","4","4"};
        for (int i = 0; i < objArr.length; i++) {
            set.add(objArr[i]);
        }
        Iterator it = set.iterator();
        System.out.println(it);
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
