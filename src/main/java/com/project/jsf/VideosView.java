package com.project.jsf;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class VideosView {
	private List<String> videos;
	
	@PostConstruct
	public void init() {
		videos = new ArrayList<String>();
		for(int i=1; i<2; i++) {
			videos.add("http://localhost:8080/JSF2App/nature1.jpg");
		}
	}
	
	public List<String> getVideos() {
		return videos;
	}
	
	public void setVideos(List<String> videos) {
		this.videos = videos;
	}

}
