package com.project.jsf;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="likeBean")
@SessionScoped
public class LikeBean {
	private Map<String, Boolean> items;
	@PostConstruct
	public void init() {
		items = new HashMap<String, Boolean>();
		items.put("I play football", true);
		items.put("I watch movies",false);
		items.put("I like to traval",false);
		items.put("I am foodie",true);
	}
		
	public void setitems(Map<String, Boolean> items) {
		this.items = items;
	}
	
	public Map<String, Boolean> getitems() {
		return items;
	}
}