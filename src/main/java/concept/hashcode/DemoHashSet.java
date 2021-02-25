package concept.hashcode;

import java.util.HashSet;
import java.util.Objects;

/**
 * 자바에서 객체는 hashCode()로 객체를 비교한다
 * 객체의 내용이 같아도 hashCode 때문에 다른 객체로 인식한다.
 * equals()와 hashCode() 매소드를 오버라이딩 하면 한번만 들어간다
 * set.add하기 전에 내부적으로 equals() hashCode()를 호출함
 * **/
public class DemoHashSet {
    public static void main(String[] args) {
        System.out.println("test");
        HashSet set = new HashSet();
        set.add("abc");
        set.add("abc");
        set.add(new Person("소정", 26));
        set.add(new Person("소정", 26));
        set.add(new Person("영숙", 56));

        System.out.println(set);

    }

}
class Person{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    @Override
    public boolean equals(Object obj){
        if(!(obj instanceof Person)) return false;
        Person p = (Person)obj;
        return name.equals(p.name) && age == p.age;
    }
    @Override
    public int hashCode(){
        return Objects.hash(name,age);
    }
}
