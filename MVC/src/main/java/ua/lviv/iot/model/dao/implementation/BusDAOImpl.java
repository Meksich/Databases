package ua.lviv.iot.model.dao.implementation;


import ua.lviv.iot.model.dao.impl.CountryDaoImpl;
import ua.lviv.iot.model.entity.drug.Country;

public class BusDAOImpl extends AbstractControllerImpl<Country, Integer> {
    public BusDAOImpl(){
        super(new CountryDaoImpl());
    }
}
