package java8.lambda;

import java.util.function.Consumer;

class Student{
    private int age;
    private String name;

    public static void setAge(int age) {
    }

    public static void setName(String name) {
    }

}

public class MethodReference {
    Student stu1 = new Student();
    Student stu2 = new Student();

    public void demoConstructor(){
        Consumer<String> setName1 = name ->stu1.setName(name);
        Consumer<Integer> setAge1 = age->stu1.setAge(age);

        Consumer<String> setName2 = Student::setName;
        Consumer<Integer> setAge2 = Student::setAge;


    }

}
