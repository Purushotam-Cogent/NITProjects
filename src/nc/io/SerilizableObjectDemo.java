package nc.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerilizableObjectDemo {

	public static void main(String[] args) throws IOException {
		FileOutputStream fout=new FileOutputStream("object.dat");
		ObjectOutputStream out=new ObjectOutputStream(fout);
		Student ss=new Student(1001, 2333.89f, 12345.90);
		
		out.writeObject(ss);

		
		System.out.println("Object serilized & written in files");
		
		
		
		

	}

}
