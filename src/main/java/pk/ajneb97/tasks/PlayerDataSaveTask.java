package pk.ajneb97.tasks;

import me.hsgamer.hscore.bukkit.scheduler.Scheduler;
import pk.ajneb97.PlayerKits2;

public class PlayerDataSaveTask {

	private PlayerKits2 plugin;
	private boolean end;
	public PlayerDataSaveTask(PlayerKits2 plugin) {
		this.plugin = plugin;
		this.end = false;
	}
	
	public void end() {
		end = true;
	}

	public void start(int seconds) {
		long ticks = seconds* 20L;
		Scheduler.plugin(plugin).async().runTaskTimer(() -> {
			if(end) {
				return false;
			}else {
				execute();
				return true;
			}
		}, 0L, ticks);
	}
	
	public void execute() {
		plugin.getConfigsManager().getPlayersConfigManager().saveConfigs();
	}
}
