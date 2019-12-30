package com.smati.location.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smati.location.entities.Location;
import com.smati.location.repos.LocationRepository;

@Service
public class LocationServiceImpl implements LocationService {
	@Autowired
	private LocationRepository repository;

	public LocationRepository getRepository() {
		return repository;
	}

	public void setRepository(LocationRepository repository) {
		this.repository = repository;
	}

	@Override
	public Location savelocation(Location location) {
		return repository.save(location);
	}

	@Override
	public Location updateLocation(Location location) {
		return repository.save(location);
	}

	@Override
	public void deleteLocation(Location location) {
		repository.delete(location);
	}

	@Override
	public Optional<Location> getLocationById(int id) {
		return repository.findById(id);
	}

	@Override
	public List<Location> getAllLocation() {
		
		return repository.findAll() ;
	}

	@Override
	public void deleteLocation(Optional<Location> location) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Location updateLocation(Optional<Location> location) {
		// TODO Auto-generated method stub
		return null;
	}

}
