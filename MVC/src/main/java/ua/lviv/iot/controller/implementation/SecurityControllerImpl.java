package ua.lviv.iot.controller.implementation;

import ua.lviv.iot.model.dao.impl.MedicalCardDaoImpl;
import ua.lviv.iot.model.entity.patient.MedicalCard;

public class SecurityControllerImpl extends AbstractControllerImpl<MedicalCard, Integer> {
    public SecurityControllerImpl(){
        super(new MedicalCardDaoImpl());
    }
}
