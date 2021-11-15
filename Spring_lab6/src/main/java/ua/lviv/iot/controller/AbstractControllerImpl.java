package ua.lviv.iot.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import ua.lviv.iot.mapper.AbstractMapper;
import ua.lviv.iot.mapper.implementation.BusMapper;
import ua.lviv.iot.service.AbstractService;
import ua.lviv.iot.service.implementation.BusService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public abstract class AbstractControllerImpl<Entity, DTO> implements AbstractController<Entity, DTO>{
    AbstractService<Entity> service = getService();
    AbstractMapper<Entity, DTO> mapper = getMapper();

    @GetMapping
    @Override
    public ResponseEntity<List<DTO>> getAll() {
        List<DTO> dtoList = service.getAll().stream().map(entity -> mapper.map(entity)).collect(Collectors.toList());
        return new ResponseEntity<>(dtoList, HttpStatus.OK);
    }

    @GetMapping(path = "/{id}")
    @Override
    public ResponseEntity<DTO> get(Integer id) {
        return new ResponseEntity<>(mapper.map(service.get(id)), HttpStatus.OK);
    }

    @DeleteMapping(path = "/{id}")
    @Override
    public ResponseEntity<DTO> delete(Integer id) {
        return new ResponseEntity<>(mapper.map(service.delete(id)), HttpStatus.OK);
    }

    @PostMapping(path = "/{id}")
    @Override
    public ResponseEntity<DTO> create(Entity entity) {
        return new ResponseEntity<>(mapper.map(service.create(entity)), HttpStatus.OK);
    }

    @PutMapping(path = "/{id}")
    @Override
    public ResponseEntity<DTO> update(Integer id, Entity entity) {
        return new ResponseEntity<>(mapper.map(service.update(id, entity)), HttpStatus.OK);
    }
}
