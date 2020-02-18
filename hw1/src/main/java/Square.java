public class Square implements Figure{

    int side;

    public Square(int side){
        this.side = side;
    }
	
	@override
    public double square() {
        return side*side;
    }
}
