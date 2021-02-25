package generics;

import java.util.ArrayList;
import java.util.Iterator;

/*
* 제네릭스를 사용하는 경우 vs 제네릭스를 사용하지 않는 경우
* */
public class DemoIterator {
    public static void main(String[] args) {
    //제네릭스를 사용하는 경우
        ArrayList<Order> orderlist = new ArrayList<>();
        orderlist.add(new Order("Americano",4100,3));
        orderlist.add(new Order("Latte",4600,1));

        //이런 식으로 Object로 잡게되면 order객체에 있는 menu에 접근하기 위해선 형변환을 한번 거쳐야함 !
        ArrayList orderlist2 = new ArrayList();
        orderlist2.add(new Order("a",4100,3));
        for(Object o : orderlist2){
            Order s = (Order) o;
            System.out.println(s.menu);
        }
        System.out.println(orderlist2);

//        Iterator<Order> it = orderlist.iterator();
//        while(it.hasNext()){
//            Order order = it.next();
//            System.out.println(order.menu);
//        }
        Iterator it = orderlist.iterator();// 제네릭스를 사용하지 않으면 orderList에 있는 객체가 Object타입으로 넘어오게 된다
        // Iterator의 타입이 지정되지 않았으므로 Object 가 됨
        while(it.hasNext()){
            Order order = (Order)it.next();
            System.out.println(order.menu);
        }
    }
}
class Order{
    String menu;
    int price;
    int num;

    public Order(String menu, int price, int num) {
        this.menu = menu;
        this.price = price;
        this.num = num;
    }
}