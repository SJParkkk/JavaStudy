package java8.functional;

public class DefaultFoo implements Foo{
    String name;

    public DefaultFoo(String name) {
        this.name = name;
    }

    @Override
    public void printNameUpperCase() {
        System.out.println("재정의가 가능하다");
    }

    @Override
    public void printName() {
        System.out.println(this.name);

    }

    @Override
    public String getName() {
        return this.name;
    }
}
