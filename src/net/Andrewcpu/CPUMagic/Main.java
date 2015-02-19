package net.Andrewcpu.CPUMagic;

import net.Andrewcpu.CPUMagic.Spells.SpellStorage;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by Andrew on 2/19/2015.
 */
public class Main extends JavaPlugin {
    public static SpellStorage storage = new SpellStorage();
    MainListener listener = new MainListener();
    public void onEnable()
    {
        getServer().getPluginManager().registerEvents(listener,this);
    }
}
