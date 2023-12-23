package org.example.entityDAO.ticket;

import org.example.entity.Ticket;
import org.example.entityDAO.Dao;
import org.example.hibernate.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import java.util.List;

public class TicketDaoImpl implements Dao<Ticket> {

    private SessionFactory sessionFactory = HibernateUtils.getInstance().getSessionFactory();

    @Override
    public boolean createEntity(Ticket entity) {
        boolean result = false;
        try(Session session = sessionFactory.openSession()){
            Transaction transaction = session.beginTransaction();
            session.persist(entity);
            transaction.commit();
            result = true;
        }
        return result;
    }

    @Override
    public boolean updateEntity(Ticket entity) {
        boolean result = false;
        try(Session session = sessionFactory.openSession()){
            Transaction transaction = session.beginTransaction();
            session.merge(entity);
            transaction.commit();
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public void deleteEntity(Ticket entity) {
        try(Session session = sessionFactory.openSession()){
            Transaction transaction = session.beginTransaction();
            session.remove(entity);
            transaction.commit();
        }
    }

    public void deleteEntityByID(Long ticketId) {
        try(Session session = sessionFactory.openSession()){
            Transaction transaction = session.beginTransaction();
            Ticket ticket = session.get(Ticket.class, ticketId);
            session.remove(ticket);
            transaction.commit();
        }
    }

    public Ticket getEntityByID(Long ticketId) {
        try(Session session = sessionFactory.openSession()){
            return  session.get(Ticket.class, ticketId);
        }
    }
    @Override
    public List<Ticket> getAllEntity() {
        try(Session session = sessionFactory.openSession()){
            return session.createQuery("from Ticket", Ticket.class).list();
        }
    }
}
