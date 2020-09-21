package shapes;

public class TestShapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Circle c=new Circle(20.0);
        System.out.println("Circle Area : "+c.getArea());
        System.out.println("Circle Circumference : "+c.getPerimeter());
        Square sq=new Square(10);
        System.out.println("Square Area : "+sq.getArea());
        System.out.println("Square Perimeter : "+sq.getPerimeter());
        Triangle tr=new Triangle(10,20,35);
        System.out.println("Triangle Area : "+tr.getArea());
        System.out.println("Triangle Perimeter : "+tr.getPerimeter());
	}

}
