package bonnieTTT;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.Sign;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.plugin.Plugin;

public class Listeners implements Listener {
       public Listeners(Plugin pl) {
       }
     void setRound(Round r) {
      Round round = r; 
     }
       @EventHandler
       public void onPlayerInteract(PlayerInteractEvent e) {
    	 Block cb = e.getClickedBlock();
    	 if(cb.getType() == Material.SIGN ) {
    		 Sign s = (Sign)cb;
    		 if(s.getLine(1).equalsIgnoreCase("TTT Join") && s.getLine(2).equalsIgnoreCase("Lobby")) {
    			 Player p = e.getPlayer();
    			 join(s.getLine(3),p);
    		 }
    	 }
       }
	private void join(String line, Player p) {
		Arena a = Arena.getByStringID(line);
		
	}
}
