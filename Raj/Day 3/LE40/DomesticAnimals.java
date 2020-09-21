package com.intermediate;

public class DomesticAnimals  {
    public boolean islivehome()
    {
    	return true;
    }
    public boolean isVegetarian()
    {
 	   return false;
    }
    public boolean canClimb()
    {
 	   return false;
    }
    public boolean canSwim()
    {
    	return false;
    }
    public void display()
    {
    	System.out.println(" isLivehome : "+islivehome());
 	   System.out.println(" isVegetarian : "+isVegetarian());
        System.out.println(" canClimb : "+canClimb());
        System.out.println(" canSwim : "+canSwim());
    }
}
