import com.sun.org.apache.xalan.internal.xsltc.compiler.SyntaxTreeNode;

public class MultiLevelInheirtance {

	public static void main(String[] args) {
		
		/*AA aa=new BB();
		aa.show();
		BB bb=new CC();
		bb.show();*/
		
		new CC(1000);
	}
}

class AA
{
	int aa=1000;
	AA()
	{
		System.out.println("1.AA.AA()");
		System.out.println(this);
	}
	AA(int x)
	{
		System.out.println("AA.AA("+x+")");
		
		System.out.println("CC Var in AA class ="+((CC)this).cc);
		((CC)this).show();
		
	}
	void show()
	{
		System.out.println("AA.show()");
	}
}

class BB extends AA
{
	int aa=2000;
	int bb=3000;
	BB()
	{
		System.out.println("2.BB.BB()");
		System.out.println(this);
	}
	BB(int x)
	{
		super(x);
		System.out.println("BB.BB("+x+")");
	}
	protected void show()
	{
		System.out.println("BB.show()");
	}
}

class CC extends BB
{
	int cc=9000;
	CC()
	{
		System.out.println("3.CC.CC()");
	}
	CC(int x)
	{
		super(x);
		System.out.println("CC.CC("+x+")");
		System.out.println(this);
	}
	public void show()
	{
		System.out.println("CC.show()");
		System.out.println("B's AA var ="+super.aa);
		System.out.println("A's AA var "+(new AA()).aa);
		
	}
}

