package com.assessment.demo.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Artist {
	@Id
	private String artistId;
	private String artistName;
	
	@DBRef
	private List<Album> album;
	
	@DBRef
	private List<Track> track;
	
	public Artist() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Artist(String artistId, String artistName, List<Album> album, List<Track> track) {
		super();
		this.artistId = artistId;
		this.artistName = artistName;
		this.album = album;
		this.track = track;
	}

	public String getArtistId() {
		return artistId;
	}

	public void setArtistId(String artistId) {
		this.artistId = artistId;
	}

	public String getArtistName() {
		return artistName;
	}

	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}

	public List<Album> getAlbum() {
		return album;
	}

	public void setAlbum(List<Album> album) {
		this.album = album;
	}

	public List<Track> getTrack() {
		return track;
	}

	public void setTrack(List<Track> track) {
		this.track = track;
	}

}
