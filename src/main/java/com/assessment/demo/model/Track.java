package com.assessment.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Track {
	@Id
	private String trackId;
	private String trackName;
	private String trackGenre;
	public String getTrackId() {
		return trackId;
	}
	public void setTrackId(String trackId) {
		this.trackId = trackId;
	}
	public String getTrackName() {
		return trackName;
	}
	public void setTrackName(String trackName) {
		this.trackName = trackName;
	}
	public String getTrackGenre() {
		return trackGenre;
	}
	public void setTrackGenre(String trackGenre) {
		this.trackGenre = trackGenre;
	}
	public Track() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Track(String trackId, String trackName, String trackGenre) {
		super();
		this.trackId = trackId;
		this.trackName = trackName;
		this.trackGenre = trackGenre;
	}

}
