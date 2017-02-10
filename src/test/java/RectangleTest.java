import org.junit.*;
import static org.junit.Assert.*;

public class RectangleTest {
// this creates an instance of class rectangle
  @Test
  public void newRectangle_instantiatesCorrectly() {
    Rectangle testRectangle = new Rectangle(2, 4);
    assertEquals(true, testRectangle instanceof Rectangle);
  }
// tests if it can get values of the triangle
  @Test
  public void newRectangle_getsLength_2() {
    Rectangle testRectangle = new Rectangle(2, 4);
    assertEquals(2, testRectangle.getLength());
  }
  @Test
  public void getWidth_getsRectangleWidth_4() {
    Rectangle testRectangle = new Rectangle(2, 4);
    assertEquals(4, testRectangle.getWidth());
  }
  // confirms our rectangle is not a square
  @Test
  public void isSquare_whenNotASqure_false() {
  	Rectangle testRectangle = new Rectangle(2, 4);
  	assertEquals(false, testRectangle.isSquare());
  }
  // confirms when a triangle is a square
  
  @Test
public void isSquare_allSidesEqual_true() {
  Rectangle testRectangle = new Rectangle(2, 2);
  assertEquals(true, testRectangle.isSquare());
}
}