/****************************************************************************************************************/
/* Copyright 2014 Walt Pach, Lowell Davis, all rights reserved. Released under the EnDob Lesser Public License. */
/****************************************************************************************************************/
package net.WookiePaw.EnDob.Event;

import java.util.EventListener;


public interface Listener extends EventListener {
    public void onEvent(Event e);
}
