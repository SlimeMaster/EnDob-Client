/****************************************************************************************************************/
/* Copyright 2014 Walt Pach, Lowell Davis, all rights reserved. Released under the EnDob Lesser Public License. */
/****************************************************************************************************************/
package net.WookiePaw.EnDob.Listener;

import com.cubes.BlockChunkControl;
import com.cubes.BlockChunkListener;
import com.cubes.BlockManager;
import com.cubes.BlockTerrainControl;
import com.cubes.BlockType;
import com.cubes.Vector3Int;
import com.cubes.test.blocks.Block_Water;
import com.jme3.bullet.BulletAppState;
import com.jme3.bullet.collision.shapes.MeshCollisionShape;
import com.jme3.bullet.control.RigidBodyControl;
import com.jme3.scene.Geometry;
import net.WookiePaw.EnDob.Blocks.WoodBlock;
import net.WookiePaw.EnDob.EnDob;


public class ChunkCollisionListener {
    private EnDob game;
    private BlockTerrainControl a;
    private BulletAppState aa;
    
    public ChunkCollisionListener(BlockTerrainControl a, final BulletAppState aa){
        initChunkCollision(a, aa);
    }
    
    private void initChunkCollision(BlockTerrainControl a, final BulletAppState aa){
        a.addChunkListener(new BlockChunkListener(){

          
            @Override
            public void onSpatialUpdated(BlockChunkControl blockChunk){
                Geometry optimizedGeometry = blockChunk.getOptimizedGeometry_Opaque();
                //Geometry optimizedGeometry1 = blockChunk.getOptimizedGeometry_Transparent();
                
                RigidBodyControl rigidBodyControl = optimizedGeometry.getControl(RigidBodyControl.class);
                //RigidBodyControl rigidBodyControl1 = optimizedGeometry1.getControl(RigidBodyControl.class);
                
                if(rigidBodyControl == null){
                    rigidBodyControl = new RigidBodyControl(0);
                    optimizedGeometry.addControl(rigidBodyControl);
                    aa.getPhysicsSpace().add(rigidBodyControl);
                }
                
                rigidBodyControl.setCollisionShape(new MeshCollisionShape(optimizedGeometry.getMesh()));
            }
        });
    }
}
