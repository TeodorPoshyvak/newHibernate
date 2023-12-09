package org.example.service;

import org.example.entity.Planet;
import org.example.entityDAO.planet.PlanetDaoImpl;

import java.util.List;

public class PlanetService {
    private PlanetDaoImpl planetDao = new PlanetDaoImpl();

    public boolean savePlanet(Planet planet) {
        return planetDao.createPlanet(planet);
    }

    public boolean updatePlanet(Planet planet) {
        return planetDao.updatePlanet(planet);
    }

    public Planet findPlanetByID(String planetid) {
        return planetDao.getPlanetByID(planetid);
    }

    public List<Planet> findAllPlanet() {
        return planetDao.getAllPlanet();
    }

    public void deletePlanet(Planet planet) {
        planetDao.deletePlanet(planet);
    }

    public void deletePlanetById(String planetId) {
        planetDao.deletePlanetByID(planetId);
    }
}
