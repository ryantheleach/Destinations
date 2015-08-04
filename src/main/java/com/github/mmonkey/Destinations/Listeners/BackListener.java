package com.github.mmonkey.Destinations.Listeners;

import com.github.mmonkey.Destinations.Dams.BackDam;
import com.github.mmonkey.Destinations.Destinations;
import com.github.mmonkey.Destinations.Events.PlayerBackLocationSaveEvent;
import org.spongepowered.api.entity.player.Player;
import org.spongepowered.api.event.Subscribe;

public class BackListener {

    private BackDam backDam;

    @Subscribe
    public void onBack(PlayerBackLocationSaveEvent event) {

        if (!event.isCancelled()) {
            Player player = event.getPlayer();
            backDam.setBack(player);
        }

    }

    public BackListener(Destinations plugin) {
        this.backDam = new BackDam(plugin);
    }
}
