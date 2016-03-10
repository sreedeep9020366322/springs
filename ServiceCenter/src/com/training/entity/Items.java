package com.training.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("items")
public class Items {

	@Value("Samsung")
	private String itemName;

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Items() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Items [itemName=" + itemName + "]";
	}
	
	
}
