package org.example.entityDAO.client;

import org.example.entity.Client;

import java.util.List;

public interface ClientDao {
    boolean createClient(Client client);

    boolean updateClient(Client client);

    Client getClientByID(Long clientId);

    List<Client> getAllClient();

    void deleteClientByID(Long clientId);

    void deleteClient(Client client);
}
