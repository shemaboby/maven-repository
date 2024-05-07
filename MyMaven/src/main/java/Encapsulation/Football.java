package Encapsulation;

public class Football extends Sports {
	private int numofPlayers;
	public void play(int numofPlayers) {
		this.numofPlayers=numofPlayers;
		
		System.out.println("Football team");
		System.out.println("Number of players is:"+numofPlayers);
	}

}
