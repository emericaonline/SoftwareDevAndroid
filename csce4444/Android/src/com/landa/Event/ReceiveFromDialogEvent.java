package com.landa.Event;

import com.landa.backend.Item;

public class ReceiveFromDialogEvent{
    public Item item;
    public int index;
    public String message;

	public ReceiveFromDialogEvent(String message) {
    	this.message = message;
	}

}
