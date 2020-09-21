package zoo;


import org.animals.*;

public class VandalurZoo {
  public static void main(String[] args)
  {
	  Tiger tg=new Tiger("orange", 12);
	  Lion li=new Lion("paleishorange", 16);
	  Deer dr=new Deer("red", 5);
	  Elephant el=new Elephant("black", 18);
	  Monkey mon=new Monkey("grey",2);
	  System.out.println(tg);
	  System.out.println(li);
	  System.out.println(dr);
	  System.out.println(el);
	  System.out.println(mon);
  }
}
