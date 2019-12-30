package com.smati.location.controllers;



import java.util.List;
import java.util.Optional;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.smati.location.entities.Location;
import com.smati.location.repos.LocationRepository;
import com.smati.location.service.LocationService;
import com.smati.location.util.EmailUtil;
import com.smati.location.util.ReportUtil;

@Controller
public class LocationController {

	@Autowired
	LocationService service;
	@Autowired
	LocationRepository repository;
	@Autowired
	EmailUtil emailUtil;
	@Autowired
	ReportUtil reportUtil;
	@Autowired
	ServletContext sc;
	
	@RequestMapping("/showCreate")
	public String ShowHomePage() {
		
		return "CreateLocation";	
	}
	
	@RequestMapping("/saveLoc")
	public String saveLocation(@ModelAttribute("location")Location location,ModelMap modelMapd) {
		Location locationSaved = service.savelocation(location);
		String msg ="Location saved with id: " + locationSaved.getId();
		modelMapd.addAttribute("msg", msg);
		emailUtil.senEmail("formation983@gmail.com", "Location Saved", "Location saved successfully and about to return a response");
		return "!";
		
	}
	@RequestMapping("/displayLocations")
	public String displayLocations(ModelMap modelMap) {
		List<Location> locations = service.getAllLocation();
		modelMap.addAttribute("Locations", locations);
		return "displayLocations";
		
	}
	@RequestMapping("/deleteLocation")
	public String deleteLocation(@RequestParam("id") int id,ModelMap modelMap) {
		//Optional<Location> location = service.getLocationById(id);
		Location location = new Location();
		location.setId(id);
		service.deleteLocation(location);
		List<Location> locations = service.getAllLocation();
		modelMap.addAttribute("Locations", locations);
		return "displayLocations";
	}
	@RequestMapping("/showUpdate")
	public String showUpdate(@RequestParam("id") int id,ModelMap modelMap) {
		Optional<Location> location = service.getLocationById(id); 
		if (location.isPresent()) {
		    modelMap.addAttribute("location", location.get());
		}
		
		return"updateLocation";
		
	}
	@RequestMapping("/updateLoc")
	public String updateLocation(@ModelAttribute("location")Location location,ModelMap modelMap) {
		 service.updateLocation(location);
		 List<Location> locations = service.getAllLocation();
			modelMap.addAttribute("Locations", locations);
			return "displayLocations";
	}
	@RequestMapping("/generateReport")
	public String generateReport() {
		String path = sc.getRealPath("/");
		List<Object[]> data  = repository.findTypeAndTypeCount();
		reportUtil.generatePiechar(path, data);
		return "report";
	}
	
	


	
	
	 
}
