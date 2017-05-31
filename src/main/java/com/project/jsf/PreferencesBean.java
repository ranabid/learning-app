package com.project.jsf;

import java.util.HashMap;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name="preferences")
@SessionScoped
public class PreferencesBean {
	private Map<String, Boolean> showPanel = new HashMap<String, Boolean>();
	
	public void init() { 	
		showPanel.put("Application", true);
		showPanel.put("Groups", false);
		showPanel.put("Favorite Videos", false);
	}
	
	public void enablePanel() {
		Integer panelId = Integer.parseInt(FacesContext.getCurrentInstance().getExternalContext()
				.getRequestParameterMap().get("preferenceType"));
		switch (panelId) {
		case 2:
			System.out.println("Groups");
			showPanel.put("Application", false);
			showPanel.put("Groups", true);
			showPanel.put("Favorite Videos", false);
			break;
		case 3:
			System.out.println("Favorite Videos");
			showPanel.put("Application", false);
			showPanel.put("Groups", false);
			showPanel.put("Favorite Videos", true);
			break;
		default:
			System.out.println("Application");
			showPanel.put("Application", true);
			showPanel.put("Groups", false);
			showPanel.put("Favorite Videos", false);
			break;
		}
	}
	
	public Map<String, Boolean> getShowPanel() {
		return showPanel;
	}
	
	public void setShowPanel(Map<String, Boolean> showPanel) {
		this.showPanel = showPanel;
	}
	
}
