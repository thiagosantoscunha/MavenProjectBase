package br.com.aimbra.inspection.controllers;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.aimbra.inspection.business.CityService;
import br.com.aimbra.inspection.business.CityServiceImpl;
import br.com.aimbra.inspection.entities.City;

public class CityController {

	private CityService cityService;

	public CityController(EntityManager em) {
		this.cityService = new CityServiceImpl(em);
	}

	public City create(City city) {
		return this.cityService.create(city);
	}

	public List<City> findAll() {
		return this.cityService.findAll();
	}

	public City findById(Long id) {
		return this.cityService.findById(id);
	}

	public City findByName(City city) {
		return this.cityService.findByName(city);
	}

	public City update(City city) {
		return this.cityService.update(city);
	}

	public City delete(City city) {
		return this.cityService.delete(city);
	}
}
