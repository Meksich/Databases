package ua.lviv.iot.controller.implementation;

import ua.lviv.iot.controller.AbstractControllerImpl;
import ua.lviv.iot.model.dao.implementation.SecurityDAOImpl;
import ua.lviv.iot.domain.Security;

public class SecurityControllerImpl extends AbstractControllerImpl<Security> {
    public SecurityControllerImpl(){
        super(new SecurityDAOImpl());
    }
}
