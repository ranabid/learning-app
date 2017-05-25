package com.project.jsf;

public class MetaData {
	
	private String applicationName;
	private String groupName;
	private int applicationId;
	private int groupId;
	private Boolean editable;
	
	
	public MetaData(String app, String group, int appId, int groupId) {
		applicationName = app;
		groupName = group;
		applicationId = appId;
		this.groupId = groupId;
		this.editable = false;
	}
	
	public void edit() {
		if(this.editable == false) {
			this.editable = true;
		} else {
			this.editable = false;
		}
		
	}
	
	public Boolean getEditable() {
		return editable;
	}
	
	public void setEditable(Boolean editable) {
		this.editable = editable;
	}

	public String getApplicationName() {
		return applicationName;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public int getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}

	public int getGroupId() {
		return groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}
}
