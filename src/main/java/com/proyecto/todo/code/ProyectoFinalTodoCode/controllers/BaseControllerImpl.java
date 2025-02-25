package com.proyecto.todo.code.ProyectoFinalTodoCode.controllers;

import com.proyecto.todo.code.ProyectoFinalTodoCode.entities.Base;
import com.proyecto.todo.code.ProyectoFinalTodoCode.entities.dto.BaseDto;
import com.proyecto.todo.code.ProyectoFinalTodoCode.services.Base.BaseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;

public abstract class BaseControllerImpl <E extends Base,D extends BaseDto, DC, DE, ID extends Serializable> implements BaseController<D,DC, DE, ID> {
    private static final Logger logger = LoggerFactory.getLogger(BaseControllerImpl.class);

    protected final BaseService<E,D, ID> service;

    public BaseControllerImpl(BaseService<E, D, ID> service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public ResponseEntity<D> getById(@PathVariable ID id){
        logger.info("INICIO GET BY ID {}",id);
        return ResponseEntity.ok(service.getById(id));
    }

    @GetMapping
    public ResponseEntity<List<D>> getAll() {
        logger.info("INICIO GET ALL");
        return ResponseEntity.ok(service.getAll());
    }

    @PostMapping()
    public ResponseEntity<D> create(@RequestBody DC entity){
        logger.info("INICIO CREATE {}",entity.getClass());
        return ResponseEntity.ok(service.createNew(entity));
    }

    @PutMapping("/{id}")
    public ResponseEntity<D> edit(@RequestBody DE entity, @PathVariable ID id){
        logger.info("INICIO EDIT {}",entity.getClass());
        return ResponseEntity.ok(service.update(entity, id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteById(@PathVariable ID id) {
        logger.info("INICIO DELETE BY ID");
        facade.deleteById(id);
        return ResponseEntity.ok(null);
    }

}
