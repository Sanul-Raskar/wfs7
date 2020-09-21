package shapes;

public class Square {
     private double side;

	public Square(double side) {
		super();
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}
	public double getArea()
    {
    	return side*side;
    }
    public double getPerimeter()
    {
    	return 4*side;
    } 
}
