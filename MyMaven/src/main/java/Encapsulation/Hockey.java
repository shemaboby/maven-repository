package Encapsulation;

public class Hockey extends Sports{
	private int numofPlayers;
	public void play(int numofPlayers) {
		this.numofPlayers=numofPlayers;
		
		System.out.println("Hockey team");
		System.out.println("Number of players is:"+numofPlayers);
	}

	public static void main(String args[])
	{
		Sports s= new Cricket();
		Sports s1= new Football();
		Sports s2= new Hockey();
		s.play(11);
		s1.play(12);
		s2.play(15);
	}
}
