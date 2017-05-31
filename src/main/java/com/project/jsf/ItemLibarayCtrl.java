package com.project.jsf;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

@ManagedBean(name="itemLibrary")
public class ItemLibarayCtrl {
	private List<Item> listItems;
	@PostConstruct
	public void init() {
		listItems = new ArrayList<Item>();
		listItems.add(new Item("Apple"));
		listItems.add(new Item("Orange"));
		listItems.add(new Item("Gauva"));
	}
	
	public List<Item> getListItems() {
		return listItems;
	}

}
