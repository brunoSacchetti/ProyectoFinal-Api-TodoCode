package com.proyecto.todo.code.ProyectoFinalTodoCode.repository;

import com.proyecto.todo.code.ProyectoFinalTodoCode.entities.Base;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@NoRepositoryBean
public interface BaseRepository <E extends Base, ID extends Serializable> extends JpaRepository<E, ID>{

    Logger logger = LoggerFactory.getLogger(BaseRepository.class);

    @Override
    @Transactional
    default void delete(E entity){
        delete(entity);
        logger.info("La entidad se borro correctamente");
    }

    @Override
    @Transactional
    default E getById(ID id){
        logger.info("Obteniendo entidad del id: " + id);
        var optional = findById(id);
        var entity = optional.get();
        return entity;
    }

    @Override
    @Transactional
    default List<E> findAll(){
        logger.info("Buscando todas las entidades...");
        var entities = findAll().stream().toList();
        return entities;
    }

}
