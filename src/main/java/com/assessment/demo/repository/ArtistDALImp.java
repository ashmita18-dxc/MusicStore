package com.assessment.demo.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.assessment.demo.model.Artist;

@Repository
public class ArtistDALImp implements ArtistDAL{
	
	@Autowired
	private MongoTemplate mongotemp;

	@Override
	public Artist create(Artist ar) {
		return mongotemp.save(ar);
	}

	@Override
	public List<Artist> findAll() {
		return mongotemp.findAll(Artist.class);
		
	}

	@Override
	public Boolean delete(Artist ar) {
		// TODO Auto-generated method stub
		return mongotemp.remove(ar).wasAcknowledged();
	}

	@Override
	public Artist update(String id, Artist artist) {
		// TODO Auto-generated method stub
		Query query= new Query();
		query.addCriteria(Criteria.where("id").is(id));
		return mongotemp.save(artist);
	}

	@Override
	public Artist findById(String id) {
		// TODO Auto-generated method stub
		return mongotemp.findAndRemove(new Query(Criteria.where("id").is(id)), Artist.class);
	}
	

}
