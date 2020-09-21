package com.animal;

public class Display {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Animal a1=new Tiger();
        Animal a2=new Lion();
        Animal a3=new Monkey();
        Animal a4=new Giraffe();
        Animal a5=new Elephant();
        Animal a6=new Deer();
        System.out.println("\n ---- ");
        System.out.println(a1.getClass().getSimpleName());
        System.out.println(" isVegetarian : "+a1.isVegetarian());
        System.out.println(" canClimb : "+a1.canClimb());
        System.out.println("\n ---- ");
        System.out.println(a2.getClass().getSimpleName());
        System.out.println(" isVegetarian : "+a2.isVegetarian());
        System.out.println(" canClimb : "+a2.canClimb());
        System.out.println("\n ---- ");
        System.out.println(a3.getClass().getSimpleName());
        System.out.println(" isVegetarian : "+a3.isVegetarian());
        System.out.println(" canClimb : "+a3.canClimb());
        System.out.println("\n ---- ");
        System.out.println(a4.getClass().getSimpleName());
        System.out.println(" isVegetarian : "+a4.isVegetarian());
        System.out.println(" canClimb : "+a4.canClimb());
        System.out.println("\n ---- ");
        System.out.println(a5.getClass().getSimpleName());
        System.out.println(" isVegetarian : "+a5.isVegetarian());
        System.out.println(" canClimb : "+a5.canClimb());
        System.out.println("\n ---- ");
        System.out.println(a6.getClass().getSimpleName());
        System.out.println(" isVegetarian : "+a6.isVegetarian());
        System.out.println(" canClimb : "+a6.canClimb());
	}

}
