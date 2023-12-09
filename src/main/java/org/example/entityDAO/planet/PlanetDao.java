package org.example.entityDAO.planet;

import org.example.entity.Planet;

import java.util.List;

public interface PlanetDao {
    boolean createPlanet(Planet planet);

    boolean updatePlanet(Planet planet);

    void deletePlanetByID(String planetId);

    void deletePlanet(Planet planet);

    Planet getPlanetByID(String planetId);

    List<Planet> getAllPlanet();
}
