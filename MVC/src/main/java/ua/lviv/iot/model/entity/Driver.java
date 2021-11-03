package ua.lviv.iot.model.entity;

import ua.lviv.iot.model.dao.implementation.DriverDAOImpl;
import ua.lviv.iot.model.entity.drug.Drug;

public class Driver extends AbstractControllerImpl<Drug, Integer> {
    public Driver(){
        super(new DriverDAOImpl());
    }
}
