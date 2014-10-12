/****************************************************************************************************************/
/* Copyright 2014 Walt Pach, Lowell Davis, all rights reserved. Released under the EnDob Lesser Public License. */
/****************************************************************************************************************/
package net.WookiePaw.EnDob.Manager;

import net.WookiePaw.EnDob.Blocks.DirtBlock;
import net.WookiePaw.EnDob.Blocks.GrassBlock;
import net.WookiePaw.EnDob.Blocks.WoodBlock;


class BlockInitManager {
    public static GrassBlock gb = new GrassBlock();
    public static DirtBlock db = new DirtBlock();
    public static WoodBlock wb = new WoodBlock();
        
    public static void init(){
        gb.addBlock();
        db.addBlock();
        wb.addBlock();
    }
}
