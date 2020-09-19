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

//main Interface
interface  Shape3D{
    float volume();
    float surfaceArea();
};

class Cylinder implements Shape3D{
    float radius,height;  

    public Cylinder(float radius, float height) {
        this.radius = radius;
        this.height = height;
    }
    @Override
     public float volume() {
        return (float) (3.14*radius*radius*height);
    }

    @Override
    public float surfaceArea() {
        return (float)(2*3.14*radius*height)+(float)(2*3.14*radius*radius);
    }
	
}

class Sphere implements Shape3D{
    float radius;  

    public Sphere(float radius) {
        this.radius = radius;
    }
    @Override
    public float volume() {
       return (float) ((float)((float)4/3)*3.14*radius*radius*radius);
    }

    @Override
    public float surfaceArea() {
        return (float)(4*3.14*radius*radius);
    }
	
}

class Cube implements Shape3D{
    float side;  

    public Cube(float side) {
        this.side = side;
    }
    @Override
    public float volume() {
        return side*side*side;
    }

    @Override
    public float surfaceArea() {
        return  6*side*side;
    }
	
}