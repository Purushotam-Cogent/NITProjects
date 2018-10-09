package nc.collections;

import java.sql.SQLException;

public class GemericDemo {
	
	public static void main(String[] args) {
		
		Shape<SQLException> sh=new Shape();
		sh.add(new SQLException());
		
		System.out.println("Integer "+sh.get());
		Shape<RuntimeException> s=new Shape();
		s.add(new RuntimeException());
		
		System.out.println(s.get());
		
		PrintArrays.printArray(new Float[] {12.90f,23.90f,34.45f,89.90f});
		
			
	}

}

class Shape<T extends Exception>
{
	T t;
	
	public void add(T t)
	{
		this.t=t;
	}
	
	public T get()
	{
		return this.t;
	}
}

class PrintArrays
{
	public static<T> void printArray(T[] i)
	{
		for (T t : i) {
			System.out.print(t);
		}
		System.out.println();
	}
}

