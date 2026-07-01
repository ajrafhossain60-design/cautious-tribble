class Shape {
    int area(int length, int width) {
        return length * width;
    }

    double area(double radius) {
        return Math.PI * radius * radius;
    }
}

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println("Area of Rectangle: " + shape.area(10, 5));
        System.out.println("Area of Circle: " + shape.area(7.0));
    }
}
