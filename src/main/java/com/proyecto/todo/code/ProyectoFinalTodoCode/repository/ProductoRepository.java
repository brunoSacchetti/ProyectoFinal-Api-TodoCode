package com.proyecto.todo.code.ProyectoFinalTodoCode.repository;

import com.proyecto.todo.code.ProyectoFinalTodoCode.entities.Base;
import com.proyecto.todo.code.ProyectoFinalTodoCode.entities.Producto;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends BaseRepository<Producto, Long> {
}
