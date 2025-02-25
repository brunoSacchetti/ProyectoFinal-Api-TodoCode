package com.proyecto.todo.code.ProyectoFinalTodoCode.entities;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Cliente extends Base {

    protected String nombre;
    protected String apellido;
    protected String dni;

}
