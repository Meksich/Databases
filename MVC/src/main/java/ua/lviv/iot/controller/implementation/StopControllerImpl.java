package ua.lviv.iot.controller.implementation;

import ua.lviv.iot.model.dao.impl.PatientDaoImpl;
import ua.lviv.iot.model.entity.patient.Patient;

public class StopControllerImpl extends AbstractControllerImpl<Patient, Integer> {
    public StopControllerImpl(){
        super(new PatientDaoImpl());
    }
}
