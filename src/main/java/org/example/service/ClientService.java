package org.example.service;

import org.example.entity.Client;
import org.example.entityDAO.client.ClientDaoImpl;

import java.util.List;

public class ClientService {
    private ClientDaoImpl clientDao = new ClientDaoImpl();

    public boolean saveClient(Client client) {
        return clientDao.createClient(client);
    }

    public boolean updateClient(Client client) {
        return clientDao.updateClient(client);
    }

    public Client findClientByID(Long clientId) {
        return clientDao.getClientByID(clientId);
    }

    public List<Client> findAllClient() {
        return clientDao.getAllClient();
    }

    public void deleteClient(Client client) {
        clientDao.deleteClient(client);
    }

    public void deleteClientById(Long clientId) {
        clientDao.deleteClientByID(clientId);
    }
}
