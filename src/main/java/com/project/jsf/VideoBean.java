package com.project.jsf;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name="videoBean")
@SessionScoped
public class VideoBean{
	private String videoFileUrl;
	private String fileName;
	private List<Video> listVideos;
	private List<String> items;
	
	public VideoBean() {
		System.out.println("inside post construct");
		items = new ArrayList<>();
		items.add("Hello");
		items.add("World");
		
		listVideos = new ArrayList<>();
		listVideos.add(new Video("Northstar", "http://a1.phobos.apple.com/us/r1000/000/Features/atv/AutumnResources/videos/b1-1.mov", true));
		listVideos.add(new Video("Maestro", "http://a1.phobos.apple.com/us/r1000/000/Features/atv/AutumnResources/videos/b1-1.mov", true));

		listVideos.add(new Video("Call Recorder", "http://a1.phobos.apple.com/us/r1000/000/Features/atv/AutumnResources/videos/b1-1.mov", true));
		listVideos.add(new Video("Blueprint", "http://a1.phobos.apple.com/us/r1000/000/Features/atv/AutumnResources/videos/b1-1.mov", true));
		
		listVideos.add(new Video("iSell", "http://a1.phobos.apple.com/us/r1000/000/Features/atv/AutumnResources/videos/b1-1.mov", true));
		listVideos.add(new Video("skye", "http://a1.phobos.apple.com/us/r1000/000/Features/atv/AutumnResources/videos/b1-1.mov", true));
	}
	
	public String init() {
		System.out.println("Inside init method");
		FacesContext fc = FacesContext.getCurrentInstance();
		Map<String, String> params = fc.getExternalContext().getRequestParameterMap();
		this.videoFileUrl = params.get("fileUrl");
		this.fileName = params.get("fileName");
		System.out.println("File name: "+fileName);
		return "success";
	}
	
	public String getVideoFileUrl() {
		return videoFileUrl;
	}
	public void setVideoFileUrl(String videoFileUrl) {
		this.videoFileUrl = videoFileUrl;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public List<Video> getListVideos() {
		return listVideos;
	}

	public void setListVideos(List<Video> listVideos) {
		this.listVideos = listVideos;
	}

	public List<String> getItems() {
		return items;
	}

	public void setItems(List<String> items) {
		this.items = items;
	}
	
	

}
