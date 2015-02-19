package net.Andrewcpu.CPUMagic.Spells;

import org.bukkit.entity.Player;

/**
 * Created by Andrew on 2/19/2015.
 */
public interface Spell {
    public void cast(Player player);
    public int getManaCost();
    public String getName();
    public int getCooldownTime();
    public int getLevel();
    public void setLevel(int i);
}
