package com.assessment.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.assessment.demo.model.Track;
import com.assessment.demo.repository.TrackDAL;

@RestController
public class TrackController {
	
	@Autowired
	private TrackDAL trackDal;
	
	@PostMapping("/tracks")
	public void create(@RequestBody Track t) {
		trackDal.create(t);
	}
	
	@GetMapping("/tracks")
		public List<Track> findAll(){
			return trackDal.findAll();
		}
	
	@DeleteMapping("/tracks/{id}")
	public Track delete(@PathVariable String id){
		Track deletedAlbum = trackDal.findById(id);
		if(trackDal.delete(deletedAlbum))
			return deletedAlbum;
		else
			return null;
	}
	
	@PutMapping("/tracks/{id}")
	public Track update(@PathVariable String id, @RequestBody Track track){
		return trackDal.update(id, track);
	}
}
