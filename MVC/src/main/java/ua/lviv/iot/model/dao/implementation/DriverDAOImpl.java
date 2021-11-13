package ua.lviv.iot.model.dao.implementation;

import ua.lviv.iot.model.dao.AbstractDAOImpl;
import ua.lviv.iot.model.entity.Driver;

public class DriverDAOImpl extends AbstractDAOImpl<Driver> {
    public DriverDAOImpl(){
        super(Driver.class);
    }
}
