package nc.varags;

public class VargsDemo {
	
	public void display(String ...s)
	{
		System.out.println("Total args "+s.length);
		for(int i=0;i<s.length;i++)
		{
			System.out.println("Param "+i+" => "+s[i]);
		}
	}

	public static void main(String[] args) {
		
		VargsDemo vv=new VargsDemo();
		vv.display("Welcome");
		vv.display("Welcome","to","NetCracker");
		vv.display("This","is","Java","Training","Session");
		vv.display(new String[] {"C++","CoreJAva","PLSQL","SQL",
				"JEE","Spring","SpringMVC"});
		
	}

}
