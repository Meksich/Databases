package ua.lviv.iot.model.dao.implementation;

import ua.lviv.iot.model.dao.impl.MedicalCardDaoImpl;
import ua.lviv.iot.model.entity.patient.MedicalCard;

public class SecurityDAOImpl extends AbstractControllerImpl<MedicalCard, Integer> {
    public SecurityDAOImpl(){
        super(new MedicalCardDaoImpl());
    }
}
