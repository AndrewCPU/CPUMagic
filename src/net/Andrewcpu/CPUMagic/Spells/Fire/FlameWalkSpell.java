package net.Andrewcpu.CPUMagic.Spells.Fire;

import org.bukkit.entity.Player;

/**
 * Created by Andrew on 2/19/2015.
 */
public class FlameWalkSpell {
    int level = 1;
    public void cast(Player player)
    {

    }
    public int getManaCost()
    {
        return 100;
    }
    public String getName()
    {
        return "Flame Walk";
    }
    public int getCooldownTime()
    {
        return 10;
    }
    public int getLevel()
    {
        return level;
    }
    public void setLevel(int i)
    {
        this.level = i;
    }
}
