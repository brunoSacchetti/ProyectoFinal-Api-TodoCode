package com.proyecto.todo.code.ProyectoFinalTodoCode.services.Base;

import com.proyecto.todo.code.ProyectoFinalTodoCode.entities.Base;
import com.proyecto.todo.code.ProyectoFinalTodoCode.entities.dto.BaseDto;
import org.mapstruct.Named;

import java.io.Serializable;
import java.util.List;

public interface BaseService <E extends Base,D extends BaseDto, ID extends Serializable> {
    public E create(E request);

    public List<E> getAll();

    public void deleteById(ID id);

    public E update(E request, ID id);

    @Named("getById")// Esta notacion califica al metodo para luego se utilizado en clase mappper
    public E getById(ID id);
}
