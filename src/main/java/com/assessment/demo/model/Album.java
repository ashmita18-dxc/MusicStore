package com.assessment.demo.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Album {
	@Id
	private String albumId;
	private String albumName;
	
	@DBRef
	private List<Track> track;
	
	@DBRef
	private List<Artist> artist;

	public Album() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Album(String albumId, String albumName, List<Track> track) {
		super();
		this.albumId = albumId;
		this.albumName = albumName;
		this.track = track;
	}

	public String getAlbumId() {
		return albumId;
	}

	public void setAlbumId(String albumId) {
		this.albumId = albumId;
	}

	public String getAlbumName() {
		return albumName;
	}

	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}

	public List<Track> getTrack() {
		return track;
	}

	public void setTrack(List<Track> track) {
		this.track = track;
	}
}
