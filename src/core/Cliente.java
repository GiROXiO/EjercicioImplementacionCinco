package core;

import java.util.ArrayList;

public class Cliente extends Persona{
    private ArrayList<PlanCliente> planes;
    private ArrayList<Producto> productos;

    public Cliente(String nombre, String cedula, String telefono, String email) {
        super(nombre, cedula, telefono, email);
        this.planes = new ArrayList<>();
        this.productos = new ArrayList<>();
    }
    
    public PlanCliente getPlan(int index){
        return this.planes.get(index);
    }
    
    public void addPlan(PlanCliente planCliente){
        this.planes.add(planCliente);
    }
    
    public boolean clienteTienePlanActivo(){
        for(PlanCliente plan : this.planes){
            if(plan.isEstadoActivo())
                return true;
        }
        return false;
    }

    public ArrayList<PlanCliente> getPlanes() {
        return planes;
    }

    public void setPlanes(ArrayList<PlanCliente> planes) {
        this.planes = planes;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }
}
