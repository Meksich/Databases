package ua.lviv.iot.model.entity;

import ua.lviv.iot.model.dao.impl.MedicalCardDaoImpl;
import ua.lviv.iot.model.entity.patient.MedicalCard;

public class Security extends AbstractControllerImpl<MedicalCard, Integer> {
    public Security(){
        super(new MedicalCardDaoImpl());
    }
}
