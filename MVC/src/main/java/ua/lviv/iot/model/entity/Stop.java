package ua.lviv.iot.model.entity;

import ua.lviv.iot.model.dao.impl.PatientDaoImpl;
import ua.lviv.iot.model.entity.patient.Patient;

public class Stop extends AbstractControllerImpl<Patient, Integer> {
    public Stop(){
        super(new PatientDaoImpl());
    }
}
