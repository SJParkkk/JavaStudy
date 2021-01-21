package Generics;

import java.util.ArrayList;
import java.util.List;

/*
<Product> 로 이뤄진 ArrayList//
class Product
class Tv extends Product{}
class Audio extends Product{}
*
* */
public class GenericDemo {
    public static void main(String[] args) {
        ArrayList<Product> productlist = new ArrayList<Product>();
        productlist.add(new Product("Product 클래스"));
        productlist.add(new Audio("Audio 클래스"));

        Product p = productlist.get(0);
        System.out.println(p.toString());
        Audio o = (Audio) productlist.get(1);
        System.out.println(o.toString());
        ArrayList<Product> list = new ArrayList<Product>();
        ArrayList<TV> tvlist = new ArrayList<TV>();
//        ArrayList<Product> tvList = new ArrayList<TV>();//컴파일 에러
        List<TV> tvList11 = new ArrayList<TV>();

        productlist.add(new TV("tv"));
        productlist.add(new Audio("audio"));
        tvlist.add(new TV("tv1"));
        tvlist.add(new TV("tv2"));

        printAll(productlist);
//        printAll(tvlist);// 컴파일 에러 발생
    }
    private static void printAll(ArrayList<Product> list){
        for(Product p: list){
            System.out.println(p);
        }
    }
}



class Product{
    String name;
    public Product(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                '}';
    }
}
class TV extends Product{

    public TV(String name) {
        super(name);
    }

}
class Audio extends Product{

    public Audio(String name) {
        super(name);
    }
}