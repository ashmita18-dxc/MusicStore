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

import com.assessment.demo.model.Album;
import com.assessment.demo.repository.AlbumDAL;

@RestController
public class AlbumController {
	
	@Autowired
	private AlbumDAL albumDal;
	
	@PostMapping("/albums")
	public void create(@RequestBody Album al) {
		albumDal.create(al);
	}
	
	@GetMapping("/albums")
		public List<Album> findAll(){
			return albumDal.findAll();
		}
	
	@PutMapping("/albums/{id}")
	public Album update(@PathVariable String id, @RequestBody Album album){
		return albumDal.update(id, album);
	}
	
	@DeleteMapping("/albums/{id}")
	public Album delete(@PathVariable String id){
		Album deletedAlbum = albumDal.findById(id);
		if(albumDal.delete(deletedAlbum))
			return deletedAlbum;
		else
			return null;
		
	}
}
