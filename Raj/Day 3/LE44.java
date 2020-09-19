class Main{
    public static void main(String arr[]){
        Line line = new Line(10);
        line.drawingColor();
        line.fillingColor();
        Circle circle = new Circle(5);
        circle.thickness();
        circle.size();
        Square square = new Square(10);
        square.drawingColor();
        square.size();
    }
}
interface  Drawable {
    void drawingColor();
    void thickness();
};
interface  Fillable  {
    void fillingColor();
    float size();
};

class Line implements Drawable,Fillable{
    int length;

    public Line() {
    }

    public Line(int length) {
        this.length = length;
    }
    @Override
    public void drawingColor() {
        System.out.println("Drawing Color on Line");
    }

    @Override
    public void thickness() {
        System.out.println("thikness of Line");
    }

    @Override
    public void fillingColor() {
        System.out.println("paint filled on Line");
    }

    @Override
    public float size() {
        return length;
    }
}
    
class Circle implements Drawable,Fillable{
    int radius;

    public Circle() {
    }

    public Circle(int radius) {
        this.radius = radius;
    }
    @Override
    public void drawingColor() {
        System.out.println("Drawing Color on Cricle");
    }

    @Override
    public void thickness() {
        System.out.println("thikness of Circle");
    }

    @Override
    public void fillingColor() {
        System.out.println("paint filled on Circle");
    }

    @Override
    public float size() {
        return (float) (2*3.14*radius);
    }
}

class Square implements Drawable,Fillable{
    int side;
    @Override
    public void drawingColor() {
        System.out.println("Drawing Color on Squre");
    }

    public Square() {
    }

    public Square(int side) {
        this.side = side;
    }

    @Override
    public void thickness() {
        System.out.println("thikness of Square");
    }

    @Override
    public void fillingColor() {
        System.out.println("paint filled on Square");
    }

    @Override
    public float size() {
        return side*side;
    }
}

   