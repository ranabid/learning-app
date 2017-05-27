package com.project.jsf;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.primefaces.context.RequestContext;

@ManagedBean(name="likeBean")
@SessionScoped
public class LikeBean {
	private Map<String, Boolean> items;
	private List<String> cities;
	private List<String> selectedCities;
	
	
	public void remove() {
		
		List<String> removeCities = new ArrayList<String>();
		for(String str: selectedCities) {
			removeCities.add(str);
		}
		
		cities.clear();
		selectedCities.clear();
		
		cities.addAll(removeCities);
		selectedCities.addAll(cities);
		FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", "Changes has been saved!"));
	}
	
	public List<String> getSelectedCities() {
		return selectedCities;
	}



	public void setSelectedCities(List<String> selectedCities) {
		this.selectedCities = selectedCities;
	}

	public void init() {
		items = new HashMap<String, Boolean>();
		items.put("I play football", true);
		items.put("I watch movies",false);
		items.put("I like to traval",false);
		items.put("I am foodie",true);
		
		cities = new ArrayList<String>();
		selectedCities = new ArrayList<String>();
		
		cities.add("Delhi");
		cities.add("Mumbai");
		cities.add("Kolkata");
		
		selectedCities.addAll(cities);		
	}
		
	
	
	public Map<String, Boolean> getItems() {
		return items;
	}



	public void setItems(Map<String, Boolean> items) {
		this.items = items;
	}



	public List<String> getCities() {
		return cities;
	}



	public void setCities(List<String> cities) {
		this.cities = cities;
	}



	public List<String> getSelectCities() {
		return selectedCities;
	}



	public void setSelectCities(List<String> selectCities) {
		this.selectedCities = selectCities;
	}



	public void setitems(Map<String, Boolean> items) {
		this.items = items;
	}
	
	public Map<String, Boolean> getitems() {
		return items;
	}
	
	public void toggle() {
		RequestContext context = RequestContext.getCurrentInstance();
		context.addCallbackParam("name", "Rana");
		System.out.println("Hello world");
		context.execute("$('#clickbuttonid').click()");
		
		
	}
	
	
}