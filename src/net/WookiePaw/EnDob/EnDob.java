/****************************************************************************************************************/
/* Copyright 2014 Walt Pach, Lowell Davis, all rights reserved. Released under the EnDob Lesser Public License. */
/****************************************************************************************************************/
package net.WookiePaw.EnDob;

import com.cubes.BlockTerrainControl;
import com.cubes.Vector3Int;
import com.cubes.test.CubesTestAssets;
import com.jme3.app.SimpleApplication;
import com.jme3.math.Vector3f;
import com.jme3.scene.Node;
import com.jme3.system.AppSettings;
import net.WookiePaw.EnDob.Blocks.DirtBlock;
import net.WookiePaw.EnDob.Blocks.GrassBlock;


public class EnDob extends SimpleApplication{
    public static EnDob game;
    
    public static void main(String[] args){
        game = new EnDob();
        AppSettings settings = new AppSettings(true);
        settings.setTitle("EnDob");
        game.setDisplayFps(true);
        game.setDisplayStatView(false);
        game.start();
    }
    
    @Override
    public void simpleInitApp() {
        //This is your terrain, it contains the whole
        //block world and offers methods to modify it
        BlockTerrainControl blockTerrain = new BlockTerrainControl(CubesTestAssets.getSettings(this), new Vector3Int(1, 1, 1));
 
        GrassBlock gb = new GrassBlock();
        DirtBlock db = new DirtBlock();
        
        gb.addBlock();
        db.addBlock();
        
        blockTerrain.setBlock(new Vector3Int(0, 0, 0), GrassBlock.class);
        blockTerrain.setBlock(new Vector3Int(1, 0, 0), DirtBlock.class);
        blockTerrain.setBlock(new Vector3Int(2, 0, 0), GrassBlock.class);
        blockTerrain.setBlock(new Vector3Int(3, 0, 0), DirtBlock.class);
        blockTerrain.setBlock(new Vector3Int(4, 0, 0), GrassBlock.class);
        blockTerrain.setBlock(new Vector3Int(5, 0, 0), DirtBlock.class);
        
        Node terrainNode = new Node();
        terrainNode.addControl(blockTerrain);
        rootNode.attachChild(terrainNode);
 
        cam.setLocation(new Vector3f(-10, 10, 16));
        cam.lookAtDirection(new Vector3f(1, -0.56f, -1), Vector3f.UNIT_Y);
        flyCam.setMoveSpeed(50);
    }

}
