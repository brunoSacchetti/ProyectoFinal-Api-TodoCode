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
public class Producto extends Base{

    protected String nombre;
    protected String marca;
    protected Double costo;
    protected Double cantidad_disponible;

}
