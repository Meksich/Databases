package ua.lviv.iot.model.dao.implementation;

import ua.lviv.iot.model.dao.impl.HospitalDaoImpl;
import ua.lviv.iot.model.entity.patient.Hospital;

public class RouteDAOImpl extends AbstractControllerImpl<Hospital, Integer> {
    public RouteDAOImpl(){
        super(new HospitalDaoImpl());
    }
}
