package generics;

import java.util.ArrayList;
import java.util.Iterator;

class Student{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
public class DemoIterator_version2 {
    public static void main(String[] args) {
        ArrayList<Student> friend = new ArrayList<>();
        friend.add(new Student("박소정", 26));
        friend.add(new Student("유제원", 27));
        friend.add(new Student("안지훈", 31));
        Iterator it = friend.iterator();
        while(it.hasNext()){
            Student s = (Student)it.next();// Student로 형변환 해야됨,,
            System.out.println(s.getName());
        }
        System.out.println("=================================");
        Iterator<Student> it_gen = friend.iterator();// 제네릭으로 타입 매개변수를 지정해주면 형변환 생략 가
        while(it_gen.hasNext()){
            Student s = it_gen.next();
            System.out.println(s.getName());
        }
    }

}
