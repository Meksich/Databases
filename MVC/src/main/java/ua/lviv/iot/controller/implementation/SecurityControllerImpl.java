package ua.lviv.iot.controller.implementation;

import ua.lviv.iot.controller.AbstractControllerImpl;
import ua.lviv.iot.model.dao.implementation.SecurityDAOImpl;
import ua.lviv.iot.model.entity.Security;

public class SecurityControllerImpl extends AbstractControllerImpl<Security, Integer> {
    public SecurityControllerImpl(){
        super(new SecurityDAOImpl());
    }
}
