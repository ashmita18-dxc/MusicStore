package com.assessment.demo.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.assessment.demo.model.Album;

@Repository
public class AlbumDALImp implements AlbumDAL{
	
	@Autowired
	private MongoTemplate mongotemp;

	@Override
	public Album create(Album al) {
		return mongotemp.save(al);
	}

	@Override
	public List<Album> findAll() {
		return mongotemp.findAll(Album.class);
	}

	@Override
	public Boolean delete(Album album) {
		// TODO Auto-generated method stub
		return mongotemp.remove(album).wasAcknowledged();
	}

	@Override
	public Album update(String id, Album album) {
		// TODO Auto-generated method stub
		Query query= new Query();
		query.addCriteria(Criteria.where("id").is(id));
		return mongotemp.save(album);
	}

	@Override
	public Album findById(String id) {
		// TODO Auto-generated method stub
		return mongotemp.findAndRemove(new Query(Criteria.where("id").is(id)), Album.class);
	}

}
