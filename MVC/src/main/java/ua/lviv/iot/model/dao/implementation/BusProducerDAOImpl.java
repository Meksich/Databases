package ua.lviv.iot.model.dao.implementation;

import ua.lviv.iot.model.dao.impl.DoctorAppointmentDaoImpl;
import ua.lviv.iot.model.entity.patient.DoctorAppointment;

public class BusProducerDAOImpl extends AbstractControllerImpl<DoctorAppointment, Integer> {
    public BusProducerDAOImpl(){
        super(new DoctorAppointmentDaoImpl());
    }
}
