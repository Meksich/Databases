package ua.lviv.iot.controller.implementation;

import ua.lviv.iot.controller.AbstractControllerImpl;
import ua.lviv.iot.model.dao.implementation.DriverDAOImpl;
import ua.lviv.iot.model.entity.Driver;

public class DriverControllerImpl extends AbstractControllerImpl<Driver> {
    public DriverControllerImpl(){
        super(new DriverDAOImpl());
    }
}
