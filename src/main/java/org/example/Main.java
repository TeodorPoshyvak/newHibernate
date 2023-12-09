package org.example;

import org.example.entity.Client;
import org.example.entity.Planet;
import org.example.hibernate.HibernateUtils;
import org.example.service.ClientService;
import org.example.service.PlanetService;

public class Main {
    public static void main(String[] args) {
        ClientService clientService = new ClientService();
        PlanetService planetService = new PlanetService();
    }

    public static Client createClient(String name) {
        Client client = new Client();
        client.setName(name);
        return client;
    }

    public static Client createClient(Long id, String name) {
        Client client = new Client();
        client.setId(id);
        client.setName(name);
        return client;
    }

    public static Planet createPlanet(String id, String name) {
        Planet planet = new Planet();
        planet.setId(id);
        planet.setName(name);
        return planet;
    }

}