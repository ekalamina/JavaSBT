public class Circle implements Figure {

    int radius;

    final double pi = 3.1415;

    public Circle(int radius){
        this.radius = radius;
    }
	
	@override
    public double square() {
        return pi*radius*radius;
    }
}
