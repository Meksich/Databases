package ua.lviv.iot.controller.implementation;

import ua.lviv.iot.controller.AbstractControllerImpl;
import ua.lviv.iot.model.dao.implementation.BusRentedDAOImpl;
import ua.lviv.iot.domain.BusRented;

public class BusRentedControllerImpl extends AbstractControllerImpl<BusRented> {
    public BusRentedControllerImpl(){
        super(new BusRentedDAOImpl());
    }
}
