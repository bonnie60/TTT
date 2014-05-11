package bonnieTTT;

import java.util.ArrayList;

import org.bukkit.entity.Player;

public class GroupManager {
	public ArrayList<Player> inno = new ArrayList<Player>();
	public ArrayList<Player> traitor = new ArrayList<Player>();
	public ArrayList<Player> detective = new ArrayList<Player>();
	public void setTraitor(ArrayList<Player> players, int t2) {
		traitor.add(players.get(t2));
	}
	public void setDetective(ArrayList<Player> players, int d) {
		detective.add(players.get(d));
		
	}
	public void setInno(ArrayList<Player> players) {
		for (Player p : players) {
			inno.add(p);
		}
		
	}
          
}
