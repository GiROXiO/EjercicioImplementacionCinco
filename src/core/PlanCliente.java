package core;

import java.time.LocalDate;

public class PlanCliente extends Producto{
    private Cliente cliente;
    private Plan plan;

    public PlanCliente(String nombre, LocalDate fechaInicio, float valor, Cliente cliente, Plan plan) {
        super(nombre, fechaInicio, valor);
        this.cliente = cliente;
        this.plan = plan;
    }

    public void setEstadoActivo(boolean estadoActivo){
        this.estadoActivo = estadoActivo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }
}
