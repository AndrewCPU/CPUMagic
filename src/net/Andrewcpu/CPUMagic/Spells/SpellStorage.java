package net.Andrewcpu.CPUMagic.Spells;

import org.bukkit.entity.Player;

import java.util.HashMap;

/**
 * Created by Andrew on 2/19/2015.
 */
public class SpellStorage  {
    HashMap<Player,Spell> spellPlayerHashMap = new HashMap<Player, Spell>();
    HashMap<Player,Spell> coolDown = new HashMap<Player, Spell>();
    public boolean isInCoolDown(Player p, Spell spell)
    {
        if(coolDown.containsKey(p) && coolDown.get(p).getName()==spell.getName())
        {
            return true;
        }
        return false;
    }
    public boolean isCasting( Player p,Spell spell)
    {
        if(spellPlayerHashMap.get(p).getName()==spell.getName())
        {
            return true;
        }
        return false;
    }
    public void addSpell(Player p, Spell spell)
    {
        if(spellPlayerHashMap.containsKey(p))
        {
            spellPlayerHashMap.remove(p);
            spellPlayerHashMap.put(p,spell);
        }
        else
        {
            spellPlayerHashMap.put(p,spell);
        }
    }



}
