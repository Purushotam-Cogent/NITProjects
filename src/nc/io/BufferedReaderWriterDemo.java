package nc.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;

public class BufferedReaderWriterDemo {

	public static void main(String[] args) throws IOException {
		BufferedReader buff=new BufferedReader
				(new InputStreamReader(System.in));
		
		System.out.println("Name ");
		String name=buff.readLine();
		System.out.println("Age ");
		int age=Integer.parseInt(buff.readLine());
		
		System.out.println("float ");
		float f=Float.parseFloat(buff.readLine());
		
		System.out.println(name+"\t"+age+"\t"+f);
		
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(
				System.out));
		
		bw.write(name);
		bw.flush();
		bw.write(""+age);
		bw.flush();

	}

}
