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
	private List<MetaData> metaData;
	
	
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
		
		metaData = new ArrayList<MetaData>();
		metaData.add(new MetaData("Northstar", "CC Tech", 101, 201));
		metaData.add(new MetaData("Maestro", "CC Tech", 102, 202));
		metaData.add(new MetaData("GBI", "EDW", 106, 206));
		metaData.add(new MetaData("Blueprint", "CC Tech", 103, 203));
		metaData.add(new MetaData("Call Recorder", "CC Tech", 104, 204));
		metaData.add(new MetaData("iLog", "GCRM", 105, 205));
		
		
		
		
		
		
	}
	public void delete(MetaData obj) {
		System.out.println(obj.getApplicationId());
		metaData.remove(obj);
	}
	
	public List<MetaData> getMetaData() {
		return metaData;
	}


	public void setMetaData(List<MetaData> metaData) {
		this.metaData = metaData;
	}


	public void setFiles(List<Video> files) {
		this.files = files;
	}
	
	public List<Video> getFiles() {
		return files;
	}
}