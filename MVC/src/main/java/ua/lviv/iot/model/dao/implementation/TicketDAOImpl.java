package ua.lviv.iot.model.dao.implementation;

import ua.lviv.iot.model.dao.impl.TrackerDataDaoImpl;
import ua.lviv.iot.model.entity.patient.TrackerData;

public class TicketDAOImpl extends AbstractControllerImpl<TrackerData, Integer> {
    public TicketDAOImpl(){
        super(new TrackerDataDaoImpl());
    }
}
