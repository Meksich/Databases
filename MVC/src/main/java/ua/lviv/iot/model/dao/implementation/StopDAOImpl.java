package ua.lviv.iot.model.dao.implementation;

import ua.lviv.iot.model.dao.AbstractDAOImpl;
import ua.lviv.iot.model.entity.Stop;

public class StopDAOImpl extends AbstractDAOImpl<Stop, Integer> {
    public StopDAOImpl(){
        super(Stop.class);
    }
}
