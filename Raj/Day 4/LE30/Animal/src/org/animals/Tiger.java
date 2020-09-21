package org.animals;

public class Tiger {
      private String color;
      private int age;
	public Tiger(String color, int age) {
		super();
		this.color = color;
		this.age = age;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		return "Tiger [color=" + color + ", age=" + age + ", isVegetarian()=" + isVegetarian() + ", canClimb()="
				+ canClimb() + ", sound()=" + sound() + "]";
	}
	public void setAge(int age) {
		this.age = age;
	}
    public boolean isVegetarian()
    {
    	return false;
    }
    public boolean canClimb()
    {
    	return false;
    }
    public String sound()
    {
    	return "roar";
    }
}
