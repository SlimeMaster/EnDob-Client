/****************************************************************************************************************/
/* Copyright 2014 Walt Pach, Lowell Davis, all rights reserved. Released under the EnDob Lesser Public License. */
/****************************************************************************************************************/
package net.WookiePaw.EnDob.Generator;

import com.cubes.BlockTerrainControl;
import com.cubes.Vector3Int;
import net.WookiePaw.EnDob.Blocks.GrassBlock;


public class Layer3 {
    public static void a(BlockTerrainControl blockControl){
        for(int x = 0; x < 500; x++){
            for(int z = 0; z < 500; z++){
                blockControl.setBlock(new Vector3Int(x, 4, z), GrassBlock.class);
            }
        }
    }
}
