package com.intermediate;

public class Display {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WildAnimal a1=new Deer();
        WildAnimal a2=new Lion();
        DomesticAnimals a3=new Dog();
        DomesticAnimals a4=new Cat();
        System.out.println("\n ---- ");
        System.out.println(a1.getClass().getSimpleName());
        a1.display();
        System.out.println("\n ---- ");
        System.out.println(a2.getClass().getSimpleName());
        a2.display();
        System.out.println("\n ---- ");
        System.out.println(a3.getClass().getSimpleName());
        a3.display();
        System.out.println("\n ---- ");
        System.out.println(a4.getClass().getSimpleName());
       a4.display();
        
	}

}
