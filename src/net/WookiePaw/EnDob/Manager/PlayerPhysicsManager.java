/****************************************************************************************************************/
/* Copyright 2014 Walt Pach, Lowell Davis, all rights reserved. Released under the EnDob Lesser Public License. */
/****************************************************************************************************************/
package net.WookiePaw.EnDob.Manager;

import com.jme3.bullet.collision.shapes.CapsuleCollisionShape;
import com.jme3.bullet.control.CharacterControl;
import net.WookiePaw.EnDob.EnDob;
import net.WookiePaw.EnDob.Entity.Player;


public class PlayerPhysicsManager {
    private EnDob game;
    private Player p;
    private CapsuleCollisionShape playerShape;
    
    public PlayerPhysicsManager(EnDob game, Player p){
        this.game = game;
        this.p = p;
        
        this.playerShape = new CapsuleCollisionShape(1.5f, 5f, 1);
        this.p = new Player(new CharacterControl(playerShape, 0.05f));
    }
}
