package org.example.service;

import org.example.entity.Client;
import org.example.entityDAO.client.ClientDaoImpl;
import java.util.List;

public class ClientService {
    private ClientDaoImpl clientDao = new ClientDaoImpl();

    public boolean saveClient(Client client) {
        return clientDao.createEntity(client);
    }

    public boolean updateClient(Client client) {
        return clientDao.updateEntity(client);
    }

    public Client findClientByID(Long clientId) {
        return clientDao.getEntityByID(clientId);
    }

    public List<Client> findAllClient() {
        return clientDao.getAllEntity();
    }

    public void deleteClient(Client client) {
        clientDao.deleteEntity(client);
    }

    public void deleteClientById(Long clientId) {
        clientDao.deleteEntityByID(clientId);
    }
}
