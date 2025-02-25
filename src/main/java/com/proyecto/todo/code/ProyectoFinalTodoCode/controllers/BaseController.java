package com.proyecto.todo.code.ProyectoFinalTodoCode.controllers;

import com.proyecto.todo.code.ProyectoFinalTodoCode.entities.Base;
import com.proyecto.todo.code.ProyectoFinalTodoCode.entities.dto.BaseDto;
import org.springframework.http.ResponseEntity;

import java.io.Serializable;
import java.util.List;

public interface BaseController <E extends Base, DC, DE, ID extends Serializable> {
    ResponseEntity<E> getById(ID id);

    ResponseEntity<List<E>> getAll();

    ResponseEntity<E> create(DC entity);

    ResponseEntity<E> edit(DE entity, ID id);

    ResponseEntity<?> deleteById(ID id);
}
