/****************************************************************************************************************/
/* Copyright 2014 Walt Pach, Lowell Davis, all rights reserved. Released under the EnDob Lesser Public License. */
/****************************************************************************************************************/
package net.WookiePaw.EnDob.Location;

import com.cubes.Vector3Int;
import com.jme3.math.Vector3f;


public class Location {
    private Vector3f loc;
    private World w;
    private float x, y, z;
    
    public Location(float x, float y, float z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public Location(Vector3f loc){
        this.loc = loc;
    }
    
    public Location(World w, float x, float y, float z){
        this.w = w;
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public Location(World w, Vector3f loc){
        this.w = w;
        this.x = loc.getX();
        this.y = loc.getY();
        this.z = loc.getZ();
        this.loc = loc;
    }
    
    public Vector3f toVector3f(){
        return new Vector3f(x, y, z);
    }
    
    public Vector3Int toVector3Int(){
        return new Vector3Int((int)x, (int)y, (int) z);
    }
}
