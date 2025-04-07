package core;

import java.time.LocalDate;

public class PlanCliente extends Producto{
    private Cliente cliente;
    private Plan plan;

    public PlanCliente(String nombre, LocalDate fechaInicio, float valor, Cliente cliente) {
        super(nombre, fechaInicio, valor);
        this.cliente = cliente;
    }

    public void setEstadoActivo(boolean estadoActivo){
        this.estadoActivo = estadoActivo;
    }
}
