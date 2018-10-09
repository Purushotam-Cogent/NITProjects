package nc.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class TryResourcesExample {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		try(InputStream is=new FileInputStream("test.txt");
				MyFile m=new MyFile())
		{
			int len=is.available();
			for(int i=0;i<len;i++)
				System.out.print((char)is.read());
			
			System.out.println("File Readed...");
			
			m.sayHello();
			
			
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
				

	}

}



class MyFile implements AutoCloseable
{

	@Override
	public void close() throws Exception {
		System.out.println("My File Closed now ");
		
	}
	
	public void sayHello()
	{
		System.out.println("This is automatic resouce management files");
	}
	
}