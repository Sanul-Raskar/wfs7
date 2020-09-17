import java.lang.String;
class Classload {
    public Classload()
    {
    	System.out.println("Class Created");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Class c1;
		try {
			c1 = Class.forName("Classload");
			ClassLoader classLoader=c1.getClassLoader();
			Class c2 = Class.forName("java.lang.String", true, classLoader);
	        System.out.println("Class => "+ c1.getName());
	        Classload cl=new Classload();
	        System.out.println("Class => "+c2.getName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
	}

}
