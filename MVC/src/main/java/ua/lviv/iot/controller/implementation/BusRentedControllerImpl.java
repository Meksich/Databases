package ua.lviv.iot.controller.implementation;

import ua.lviv.iot.controller.AbstractControllerImpl;
import ua.lviv.iot.model.dao.implementation.BusRentedDAOImpl;
import ua.lviv.iot.model.entity.BusRented;

public class BusRentedControllerImpl extends AbstractControllerImpl<BusRented, Integer> {
    public BusRentedControllerImpl(){
        super(new BusRentedDAOImpl());
    }
}
