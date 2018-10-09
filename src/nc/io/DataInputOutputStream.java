package nc.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInputOutputStream {

	public static void main(String[] args) throws IOException {
		System.out.println("DataInputOutputStream.main()");
	//	DataInputStream dis=new DataInputStream(new BufferedInputStream(System.in));
		DataOutputStream dout=new DataOutputStream(new BufferedOutputStream(
new FileOutputStream("d:\\output\\data.txt")));
		//System.out.println("Enter Age");
		//int age=dis.readInt();
		//float ch=dis.readFloat();
		dout.writeFloat(12.8899f);
		dout.writeInt(200);
		dout.writeDouble(123.333);
		dout.writeUTF("Welcome");
		
		dout.flush();
		dout.close();
		
		DataInputStream dis=new DataInputStream
			(new BufferedInputStream
					(new FileInputStream("d:\\output\\data.txt")));
		
		
		float f=dis.readFloat();
		int a=dis.readInt();
		
		System.out.println(f+"\t"+a+"\t"+dis.readDouble()+"\t"+dis.readUTF());
		
		dis.close();
		
		
		
		

	}

}
