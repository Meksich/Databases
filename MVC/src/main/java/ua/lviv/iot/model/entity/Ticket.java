package ua.lviv.iot.model.entity;

import ua.lviv.iot.model.dao.impl.TrackerDataDaoImpl;
import ua.lviv.iot.model.entity.patient.TrackerData;

public class Ticket extends AbstractControllerImpl<TrackerData, Integer> {
    public Ticket(){
        super(new TrackerDataDaoImpl());
    }
}
