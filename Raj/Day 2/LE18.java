class Stringdiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String str1=new String("raj");
         String str2="raj";
         if(str1==str2)
        	 System.out.println("String equals");
         else
        	 System.out.println("String not equals");
         if(str1.contentEquals(str2))
        	 System.out.println("String equals");
         else
        	 System.out.println("String not equals");
	}

}
