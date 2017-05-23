package com.project.jsf;

import java.util.Random;

public class Video {
	private int id;
	private String filename;
	private String videoFormat;
	private boolean active;
	
	public Video(String name, String format, boolean status) {
		filename = name;
		videoFormat = format;
		id = new Random().nextInt(1000);
		active = status;
	}
	
	
	
	public boolean isActive() {
		return active;
	}



	public void setActive(boolean active) {
		this.active = active;
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public String getVideoFormat() {
		return videoFormat;
	}
	public void setVideoFormat(String videoFormat) {
		this.videoFormat = videoFormat;
	}

}
