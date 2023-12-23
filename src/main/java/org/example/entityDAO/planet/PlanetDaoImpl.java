package org.example.entityDAO.planet;

import org.example.entity.Planet;
import org.example.entityDAO.Dao;
import org.example.hibernate.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import java.util.List;

public class PlanetDaoImpl implements Dao<Planet> {

    private SessionFactory sessionFactory = HibernateUtils.getInstance().getSessionFactory();

    @Override
    public boolean createEntity(Planet entity) {
        boolean result = false;
        try (Session session = sessionFactory.openSession()) {
            Transaction tx = session.beginTransaction();
            session.persist(entity);
            tx.commit();
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public boolean updateEntity(Planet entity) {
        boolean result = false;
        try (Session session = sessionFactory.openSession()) {
            Transaction tx = session.beginTransaction();
            session.merge(entity);
            tx.commit();
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }


    @Override
    public void deleteEntity(Planet entity) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            session.remove(entity);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteByID(String entityId) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            Planet planet = session.get(Planet.class, entityId.toUpperCase());
            session.remove(planet);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Planet getEntityByID(String planetId) {
        try (Session session = sessionFactory.openSession()) {
            return session.get(Planet.class, planetId);
        }
    }
    @Override
    public List<Planet> getAllEntity() {
        try(Session session = sessionFactory.openSession()){
            return session.createQuery("from Planet", Planet.class).list();
        }
    }
}
