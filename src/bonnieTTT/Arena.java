package bonnieTTT;

import java.util.ArrayList;

import org.bukkit.Location;
import org.bukkit.entity.Player;

public class Arena {
         public Location sl1,sl2,sl3,sl4,sl5,sl6,sl7,sl8,sl9;
         public static int id;

		public Arena(int i) {
			id = i;
		}

		public ArrayList<Player> getIngamePlayers(Arena a) {
			
			return null;
		}

		public static Arena getByStringID(String line) {
              id = Integer.parseInt(line);
			return null;
                

		}

		}

         

