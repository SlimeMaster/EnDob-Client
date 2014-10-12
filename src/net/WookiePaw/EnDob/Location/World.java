/****************************************************************************************************************/
/* Copyright 2014 Walt Pach, Lowell Davis, all rights reserved. Released under the EnDob Lesser Public License. */
/****************************************************************************************************************/
package net.WookiePaw.EnDob.Location;

import com.cubes.Block;
import com.cubes.BlockTerrainControl;
import com.cubes.Vector3Int;
import com.cubes.test.CubesTestAssets;
import net.WookiePaw.EnDob.EnDob;


public class World {
    private Location playerLoc;
    private BlockTerrainControl blockTerrain;
    private String worldName;
    
    public World(String name){
        this.blockTerrain = new BlockTerrainControl(CubesTestAssets.getSettings(EnDob.game), new Vector3Int(1, 1, 1));
        this.worldName = name;
    }
    
    public World(String name, Location loc){
        this.blockTerrain = new BlockTerrainControl(CubesTestAssets.getSettings(EnDob.game), new Vector3Int(1, 1, 1));
        this.worldName = name;
        this.playerLoc = loc;
    }
    
    public void setBlock(Location l, Block b){
        this.blockTerrain.setBlock(l.toVector3Int(), b.getClass());
    }
}
