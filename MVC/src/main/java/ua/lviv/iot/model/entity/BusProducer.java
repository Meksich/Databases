package ua.lviv.iot.model.entity;

import ua.lviv.iot.model.dao.impl.DoctorAppointmentDaoImpl;
import ua.lviv.iot.model.entity.patient.DoctorAppointment;

public class BusProducer extends AbstractControllerImpl<DoctorAppointment, Integer> {
    public BusProducer(){
        super(new DoctorAppointmentDaoImpl());
    }
}
