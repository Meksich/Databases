package ua.lviv.iot.controller.implementation;

import ua.lviv.iot.model.dao.impl.HospitalDaoImpl;
import ua.lviv.iot.model.entity.patient.Hospital;

public class RouteControllerImpl extends AbstractControllerImpl<Hospital, Integer> {
    public RouteControllerImpl(){
        super(new HospitalDaoImpl());
    }
}
