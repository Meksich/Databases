package ua.lviv.iot.model.entity;

import ua.lviv.iot.model.dao.impl.DoctorPersonalFileDaoImpl;
import ua.lviv.iot.model.entity.patient.DoctorPersonalFile;

public class BusRented extends AbstractControllerImpl<DoctorPersonalFile, Integer> {
    public BusRented(){
        super(new DoctorPersonalFileDaoImpl());
    }
}
