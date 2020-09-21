package org.animals;

public class Monkey {
	private String color;
    private int age;
    public Monkey(String color, int age) {
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
	public void setAge(int age) {
		this.age = age;
	}
    public boolean isVegetarian()
    {
    	return true;
    }
    @Override
	public String toString() {
		return "Monkey [color=" + color + ", age=" + age + ", isVegetarian()=" + isVegetarian() + ", canClimb()="
				+ canClimb() + ", sound()=" + sound() + "]";
	}
	public boolean canClimb()
    {
    	return true;
    }
    public String sound()
    {
    	return "chatter";
    }
}
