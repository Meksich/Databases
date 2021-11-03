package ua.lviv.iot.controller.implementation;

import ua.lviv.iot.model.dao.impl.DoctorAppointmentDaoImpl;
import ua.lviv.iot.model.entity.patient.DoctorAppointment;

public class BusProducerControllerImpl extends AbstractControllerImpl<DoctorAppointment, Integer> {
    public BusProducerControllerImpl(){
        super(new DoctorAppointmentDaoImpl());
    }
}
