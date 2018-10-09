package nc.thread;

public class SynchThreadDemo extends Thread {
	String user,greetings;
	Message message;
	static int count=0;
	public SynchThreadDemo(String user,String greetings,Message message) {
		this.user=user;
		this.greetings=greetings;
		this.message=message;
		++count;
		//System.out.println(message);
		start();
	}
	
	public void run()
	{
		synchronized (message) {
		message.printGreetings(user, greetings);
		message.printTable(++count);
		}
	}

	public static void main(String[] args) {
		final Message message=new Message();
		
		SynchThreadDemo sy=new SynchThreadDemo
				("John", "=> GooD morning John",message);
		SynchThreadDemo sy1=new SynchThreadDemo
				("SAM", "=> Hello gud afternoon SAM",message);
		SynchThreadDemo sy2=new SynchThreadDemo
				("Cena", "=> Hi Hows you Cena",message);
		
		

	}
	
	
}



class Message
{
	public  void printGreetings(String user,String greetings)
	{
		System.out.print(user);
		try {
			Thread.sleep(1000);
		}catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println(greetings);
	}
	
	public void printTable(int count)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.print(count*i+"\t");
			try {
				Thread.sleep(400);
			}catch(Exception e)
			{
				System.out.println(e);
			}
		}
		System.out.println();
	}

}