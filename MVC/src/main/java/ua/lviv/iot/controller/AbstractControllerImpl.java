package ua.lviv.iot.controller;

import ua.lviv.iot.model.dao.AbstractDAO;

import java.sql.SQLException;
import java.util.List;

public class AbstractControllerImpl<Entity, Id> implements AbstractController<Entity, Id>{
    private AbstractDAO<Entity, Id> dao;

    public AbstractControllerImpl(AbstractDAO dao){
        this.dao = dao;
    }

    @Override
    public List<Entity> getAll() throws SQLException {
        return null;
    }

    @Override
    public Entity get(Id id) throws SQLException {
        return null;
    }

    @Override
    public boolean update(Id id, Entity entity) throws SQLException {
        return true;
    }

    @Override
    public boolean delete(Id id) throws SQLException {
        return true;
    }

    @Override
    public boolean create(Entity entity) throws SQLException {
        return true;
    }
}
