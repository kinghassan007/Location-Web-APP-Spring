package com.smati.location.service;

import java.util.List;
import java.util.Optional;

import com.smati.location.entities.Location;

public interface LocationService {

	Location savelocation(Location location);

	Location updateLocation(Location location);

	void deleteLocation(Location location);

	Optional<Location> getLocationById(int id);

	List<Location> getAllLocation();

	void deleteLocation(Optional<Location> location);
	Location updateLocation(Optional<Location> location);

}
