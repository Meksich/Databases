package ua.lviv.iot.controller.implementation;

import ua.lviv.iot.controller.AbstractControllerImpl;
import ua.lviv.iot.model.dao.implementation.BusProducerDAOImpl;
import ua.lviv.iot.domain.BusProducer;

public class BusProducerControllerImpl extends AbstractControllerImpl<BusProducer> {
    public BusProducerControllerImpl(){
        super(new BusProducerDAOImpl());
    }
}
