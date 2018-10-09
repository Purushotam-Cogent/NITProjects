
public class InheritanceDemo {

	public static void main(String[] args) {
		Number nn=new Number();
		nn.input(12, 30);
		nn.add();
		nn.print();
		
		Base bb=new Number();
		bb.input(12, 23);
		bb.add();
		bb.print();
		

	}

}
class Base
{
	int x,y,res;
	
	public void input(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	 void print()
	{
		System.out.println("("+x+","+y+"="+res+")");
	}
	 
	 public void add()
	 {
		 
	 }
}

class Number extends Base
{
	public void add()
	{
		res=x+y;
	}
	
	@Override
	 protected void print()
	{
		System.out.println("("+x+"+"+y+"="+res+")");
		
	}
}

