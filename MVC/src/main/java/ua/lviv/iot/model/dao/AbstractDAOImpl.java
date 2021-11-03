package ua.lviv.iot.model.dao;

import ua.lviv.iot.model.dao.implementation.BusDAOImpl;

public class AbstractDAOImpl<Entity, Id> implements AbstractDAO<Entity, Id>{
    public AbstractDAOImpl(Class<Entity> entityClass){
    }
}
