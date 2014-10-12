/****************************************************************************************************************/
/* Copyright 2014 Walt Pach, Lowell Davis, all rights reserved. Released under the EnDob Lesser Public License. */
/****************************************************************************************************************/
package net.WookiePaw.EnDob;

import com.jme3.app.SimpleApplication;
import com.jme3.bullet.control.RigidBodyControl;
import com.jme3.scene.Spatial;
import com.jme3.system.AppSettings;


public class EnDob extends SimpleApplication{
    public static EnDob game;
    
    private RigidBodyControl worldRigidBodyControl;
    private Spatial worldModel;
    
    public static void main(String[] args){
        game = new EnDob();
        AppSettings settings = new AppSettings(true);
        settings.setTitle("EnDob");
        game.setDisplayFps(true);
        game.setDisplayStatView(false);
        game.start();
    }
    
    @Override
    public void simpleInitApp() {
        
    } 
    
    @Override
    public void simpleUpdate(float tpf){
        
    }
    
    public RigidBodyControl getWorldRigidBodyControl(){
        return this.worldRigidBodyControl;
    }
    
    public Spatial getWorldModel(){
        return this.worldModel;
    }
}
