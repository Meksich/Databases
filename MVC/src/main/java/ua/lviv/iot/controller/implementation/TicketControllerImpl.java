package ua.lviv.iot.controller.implementation;

import ua.lviv.iot.model.dao.impl.TrackerDataDaoImpl;
import ua.lviv.iot.model.entity.patient.TrackerData;

public class TicketControllerImpl extends AbstractControllerImpl<TrackerData, Integer> {
    public TicketControllerImpl(){
        super(new TrackerDataDaoImpl());
    }
}
