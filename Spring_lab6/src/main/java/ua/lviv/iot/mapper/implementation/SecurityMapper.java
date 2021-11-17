package ua.lviv.iot.mapper.implementation;

import org.springframework.stereotype.Component;
import ua.lviv.iot.DTO.SecurityDTO;
import ua.lviv.iot.domain.Security;
import ua.lviv.iot.mapper.AbstractMapper;

@Component
public class SecurityMapper implements AbstractMapper<Security, SecurityDTO> {
    @Override
    public SecurityDTO map(Security security) {
        SecurityDTO.SecurityDTOBuilder securityDTOBuilder = SecurityDTO.builder();
        securityDTOBuilder.id(security.getId());
        securityDTOBuilder.password(security.getPassword());
        securityDTOBuilder.driver(security.getDriver().getId());
        return securityDTOBuilder.build();
    }
}
