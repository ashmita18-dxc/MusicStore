package com.assessment.demo.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.assessment.demo.model.Track;

@Repository
public class TrackDALImp implements TrackDAL{
	
	@Autowired
	private MongoTemplate mongotemp;

	@Override
	public Track create(Track t) {
		return mongotemp.save(t);
	}

	@Override
	public List<Track> findAll() {
		return mongotemp.findAll(Track.class);
	}

	@Override
	public Boolean delete(Track t) {
		// TODO Auto-generated method stub
		return mongotemp.remove(t).wasAcknowledged();
	}

	@Override
	public Track update(String id, Track t) {
		// TODO Auto-generated method stub
		Query query= new Query();
		query.addCriteria(Criteria.where("id").is(id));
		return mongotemp.save(t);
	}

	@Override
	public Track findById(String id) {
		// TODO Auto-generated method stub
		return mongotemp.findAndRemove(new Query(Criteria.where("id").is(id)), Track.class);
	}
	
	
}
