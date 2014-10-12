/****************************************************************************************************************/
/* Copyright 2014 Walt Pach, Lowell Davis, all rights reserved. Released under the EnDob Lesser Public License. */
/****************************************************************************************************************/
package net.WookiePaw.EnDob.Manager;

import com.jme3.bullet.collision.shapes.CollisionShape;
import com.jme3.bullet.control.RigidBodyControl;
import com.jme3.bullet.util.CollisionShapeFactory;
import com.jme3.scene.Node;
import com.jme3.scene.Spatial;
import net.WookiePaw.EnDob.EnDob;
import net.WookiePaw.EnDob.Entity.Player;


public class BlockCollisionManager {
    private Player p;
    private EnDob game;
    private RigidBodyControl worldRigidBodyControl;
    private Spatial worldModel;
    private CollisionShape worldCollisionShape;
    
    public BlockCollisionManager(EnDob game){
        this.worldRigidBodyControl = game.getWorldRigidBodyControl();
        this.worldModel = game.getWorldModel();
        
        this.worldCollisionShape = CollisionShapeFactory.createMeshShape((Node) worldModel);
        this.worldRigidBodyControl = new RigidBodyControl(this.worldCollisionShape, 0);
        this.worldModel.addControl(this.worldRigidBodyControl);
    }
}
