package inheritance;

public class Square extends Shape {
       int side;
       public int getSide() {
		return side;
	}
	public void setSide(int side) {
		this.side = side;
	}
	public Square(int side)
       {
    	   this.side=side;
       }
	public int area()
    {
    	return side*side;
    }
    public int perimeter()
    {
    	return 4*side;
    }
}
