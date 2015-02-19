package net.Andrewcpu.CPUMagic.Spells.Dark;

import net.Andrewcpu.CPUMagic.Spells.Spell;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

/**
 * Created by Andrew on 2/19/2015.
 */
public class MindFlaySpell implements Spell{
    int level = 1;
    public void cast(Player player){

    }
    public int getManaCost(){
        return 100;
    }
    public String getName(){
        return "Mind Flay";
    }
    public int getCooldownTime(){
        return 100;
    }
    public int getLevel(){
        return level;
    }
    public void setLevel(int i){
        this.level = i;
    }
}
