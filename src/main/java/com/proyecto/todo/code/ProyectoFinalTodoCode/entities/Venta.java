package com.proyecto.todo.code.ProyectoFinalTodoCode.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Venta extends Base {

    protected LocalDate fecha_venta;
    protected Double total;

    @OneToMany
    protected List<Producto> listaProductos;

    @OneToOne
    protected Cliente unCliente;

}
