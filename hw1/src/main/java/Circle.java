public class Circle {

    int radius;

    final double pi = 3.1415;

    public Circle(int radius){
        this.radius = radius;
    }

    public double square() {
        return pi*radius*radius;
    }
}
