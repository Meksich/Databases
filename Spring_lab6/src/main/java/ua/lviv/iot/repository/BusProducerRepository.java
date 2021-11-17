package ua.lviv.iot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.domain.BusProducer;

@Repository
public interface BusProducerRepository extends JpaRepository<BusProducer, Integer> {
}
