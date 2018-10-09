
public class StringDemo {
	public static void main(String[] args) {
		StudentTest ss=new StudentTest(1001, "C++");
		StudentTest ss1=new StudentTest(1001, "C++");
		
		String s="welcome";
		String s1="welcome";
		System.out.println("s.hashCode() "+s.hashCode());
		System.out.println("s1.hashCode() "+s1.hashCode());
		System.out.println("s.equals(s1)"+s.equals(s1));
		System.out.println("s==s1"+(s==s1));
		String s2=new String("welcome").intern();
		String s3=new String("welcome");
		System.out.println("s2.hashCode() "+s2.hashCode());
		System.out.println("s3.hashCode() "+s3.hashCode());
		System.out.println("s3.equals(s2)"+s3.equals(s2));
		System.out.println("s2==s3"+(s2==s3));
		
		System.out.println("s==s2 "+(s==s2));
		
	
		System.out.println("Compare both Objects ");
		System.out.println("ss.equals(ss1) "+ss.equals(ss1));

		
	}

}


class StudentTest
{
	int testid;
	String testname;
	
	StudentTest(int testid,String testname)
	{
		this.testid=testid;
		this.testname=testname;
	}

	
	@Override
	public String toString() {
		return "StudentTest [testid=" + testid + ", testname=" + testname + "]";
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.testid;
	}
	
	@Override
	public boolean equals(Object obj) {
		StudentTest ss1=(StudentTest) obj;
		System.out.println(ss1.hashCode()+"\t"+hashCode());
		if(ss1.testid==this.testid)
			return true;
		else
		return super.equals(obj);
	}
	
	
	
	
	
}
