/****************************************************************************************************************/
/* Copyright 2014 Walt Pach, Lowell Davis, all rights reserved. Released under the EnDob Lesser Public License. */
/****************************************************************************************************************/
package net.WookiePaw.EnDob.Blocks;

import com.cubes.Block;
import com.cubes.BlockManager;
import com.cubes.BlockSkin;
import com.cubes.BlockSkin_TextureLocation;
import net.WookiePaw.EnDob.Manager.GenericBlockManager;


public class WoodBlock extends Block implements GenericBlockManager{
    private boolean isTransparent = false;
    private boolean isWalkThroughable = false;
    private BlockSkin skin = new BlockSkin(new BlockSkin_TextureLocation[] { new BlockSkin_TextureLocation(4, 0), new BlockSkin_TextureLocation(4, 0), new BlockSkin_TextureLocation(3, 0), new BlockSkin_TextureLocation(3, 0), new BlockSkin_TextureLocation(3, 0), new BlockSkin_TextureLocation(3, 0) }, false);
    
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
