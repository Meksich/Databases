package ua.lviv.iot.controller.implementation;


import ua.lviv.iot.controller.AbstractControllerImpl;
import ua.lviv.iot.model.dao.implementation.BusDAOImpl;
import ua.lviv.iot.model.entity.Bus;

public class BusControllerImpl extends AbstractControllerImpl<Bus> {
    public BusControllerImpl(){
        super(new BusDAOImpl());
    }
}
