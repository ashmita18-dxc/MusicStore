package com.assessment.demo.repository;

import java.util.List;

import com.assessment.demo.model.Artist;

public interface ArtistDAL {

	Artist create(Artist ar);
	
	List<Artist> findAll();
	
	Boolean delete(Artist ar);
	
	Artist update(String id, Artist artist);

	Artist findById(String id);
}
