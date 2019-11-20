package com.assessment.demo.repository;

import java.util.List;

import com.assessment.demo.model.Track;

public interface TrackDAL {

	Track create(Track t);
	
	List<Track> findAll();
	
	Boolean delete(Track t);
	
	Track update(String id, Track t);

	Track findById(String id);
}
