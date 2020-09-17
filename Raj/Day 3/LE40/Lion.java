package com.intermediate;

public final class Lion extends WildAnimal {
	private final String live;
	public Lion()
	{
		live="family";
		
	}
	public String getLive()
	{
		return live;
	}
	 public boolean isExtincted()
	   {
		   return true;
	   }
	 public void display()
	 {
		 System.out.println(" isExtincted : "+isExtincted());
		   System.out.println(" isVegetarian : "+isVegetarian());
	       System.out.println(" canClimb : "+canClimb());
		 System.out.println("Lives in : "+getLive());
	 }
}
