/****************************************************************************************************************/
/* Copyright 2014 Walt Pach, Lowell Davis, all rights reserved. Released under the EnDob Lesser Public License. */
/****************************************************************************************************************/
package net.WookiePaw.EnDob.Entity;

import com.jme3.bullet.control.CharacterControl;
import com.jme3.scene.Node;
import net.WookiePaw.EnDob.Location.Location;


public class Player extends Entity{
    private CharacterControl control;
    private Node playerNode;
    
    /**
     * @deprecated 
     */
    public Player(){
        super(100, 100, new Location(0, 0, 0));
    }
    
    public Player(CharacterControl c){
        super(100, 100, new Location(0, 0, 0));
        this.control = c;
    }
    
    public void setJumpSpeed(float f){
        this.control.setJumpSpeed(f);
    }
    
    public void setFallSpeed(float f){
        this.control.setFallSpeed(f);
    }
    
    public void setGravity(float f){
        this.control.setGravity(f);
    }
    
    @Override
    public void teleport(Location l){
        this.control.setPhysicsLocation(l.toVector3f());
    }
}
