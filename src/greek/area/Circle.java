package greek.area;

import greek.PackageDemo;
import static greek.PackageDemo.*;

public class Circle {
	static int radius;
	public Circle(int radius)
	{
		this.radius=radius;
	}

	public static float getArea()
	{
		PackageDemo pp=new PackageDemo();
		pp.display();
		
		return pi*radius*radius;
	}
	
	
	public static void main(String[] args) {
		
		new Circle(10);
		System.out.println(getArea());
		
	}
}
