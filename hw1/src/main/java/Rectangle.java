public class Rectangle implements Figure{

    int side1;
    int side2;

    public Rectangle(int side1, int side2){
        this.side1 = side1;
        this.side2 = side2;
    }
	@override
    public double square() {
        return side1*side2;
    }
}
