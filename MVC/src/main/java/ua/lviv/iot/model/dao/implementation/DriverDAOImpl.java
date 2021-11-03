package ua.lviv.iot.model.dao.implementation;

import ua.lviv.iot.model.dao.impl.DrugDaoImpl;
import ua.lviv.iot.model.entity.drug.Drug;

public class DriverDAOImpl extends AbstractControllerImpl<Drug, Integer> {
    public DriverDAOImpl(){
        super(new DrugDaoImpl());
    }
}
