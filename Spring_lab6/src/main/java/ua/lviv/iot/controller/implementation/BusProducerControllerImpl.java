package ua.lviv.iot.controller.implementation;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.DTO.BusProducerDTO;
import ua.lviv.iot.controller.AbstractControllerImpl;
import ua.lviv.iot.domain.BusProducer;
import ua.lviv.iot.mapper.AbstractMapper;
import ua.lviv.iot.mapper.implementation.BusProducerMapper;
import ua.lviv.iot.service.AbstractService;
import ua.lviv.iot.service.implementation.BusProducerService;

@RequestMapping(value = "/bus_producer")
@RestController
@AllArgsConstructor
public class BusProducerControllerImpl extends AbstractControllerImpl<BusProducer, BusProducerDTO> {
    private final BusProducerService busProducerService;
    private final BusProducerMapper busProducerMapper;

    @Override
    public AbstractService<BusProducer> getService() {
        return busProducerService;
    }

    @Override
    public AbstractMapper<BusProducer, BusProducerDTO> getMapper() {
        return busProducerMapper;
    }

}
