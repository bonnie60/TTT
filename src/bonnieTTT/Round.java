package bonnieTTT;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Round extends JavaPlugin {
	@Override
	public void onEnable() {
		Bukkit.getPluginManager().registerEvents(new Listeners(this), this);
		ConfigManager cm = new ConfigManager();
		GroupManager gm = new GroupManager();
		RoundManager rm = new RoundManager();
		cm.saveDefaultConfig(this);
		rm.addArena(1);
	}
    
}
