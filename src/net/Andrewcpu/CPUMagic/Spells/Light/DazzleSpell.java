package net.Andrewcpu.CPUMagic.Spells.Light;

import net.Andrewcpu.CPUMagic.Spells.Spell;
import org.bukkit.entity.Player;

/**
 * Created by Andrew on 2/19/2015.
 */
public class DazzleSpell implements Spell {
    public void cast(Player player)
    {

    }
    public int getManaCost()
    {
        return 100;
    }
    public String getName()
    {
        return "Dazzle";
    }
    private int level = 1;
    public int getLevel()
    {
        return level;
    }
    public void setLevel(int level)
    {
        this.level = level;
    }
    public int getCooldownTime()
    {
        return 10;
    }


}
