// 
public class Rectangle {
	private int mLength;
	private int mWidth;
  public Rectangle(int length, int width) {
  	// putting our attribute to the constructor
  	mLength = length;
  	mWidth = width;
  }
  public boolean isSquare() {
  	return mLength == mWidth;
  }

  // implement get method
  public int getLength(){
  	return mLength;
  }
  public int getWidth(){
  	return mWidth;
  }


}