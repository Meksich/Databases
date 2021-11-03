package ua.lviv.iot.controller.implementation;

import ua.lviv.iot.model.dao.implementation.DriverDAOImpl;
import ua.lviv.iot.model.entity.drug.Drug;

public class DriverControllerImpl extends AbstractControllerImpl<Drug, Integer> {
    public DriverControllerImpl(){
        super(new DriverDAOImpl());
    }
}
