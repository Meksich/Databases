package ua.lviv.iot.controller.implementation;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.DTO.SecurityDTO;
import ua.lviv.iot.controller.AbstractControllerImpl;
import ua.lviv.iot.domain.Security;
import ua.lviv.iot.mapper.AbstractMapper;
import ua.lviv.iot.mapper.implementation.SecurityMapper;
import ua.lviv.iot.service.AbstractService;
import ua.lviv.iot.service.implementation.SecurityService;

@RequestMapping(value = "/security")
@RestController
@AllArgsConstructor
public class SecurityControllerImpl extends AbstractControllerImpl<Security, SecurityDTO> {
    private final SecurityService securityService;
    private final SecurityMapper securityMapper;

    @Override
    public AbstractService<Security> getService() {
        return securityService;
    }

    @Override
    public AbstractMapper<Security, SecurityDTO> getMapper() {
        return securityMapper;
    }
}
