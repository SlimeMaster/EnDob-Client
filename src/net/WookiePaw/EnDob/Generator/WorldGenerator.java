/****************************************************************************************************************/
/* Copyright 2014 Walt Pach, Lowell Davis, all rights reserved. Released under the EnDob Lesser Public License. */
/****************************************************************************************************************/
package net.WookiePaw.EnDob.Generator;

import net.WookiePaw.EnDob.Location.World;


public class WorldGenerator {
    public WorldGenerator(World a){
        Layer1.a(a.getTerrainControl());
        Layer2.a(a.getTerrainControl());
        Layer3.a(a.getTerrainControl());
    }
}
