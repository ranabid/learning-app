package com.project.jsf;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="videoService")
@SessionScoped
public class VideoService {
	private List<Video> files;
	
	@PostConstruct
	public void init() {
		files = new ArrayList<Video>();
		for(int i=1; i<=6; i++) {
			String filename = "group_app_video_"+i;
			if(i%2 == 0) { 
				files.add(new Video(filename, "mp4", true));
			}
			else {
				files.add(new Video(filename, "mp4", false));
			}
		}
	}
	
	public void setFiles(List<Video> files) {
		this.files = files;
	}
	
	public List<Video> getFiles() {
		return files;
	}
}