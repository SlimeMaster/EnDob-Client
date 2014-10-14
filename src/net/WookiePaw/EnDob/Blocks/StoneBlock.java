/****************************************************************************************************************/
/* Copyright 2014 Walt Pach, Lowell Davis, all rights reserved. Released under the EnDob Lesser Public License. */
/****************************************************************************************************************/

package net.WookiePaw.EnDob.Blocks;

import com.cubes.Block;
import com.cubes.BlockManager;
import com.cubes.BlockSkin;
import com.cubes.BlockSkin_TextureLocation;
import net.WookiePaw.EnDob.GenericBlockManager;


public class StoneBlock extends Block implements GenericBlockManager{
   private boolean isTransparent = false;
    private boolean isWalkThroughable = false;
    private BlockSkin skin = new BlockSkin(new BlockSkin_TextureLocation(11, 0), isWalkThroughable);
    
    @Override
    public void addBlock() {
        BlockManager.register(this.getClass(), skin);
    }

    @Override
    public boolean getTransparent() {
        return isTransparent;
    }

    @Override
    public boolean isWalkThroughable() {
        return isWalkThroughable;
    }
    
}
