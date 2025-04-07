package core;

import java.time.LocalDate;

public class ProductoCliente extends Producto{
    private boolean estadoAprobado;
    private int nivelAvance;
    private Cliente cliente;
    private Curso curso;

    public ProductoCliente(int id, String nombre, LocalDate fechaInicio, float valor) {
        super(id, nombre, fechaInicio, valor);
    }
}
