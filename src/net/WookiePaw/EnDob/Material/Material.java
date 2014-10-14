/****************************************************************************************************************/
/* Copyright 2014 Walt Pach, Lowell Davis, all rights reserved. Released under the EnDob Lesser Public License. */
/****************************************************************************************************************/
package net.WookiePaw.EnDob.Material;

/**
 *
 * @author Walt
 */
public enum Material {
    GRASS, DIRT, WOOD, LEAVES, WATER;
    
    public String getName(Material a){
        if(a == Material.GRASS){
            return "Grass";
        }
        else if(a == Material.DIRT){
            return "Dirt";
        }
        else if(a == Material.WATER){
            return "Wood";
        }
        else if(a == Material.LEAVES){
            return "Leaves";
        }
        else if(a == Material.WATER){
            return "Water";
        }
        else{
            return "";
        }
    }
}
