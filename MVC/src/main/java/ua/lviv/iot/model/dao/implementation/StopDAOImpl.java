package ua.lviv.iot.model.dao.implementation;

import ua.lviv.iot.model.dao.impl.PatientDaoImpl;
import ua.lviv.iot.model.entity.patient.Patient;

public class StopDAOImpl extends AbstractControllerImpl<Patient, Integer> {
    public StopDAOImpl(){
        super(new PatientDaoImpl());
    }
}
