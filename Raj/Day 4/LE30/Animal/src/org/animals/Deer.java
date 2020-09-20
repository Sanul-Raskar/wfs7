package org.animals;

public class Deer {
       private String color;
       private int age;
       public Deer(String color, int age) {
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
   	@Override
	public String toString() {
		return "Deer [color=" + color + ", age=" + age + ", isVegetarian()=" + isVegetarian() + ", canClimb()="
				+ canClimb() + ", sound()=" + sound() + "]";
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
       public boolean canClimb()
       {
       	return false;
       }
       public String sound()
       {
       	return "soft";
       }
}
