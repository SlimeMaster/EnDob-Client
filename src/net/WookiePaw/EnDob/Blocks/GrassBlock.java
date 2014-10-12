/****************************************************************************************************************/
/* Copyright 2014 Walt Pach, Lowell Davis, all rights reserved. Released under the EnDob Lesser Public License. */
/****************************************************************************************************************/
package net.WookiePaw.EnDob.Blocks;

import com.cubes.Block;
import static com.cubes.Block.Face.Bottom;
import static com.cubes.Block.Face.Top;
import com.cubes.BlockChunkControl;
import com.cubes.BlockManager;
import com.cubes.BlockSkin;
import com.cubes.BlockSkin_TextureLocation;
import com.cubes.Vector3Int;
import net.WookiePaw.EnDob.Manager.GenericBlockManager;

public class GrassBlock extends Block implements GenericBlockManager{
    private boolean isTransparent = false;
    private boolean isWalkThroughable = false;
    private BlockSkin skin = new BlockSkin(new BlockSkin_TextureLocation[] { new BlockSkin_TextureLocation(0, 0), new BlockSkin_TextureLocation(1, 0), new BlockSkin_TextureLocation(2, 0) }, false)
    {
      protected int getTextureLocationIndex(BlockChunkControl chunk, Vector3Int blockLocation, Block.Face face)
      {
        if (chunk.isBlockOnSurface(blockLocation)) {
          switch (face) {
          case Top:
            return 0;
          case Bottom:
            return 2;
          }
          return 1;
        }
        return 2;
      }
    };

    @Override
    public void addBlock() {
        BlockManager.register(this.getClass(), skin);
    }

    @Override
    public boolean getTransparent() {
        return this.isTransparent;
    }

    @Override
    public boolean isWalkThroughable() {
        return this.isWalkThroughable;
    }

}
