package nc.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeSerilized {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
	ObjectInputStream ois=new ObjectInputStream
			(new FileInputStream("Object.dat"));
	
	Student ss=(Student) ois.readObject();
	
	System.out.println("Object De-Serilized ");
	
	System.out.println(ss);
	
	 //ss=new Student(1, 90.90f, 36565675);
	//System.out.println(ss);
	

	}

}
