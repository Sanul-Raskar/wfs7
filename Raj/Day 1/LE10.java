import java.lang.StringBuilder;
import java.util.Arrays;
import java.util.Scanner;
class Stringprac {
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       String[] str=new String[5];
       for(int i=0;i<5;i++)
    	   str[i]=sc.nextLine();
       StringBuilder str1=new StringBuilder();
       for(int i=0;i<5;i++)
       {
    	   str1.append(str[i]);
    	   str1=str1.reverse();
    	   str[i]=str1.toString();
    	   str1.delete(0, str1.length());
       }
       Arrays.sort(str);
       for(String st:str)
    	   System.out.println(st);
       sc.close();
	}

}
