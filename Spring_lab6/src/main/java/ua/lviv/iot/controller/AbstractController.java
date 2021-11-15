package ua.lviv.iot.controller;

import org.springframework.http.ResponseEntity;
import ua.lviv.iot.mapper.AbstractMapper;
import ua.lviv.iot.service.AbstractService;

import java.sql.SQLException;
import java.util.List;

public interface AbstractController<Entity, DTO> {
    AbstractService<Entity> getService();
    AbstractMapper<Entity, DTO> getMapper();

    ResponseEntity<List<DTO>> getAll();
    ResponseEntity<DTO> get(Integer id);
    ResponseEntity<DTO> update(Integer id, Entity entity);
    ResponseEntity<DTO> delete(Integer id);
    ResponseEntity<DTO> create(Entity entity);
}
