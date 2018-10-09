package main;
import greek.PackageDemo;


public class Main extends PackageDemo {
	PackageDemo p;
	
	
	public Main() {
		display();
		super.display();
		this.display();
		p=new PackageDemo();
		
	}
	
	public static void main(String[] args) {
		
		org.PackageDemo pp=new org.PackageDemo();
		pp.display();
		PackageDemo p_greek=new PackageDemo();
		new Main().display();
		
	}
}
