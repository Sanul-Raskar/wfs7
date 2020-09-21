class Main{
    public static void main(String arr[]){
        Cylinder c = new Cylinder(3,10);
        System.out.println("Volume of Cylinder: "+c.volume()+" and surface area: "+c.surfaceArea());
        Sphere sphere = new Sphere(3);
        System.out.println("Volume of Sphere: "+sphere.volume()+" and surface area: "+sphere.surfaceArea());
        Cube cube = new Cube(3);
        System.out.println("Volume of Cube: "+cube.volume()+" and surface area: "+cube.surfaceArea());
    }
}
abstract class Shape3D{
	abstract float volume();
        abstract float surfaceArea();
};

class Cylinder extends Shape3D{
    float radius,height;  

    public Cylinder(float radius, float height) {
        this.radius = radius;
        this.height = height;
    }
    @Override
    float volume() {
        return (float) (3.14*radius*radius*height);
    }

    @Override
    float surfaceArea() {
        return (float)(2*3.14*radius*height)+(float)(2*3.14*radius*radius);
    }
	
}

class Sphere extends Shape3D{
    float radius;  

    public Sphere(float radius) {
        this.radius = radius;
    }
    @Override
    float volume() {
       return (float) ((float)((float)4/3)*3.14*radius*radius*radius);
    }

    @Override
    float surfaceArea() {
        return (float)(4*3.14*radius*radius);
    }
	
}

class Cube extends Shape3D{
    float side;  

    public Cube(float side) {
        this.side = side;
    }
    @Override
    float volume() {
        return side*side*side;
    }

    @Override
    float surfaceArea() {
        return  6*side*side;
    }
	
}