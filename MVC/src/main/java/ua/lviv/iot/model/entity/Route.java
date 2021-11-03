package ua.lviv.iot.model.entity;

import ua.lviv.iot.model.dao.impl.HospitalDaoImpl;
import ua.lviv.iot.model.entity.patient.Hospital;

public class Route extends AbstractControllerImpl<Hospital, Integer> {
    public Route(){
        super(new HospitalDaoImpl());
    }
}
