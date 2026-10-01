package cx.ajneb97.listeners.dependencies;

import cx.ajneb97.Codex;
import net.momirealms.customfishing.api.event.FishingResultEvent;
import net.momirealms.customfishing.api.mechanic.loot.Loot;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;

public class CustomFishingListener implements Listener {

    private Codex plugin;

    public CustomFishingListener(Codex plugin) {
        this.plugin = plugin;
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onFishResult(FishingResultEvent event) {
        if (event.getResult() == FishingResultEvent.Result.SUCCESS) {
            Player player = event.getPlayer();
            Loot loot = event.getLoot();
            if (player != null && loot != null && loot.id() != null) {
                plugin.getDiscoveryManager().onCustomFishingCatch(player, loot.id());
            }
        }
    }
}
