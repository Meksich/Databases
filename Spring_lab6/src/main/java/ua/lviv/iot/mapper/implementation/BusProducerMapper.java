package ua.lviv.iot.mapper.implementation;

import org.springframework.stereotype.Component;
import ua.lviv.iot.DTO.BusProducerDTO;
import ua.lviv.iot.domain.BusProducer;
import ua.lviv.iot.mapper.AbstractMapper;

@Component
public class BusProducerMapper implements AbstractMapper<BusProducer, BusProducerDTO> {
    @Override
    public BusProducerDTO map(BusProducer busProducer) {
        BusProducerDTO.BusProducerDTOBuilder busProducerDTOBuilder = BusProducerDTO.builder();
        busProducerDTOBuilder.id(busProducer.getId());
        busProducerDTOBuilder.ownerName(busProducer.getOwnerName());
        busProducerDTOBuilder.factoryNewProduction(busProducer.getFactoryNewProduction());
        busProducerDTOBuilder.productionPerYear(busProducer.getProductionPerYear());
        return busProducerDTOBuilder.build();
    }
}
