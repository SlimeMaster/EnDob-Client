/****************************************************************************************************************/
/* Copyright 2014 Walt Pach, Lowell Davis, all rights reserved. Released under the EnDob Lesser Public License. */
/****************************************************************************************************************/
package net.WookiePaw.EnDob.Blocks;


public class BlockHelper {
    public void registerBlocks(){
        DirtBlock a = new DirtBlock();
        GrassBlock aa = new GrassBlock();
        WoodBlock ab = new WoodBlock();
        WaterBlock ac = new WaterBlock();
        StoneBlock ad = new StoneBlock();
        
        a.addBlock();
        aa.addBlock();
        ab.addBlock();
        ac.addBlock();
        ad.addBlock();
    }
}
