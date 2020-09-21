package com.intermediate;

public final class Dog extends DomesticAnimals {
    private String breed;
    public Dog()
    {
    	breed="German Shephard";
    }
    public String getBreed()
    {
    	return breed;
    }
	@Override
	public boolean canSwim() {
		// TODO Auto-generated method stub
		return true;
	}
    public void display()
    {
    	System.out.println(" Breed : "+getBreed());
    	System.out.println(" isLivehome : "+islivehome());
 	   System.out.println(" isVegetarian : "+isVegetarian());
        System.out.println(" canClimb : "+canClimb());
        System.out.println(" canSwim : "+canSwim());
    }
}
