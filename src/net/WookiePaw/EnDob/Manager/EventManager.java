/****************************************************************************************************************/
/* Copyright 2014 Walt Pach, Lowell Davis, all rights reserved. Released under the EnDob Lesser Public License. */
/****************************************************************************************************************/
package net.WookiePaw.EnDob.Manager;

import javax.swing.event.EventListenerList;
import net.WookiePaw.EnDob.Event.Event;
import net.WookiePaw.EnDob.Event.Listener;


public class EventManager {
  protected EventListenerList listenerList = new EventListenerList();

  public void addMyEventListener(Listener listener) {
    listenerList.add(Listener.class, listener);
  }
  public void removeMyEventListener(Listener listener) {
    listenerList.remove(Listener.class, listener);
  }
  
  public void fireMyEvent(Event evt) {
    Object[] listeners = listenerList.getListenerList();
    for (int i = 0; i < listeners.length; i = i+2) {
      if (listeners[i] == Listener.class) {
        ((Listener) listeners[i+1]).onEvent(evt);
      }
    }
  }
}
