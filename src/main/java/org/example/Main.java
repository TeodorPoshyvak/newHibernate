package org.example;

import org.example.entity.Client;
import org.example.entity.Planet;
import org.example.entity.Ticket;
import org.example.service.ClientService;
import org.example.service.PlanetService;
import org.example.service.TicketService;
import java.time.ZonedDateTime;

public class Main {
    public static void main(String[] args) {
        ClientService clientService = new ClientService();
        PlanetService planetService = new PlanetService();
        TicketService ticketService = new TicketService();

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

    public static Ticket createTicket(Long id, ZonedDateTime create_at, Client client, Planet from_planet, Planet to_planet){
        Ticket ticket = new Ticket();
        ticket.setId(id);
        ticket.setCreate_at(create_at);
        ticket.setClient(client);
        ticket.setFrom_planet(from_planet);
        ticket.setTo_planet(to_planet);
        return ticket;
    }

}