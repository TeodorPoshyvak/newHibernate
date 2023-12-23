package org.example.service;

import org.example.entity.Planet;
import org.example.entityDAO.planet.PlanetDaoImpl;
import java.util.List;

public class PlanetService {
    private PlanetDaoImpl planetDao = new PlanetDaoImpl();

    public boolean savePlanet(Planet planet) {
        return planetDao.createEntity(planet);
    }

    public boolean updatePlanet(Planet planet) {
        return planetDao.updateEntity(planet);
    }

    public Planet findPlanetByID(String planetId) {
        return planetDao.getEntityByID(planetId);
    }

    public List<Planet> findAllPlanet() {
        return planetDao.getAllEntity();
    }

    public void deletePlanet(Planet planet) {
        planetDao.deleteEntity(planet);
    }

    public void deletePlanetById(String planetId) {
        planetDao.deleteByID(planetId);
    }
}
