package com.assessment.demo.repository;

import java.util.List;

import com.assessment.demo.model.Album;

public interface AlbumDAL {
	
	Album create(Album al);
	
	List<Album> findAll();
	
	public Boolean delete(Album album);
	
	Album update(String id, Album album);

	Album findById(String id);

}
