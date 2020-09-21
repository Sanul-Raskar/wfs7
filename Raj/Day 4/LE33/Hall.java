package house;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Hall {
   public static void printmsg()
   {
	   String st="This is the first room of the house";
	   OutputStreamWriter out=new OutputStreamWriter(new FileOutputStream(FileDescriptor.out));
	   try {
		out.write(st);
		out.flush();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   }
}
