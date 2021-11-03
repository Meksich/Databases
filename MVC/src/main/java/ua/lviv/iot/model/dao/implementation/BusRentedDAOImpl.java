package ua.lviv.iot.model.dao.implementation;

import ua.lviv.iot.model.dao.impl.DoctorPersonalFileDaoImpl;
import ua.lviv.iot.model.entity.patient.DoctorPersonalFile;

public class BusRentedDAOImpl extends AbstractControllerImpl<DoctorPersonalFile, Integer> {
    public BusRentedDAOImpl(){
        super(new DoctorPersonalFileDaoImpl());
    }
}
