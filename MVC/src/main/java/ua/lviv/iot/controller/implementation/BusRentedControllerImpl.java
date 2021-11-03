package ua.lviv.iot.controller.implementation;

import ua.lviv.iot.model.dao.impl.DoctorPersonalFileDaoImpl;
import ua.lviv.iot.model.entity.patient.DoctorPersonalFile;

public class BusRentedControllerImpl extends AbstractControllerImpl<DoctorPersonalFile, Integer> {
    public BusRentedControllerImpl(){
        super(new DoctorPersonalFileDaoImpl());
    }
}
