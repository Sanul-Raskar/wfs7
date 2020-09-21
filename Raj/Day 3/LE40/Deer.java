package com.intermediate;

public final class Deer extends WildAnimal {
	private final String live;
	public Deer()
	{
		live="herd";
	}
	@Override
	public boolean isVegetarian() {
		// TODO Auto-generated method stub
		return true;
	}
	public String getLive()
	{
		return live;
	}
	public void display()
	{
		System.out.println(" isExtincted : "+isExtincted());
		   System.out.println(" isVegetarian : "+isVegetarian());
	       System.out.println(" canClimb : "+canClimb());
		System.out.println("Lives in : "+getLive());
	}
}
