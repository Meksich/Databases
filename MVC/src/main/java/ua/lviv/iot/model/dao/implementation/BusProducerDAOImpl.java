package ua.lviv.iot.model.dao.implementation;

import ua.lviv.iot.model.dao.AbstractDAOImpl;
import ua.lviv.iot.model.entity.BusProducer;

public class BusProducerDAOImpl extends AbstractDAOImpl<BusProducer, Integer> {
    public BusProducerDAOImpl(){
        super(BusProducer.class);
    }
}
