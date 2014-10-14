/****************************************************************************************************************/
/* Copyright 2014 Walt Pach, Lowell Davis, all rights reserved. Released under the EnDob Lesser Public License. */
/****************************************************************************************************************/
package net.WookiePaw.EnDob.Event;

import net.WookiePaw.EnDob.EventType;


public class PlayerMoveEvent extends Event{
    public PlayerMoveEvent(Object source){
        super(source);
    }
    
    @Override
    public EventType getType(){
        return EventType.Player_Move;
    }
}
