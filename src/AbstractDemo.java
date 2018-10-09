
public class AbstractDemo {

	public static void main(String[] args) {
		Shape shape=new Circle();
		shape.draw();

	}

}

abstract class Shape
{
	protected abstract void draw();
	public abstract TestA getObj();
}

class Circle extends Shape
{

	@Override
	protected void draw() {
		System.out.println("Circle.draw()");
		
	}

	@Override
	public TestB getObj() {
		// TODO Auto-generated method stub
		return new TestB();
	}
	
}

class TestA
{
	
}

class TestB extends TestA
{
	
}
class TestC extends TestB
{
	
}