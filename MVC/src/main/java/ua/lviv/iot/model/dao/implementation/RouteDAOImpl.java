package ua.lviv.iot.model.dao.implementation;

import ua.lviv.iot.model.dao.AbstractDAOImpl;
import ua.lviv.iot.model.entity.Route;

public class RouteDAOImpl extends AbstractDAOImpl<Route, Integer> {
    public RouteDAOImpl(){
        super(Route.class);
    }
}
