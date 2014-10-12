/****************************************************************************************************************/
/* Copyright 2014 Walt Pach, Lowell Davis, all rights reserved. Released under the EnDob Lesser Public License. */
/****************************************************************************************************************/
package net.WookiePaw.EnDob.Manager;


public interface Manager {
    public Class<? extends Manager>getManager();
    public String getManagerName();
    public void init();
}
