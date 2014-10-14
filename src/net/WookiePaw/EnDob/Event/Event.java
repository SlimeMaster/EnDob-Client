/****************************************************************************************************************/
/* Copyright 2014 Walt Pach, Lowell Davis, all rights reserved. Released under the EnDob Lesser Public License. */
/****************************************************************************************************************/
package net.WookiePaw.EnDob.Event;

import java.util.EventObject;
import net.WookiePaw.EnDob.EventType;


public class Event extends EventObject{
    public Event(Object source){
        super(source);
    }
    
    public EventType getType(){
        return null; 
    }
}
