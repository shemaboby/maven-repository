package Encapsulation;

public class Cricket extends Sports {
	
	private int numofPlayers;
	public void play(int numofPlayers) {
		this.numofPlayers=numofPlayers;
		
		System.out.println("Cricket team");
		System.out.println("Number of players is:"+numofPlayers);
	}
	

}
