package nc.nested;

import nc.nested.Play.Cricket;
import nc.nested.Play.Football;

public class NestedClassDemo {

	public static void main(String[] args) {

		Cricket cri=new Play().new Cricket();
		cri.playCricket();
		
		
		Football foot=new Play.Football();
		foot.playFootball();
		
		
		class welcome
		{
			public void playWelcome()
			{
			System.out.println("NestedClassDemo.main(...).welcome.playWelcome()");
			}
		}
		
		welcome wel=new welcome();
		wel.playWelcome();
		
		
		new Runnable() {
			
			@Override
			public void run() {
				String msg="Welcome to Anonymous Inner class ";
				for(int i=0;i<msg.length();i++)
				{
					System.out.print(msg.charAt(i));
					try {
						Thread.sleep(300);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
				
			}
		}.run();
		
		
		

	}

}
