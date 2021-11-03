package ua.lviv.iot.model.dao.implementation;


import ua.lviv.iot.model.dao.AbstractDAOImpl;
import ua.lviv.iot.model.entity.Bus;

public class BusDAOImpl extends AbstractDAOImpl<Bus, Integer> {
    public BusDAOImpl(){
        super(Bus.class);
    }
}
