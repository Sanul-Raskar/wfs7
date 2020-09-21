package com.intermediate;


public class Cat extends DomesticAnimals {
	private String color;
	public Cat()
	{
		color="black";
	}
	public String getColor()
	{
		return color;
	}
	public boolean islivehome()
    {
    	return true;
    }
	@Override
	public boolean canClimb()
    {
 	   return true;
    }
    public void display()
    {
    	System.out.println(" Color : "+getColor());
    	System.out.println(" isLivehome : "+islivehome());
 	   System.out.println(" isVegetarian : "+isVegetarian());
        System.out.println(" canClimb : "+canClimb());
        System.out.println(" canSwim : "+canSwim());
    }
}
