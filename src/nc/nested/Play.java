package nc.nested;

public class Play {
	class Cricket
	{
		public void playCricket()
		{
			System.out.println("This is inner class access by outer Object");
			System.out.println("Play.Cricket.playCricket()");
		}
	}
	
	public void playGame()
	{
		System.out.println("This outer class can access inner Method");
		
		new Cricket().playCricket();
	}
	
	static class Football
	{
		public void playFootball()
		{
			System.out.println("Play.Football.playFootball()");
		}
	}

}
