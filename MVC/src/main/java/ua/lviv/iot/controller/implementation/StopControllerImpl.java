package ua.lviv.iot.controller.implementation;

import ua.lviv.iot.controller.AbstractControllerImpl;
import ua.lviv.iot.model.dao.implementation.StopDAOImpl;
import ua.lviv.iot.model.entity.Stop;

public class StopControllerImpl extends AbstractControllerImpl<Stop> {
    public StopControllerImpl(){
        super(new StopDAOImpl());
    }
}
