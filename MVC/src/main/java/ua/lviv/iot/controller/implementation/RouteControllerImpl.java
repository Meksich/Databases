package ua.lviv.iot.controller.implementation;

import ua.lviv.iot.controller.AbstractControllerImpl;
import ua.lviv.iot.model.dao.implementation.RouteDAOImpl;
import ua.lviv.iot.model.entity.Route;

public class RouteControllerImpl extends AbstractControllerImpl<Route> {
    public RouteControllerImpl(){
        super(new RouteDAOImpl());
    }
}
