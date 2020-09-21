package shapes;

public class Triangle {
   private double base,height,hypentuse;

public double getHypentuse() {
	return hypentuse;
}

public void setHypentuse(double hypentuse) {
	this.hypentuse = hypentuse;
}



public Triangle(double base, double height, double hypentuse) {
	super();
	this.base = base;
	this.height = height;
	this.hypentuse = hypentuse;
}

public double getBase() {
	return base;
}

public void setBase(double base) {
	this.base = base;
}

public double getHeight() {
	return height;
}

public void setHeight(double height) {
	this.height = height;
}
public double getArea()
{
	return base*height;
}
public double getPerimeter()
{
	return base+height+hypentuse;
}
}
