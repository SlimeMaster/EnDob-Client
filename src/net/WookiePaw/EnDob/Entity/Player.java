/****************************************************************************************************************/
/* Copyright 2014 Walt Pach, Lowell Davis, all rights reserved. Released under the EnDob Lesser Public License. */
/****************************************************************************************************************/
package net.WookiePaw.EnDob.Entity;

import com.jme3.bullet.control.CharacterControl;
import net.WookiePaw.EnDob.Location.Location;


public class Player {
    private Location currentLoc;
    private float health;
    private float maxHealth;
    private CharacterControl control;
    
    public Player(){
        throw new RuntimeException("You can't just make a player!!");
    }
    
    public Player(CharacterControl c, Location loc, float health, float maxHealth){
        this.currentLoc = loc;
        this.health = health;
        this.maxHealth = maxHealth;
        
        control = c;
    }
    
    public CharacterControl getControl(){
        return this.control;
    }
}
