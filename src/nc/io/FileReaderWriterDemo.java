package nc.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterDemo {

	public static void main(String[] args) throws IOException {
		File f=new File("d:\\output\\test.txt");
		if(f.exists())
		{
			FileReader file=new FileReader(f);
			System.out.println("we going to read "+f.getName());
			System.out.println("We are going to read "+f.length()+" bytes.");
			char c[]=new char[(int)f.length()];
			
			file.read(c);
			
			//System.out.println(c.toString());
			
			String str=new String(c);
			System.out.println(str);
			
			
		}
		else
		{
			System.out.println("file not found");
			
			FileWriter file=new FileWriter(f);
			file.write("Welcome to File Writer Object to file content into file ");
			
			file.write("\nThis belong to writer class ");
			
			file.flush();
			file.close();
			System.out.println(f.getName()+" created...");
		}
		
		

	}

}
