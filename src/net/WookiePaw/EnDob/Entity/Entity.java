/****************************************************************************************************************/
/* Copyright 2014 Walt Pach, Lowell Davis, all rights reserved. Released under the EnDob Lesser Public License. */
/****************************************************************************************************************/
package net.WookiePaw.EnDob.Entity;

import net.WookiePaw.EnDob.Location.Location;


public class Entity {
    private float life;
    private float maxLife;
    
    private boolean isDead;
    
    private Location location;
    
    public Entity(float life, float maxLife, Location location){
        this.life = life;
        this.maxLife = maxLife;
        this.location = location;
        this.isDead = false;
    }
    
    public void teleport(Location l){
        this.location = l;
    }
    
    public void kill(){
        this.isDead = true;
    }
    
    public Location getLocation(){
        return this.location;
    }
}
