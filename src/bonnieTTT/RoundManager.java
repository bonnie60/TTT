package bonnieTTT;

import java.util.ArrayList;
import java.util.Random;

import org.bukkit.entity.Player;

public class RoundManager {
    public void newRandomGroups(Arena a,GroupManager gm) {
        ArrayList<Player> players = a.getIngamePlayers(a);   
       Random rdm = new Random();
       int t1 = rdm.nextInt(players.size());
       int t2 = rdm.nextInt(players.size());
       int t3 = rdm.nextInt(players.size());
       gm.setTraitor(players,t1);
       gm.setTraitor(players,t2);
       gm.setTraitor(players,t3);
       players.remove(t1);
       players.remove(t2);
       players.remove(t3);
       int d = rdm.nextInt(players.size());
       gm.setDetective(players,d);
       players.remove(d);
       for(Player p : players) {
    	   gm.setInno(players);
       }
       }

	public void addArena(int i) {
		Arena a = new Arena(i);
		
	}
     }
 
