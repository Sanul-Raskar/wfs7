package house;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Kitchen {
   private String[] appliances;

public Kitchen(String[] appliances) {
	super();
	this.appliances = appliances;
}

public String[] getAppliances() {
	return appliances;
}

public void setAppliances(String[] appliances) {
	this.appliances = appliances;
}
public void display()
{
	OutputStreamWriter out=new OutputStreamWriter(new FileOutputStream(FileDescriptor.out));
	   try {
		out.write("\nAppliances are : ");
		for(String app:appliances)
			out.write(app+" ");
		out.flush();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 
}

@Override
protected void finalize() throws Throwable {
	// TODO Auto-generated method stub
	System.out.println("\nKitchen collected in garbage");
}
}
