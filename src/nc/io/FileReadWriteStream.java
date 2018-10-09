package nc.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileReadWriteStream {

	public static void main(String[] args) throws IOException {
	FileInputStream fis=new FileInputStream("d:\\LogicalOper.java");
	FileOutputStream fout=new FileOutputStream
			("d:\\output\\LogicalOper.java",true);
	int x=0;
	while((x=fis.read())!=-1)
	{
		//System.out.println(x+"=>"+(char)x);
		fout.write(x);
	}
	
	
	
	System.out.println("File Copied in d:\\output\\LogicalOper.java");
	
	fis.close();
	fout.close();
	
		
		

	}

}
