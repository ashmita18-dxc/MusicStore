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

import com.assessment.demo.model.Artist;
import com.assessment.demo.repository.ArtistDAL;

@RestController
public class ArtistController {
	
	@Autowired
	private ArtistDAL artistDal;
	
	@PostMapping("/artists")
	public void create(@RequestBody Artist ar) {
		artistDal.create(ar);
	}
	
	@GetMapping("/artists")
		public List<Artist> findAll(){
			return artistDal.findAll();
		}
	
	@DeleteMapping("/artists/{id}")
	public Artist delete(@PathVariable String id){
		Artist deletedart = artistDal.findById(id);
		if(artistDal.delete(deletedart))
			return deletedart;
		else
			return null;
		
	}
	@PutMapping("/artists/{id}")
	public Artist update(@PathVariable String id, @RequestBody Artist artist){
		return artistDal.update(id, artist);
	}
	}