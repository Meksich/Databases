package ua.lviv.iot.model.dao.implementation;

import ua.lviv.iot.model.dao.AbstractDAOImpl;
import ua.lviv.iot.model.entity.BusRented;

public class BusRentedDAOImpl extends AbstractDAOImpl<BusRented> {
    public BusRentedDAOImpl(){
        super(BusRented.class);
    }
}

