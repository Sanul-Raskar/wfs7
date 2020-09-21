package house;

public class TestHouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Hall.printmsg();
        String[] appliances= {"Toatser","Refrigirator","Oven","Gas"};
        Kitchen kitch=new Kitchen(appliances);
        kitch.display();
        appliances=kitch.getAppliances();
        
        kitch=null;
        try
        {
        System.gc();
        }
        catch(Throwable th)
        {
        	th.printStackTrace();
        }
	}

}
