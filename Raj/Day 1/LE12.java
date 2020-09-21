import java.util.Scanner;
class Shopkeeper
{
  int product;
  double quantity;
  double retailprice;
  public Shopkeeper(int product,double quantity)
  {
   this.product=product;
   this.quantity=quantity;
   this.retailprice=0;
   } 
  public void setRetailPrice()
  {
      switch(this.product)
      {
      case 1: this.retailprice=22.50;
              break;
      case 2: this.retailprice=44.50;
              break;
      case 3: this.retailprice=9.98;
              break;
      }
      this.retailprice*=this.quantity;
  }
  public void print()
  {
	  System.out.println("Retail Price : "+this.retailprice);
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
	     int product=sc.nextInt();
	     double quantity=sc.nextDouble();
	     Shopkeeper sh=new Shopkeeper(product,quantity);
	     sh.setRetailPrice();
	     sh.print();
	     sc.close();
	}

	}
