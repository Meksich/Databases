package ua.lviv.iot.service.implementation;

import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import ua.lviv.iot.domain.Security;
import ua.lviv.iot.repository.SecurityRepository;
import ua.lviv.iot.service.AbstractService;

@AllArgsConstructor
@Service
public class SecurityService extends AbstractService<Security> {
    private final SecurityRepository securityRepository;

    @Override
    public JpaRepository<Security, Integer> getRepository(){
        return securityRepository;
    }
}
