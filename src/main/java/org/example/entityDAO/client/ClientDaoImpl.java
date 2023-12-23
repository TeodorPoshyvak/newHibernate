package org.example.entityDAO.client;

import org.example.entity.Client;
import org.example.entityDAO.Dao;
import org.example.hibernate.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import java.util.List;

public class ClientDaoImpl implements Dao<Client> {

    SessionFactory sessionFactory = HibernateUtils.getInstance().getSessionFactory();

    @Override
    public boolean createEntity(Client entity) {
        boolean result = false;
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            session.persist(entity);
            transaction.commit();
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public boolean updateEntity(Client entity) {
        boolean result = false;
        try (Session session = sessionFactory.openSession()) {
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
    public void deleteEntity(Client entity) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            session.remove(entity);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteEntityByID(Long clientId) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            Client client = session.get(Client.class, clientId);
            session.remove(client);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Client getEntityByID(Long clientId) {
        try (Session session = HibernateUtils.getInstance().getSessionFactory().openSession()) {
            Client client = session.get(Client.class, clientId);
            return client;
        }
    }

    @Override
    public List<Client> getAllEntity() {
        try (Session session = sessionFactory.openSession()) {
            return session.createQuery("from Client", Client.class).list();
        }
    }
}
