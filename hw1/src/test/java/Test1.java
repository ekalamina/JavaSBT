import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class Test1 {
    @Test
    public void testCircle(){
        Figure circle = new Circle(5);
        assertThat(circle.square(),is(78.53750000000001));
    }
    @Test
    public void testSquare(){
        Figure square = new Square(5);
        assertThat(square.square(),is(25.));
    }
    @Test
    public void testRect(){
        Figure rectangle = new Rectangle(5,6);
        assertThat(rectangle.square(),is(30.));
    }
}
