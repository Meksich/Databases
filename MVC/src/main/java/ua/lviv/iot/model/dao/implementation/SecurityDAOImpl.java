package ua.lviv.iot.model.dao.implementation;

import ua.lviv.iot.model.dao.AbstractDAOImpl;
import ua.lviv.iot.model.entity.Security;

public class SecurityDAOImpl extends AbstractDAOImpl<Security, Integer> {
    public SecurityDAOImpl(){
        super(Security.class);
    }
}
