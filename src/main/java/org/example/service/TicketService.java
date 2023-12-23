package org.example.service;

import org.example.entity.Ticket;
import org.example.entityDAO.ticket.TicketDaoImpl;
import java.util.List;

public class TicketService {

    TicketDaoImpl ticketDao = new TicketDaoImpl();

    public boolean saveTicket(Ticket ticket){return ticketDao.createEntity(ticket); }

    public boolean updateTicket(Ticket ticket){return ticketDao.updateEntity(ticket);}

    public void deleteTicketById(Long ticketId){ticketDao.deleteEntityByID(ticketId);}

    public void deleteTicket(Ticket ticket){ticketDao.deleteEntity(ticket);}

    public Ticket findTicketById(Long ticketId){return ticketDao.getEntityByID(ticketId);}

    public List<Ticket> findAllTicket(){return ticketDao.getAllEntity();}
}
