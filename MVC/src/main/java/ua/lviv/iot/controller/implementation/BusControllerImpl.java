package ua.lviv.iot.controller.implementation;


import ua.lviv.iot.model.dao.impl.CountryDaoImpl;
import ua.lviv.iot.model.entity.drug.Country;

public class BusControllerImpl extends AbstractControllerImpl<Country, Integer> {
    public BusControllerImpl(){
        super(new CountryDaoImpl());
    }
}
