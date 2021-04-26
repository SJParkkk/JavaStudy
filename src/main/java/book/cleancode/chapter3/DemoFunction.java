package book.cleancode.chapter3;

import static java.lang.String.format;

class OutputStream{
    public void writeField(String name){
        System.out.println(name);
    }
}
class Circle{
    public void makeCircle(double x, double y, double radius){};
    public void makeCircle_v2(Point center, double radius){};
}

class Point{
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class DemoFunction {
    public static void main(String[] args) {
        OutputStream outputStream = new OutputStream();
        outputStream.writeField("소정");

        Circle circle = new Circle();
        circle.makeCircle(1.0,1.0, 3);

        Point center = new Point(2,2);
        circle.makeCircle_v2(center, 3);

        String name = "소정";
        float hours = 8;
        String message = format("%s worked %.2f hours", name, hours);
        System.out.println(message);
    }
}
