package nc.thread;

public class NCThreadDemo {

	public static void main(String[] args) {
		Thread1 th1=new Thread1();
		Thread2 th2=new Thread2();
		
		th1.start();
		th2.start();
		
		
		
		

	}

}


class Thread1 extends Thread
{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			try {
			System.out.println("_ _ _ _ _ Thread 1 _ _ _ _ _");
			Thread.sleep(1000);
			
			}catch(Exception e)
			{
				System.out.println(e);
			}
			
		}
		
	}
}

class Thread2 extends Thread
{
	public void run()
	{
		
		for(int i=0;i<=5;i++)
		{
			try {
			System.out.println("------- Thread 2 -------");
			Thread.sleep(500);
			
			}catch(Exception e)
			{
				System.out.println(e);
			}
			
		}
	}
}

