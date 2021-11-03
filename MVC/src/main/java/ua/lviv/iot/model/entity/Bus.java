package ua.lviv.iot.model.entity;


import ua.lviv.iot.model.dao.impl.CountryDaoImpl;
import ua.lviv.iot.model.entity.drug.Country;

public class Bus extends AbstractControllerImpl<Country, Integer> {
    public Bus(){
        super(new CountryDaoImpl());
    }
}
