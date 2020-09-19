package inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Shape sh=new Square(5);
        System.out.println("Square Area : "+sh.area());
        System.out.println("Square Perimeter : "+sh.perimeter());
        sh=new Rectangle(7, 8);
        System.out.println("Rectangle Area : "+sh.area());
        System.out.println("Rectangle Perimeter : "+sh.perimeter());
	}

}
