package core;

import java.time.LocalDate;
import java.util.ArrayList;

public class Clatzy {
    private ArrayList<Cliente> clientes;
    private ArrayList<Instructor> instructores;
    private ArrayList<Curso> cursos;
    private ArrayList<Plan> planes;

    public Clatzy() {
        this.clientes = new ArrayList<>();
        this.instructores = new ArrayList<>();
        this.cursos = new ArrayList<>();
        this.planes = new ArrayList<>();
    }
    
    public void addInstructor(String nombre, String cedula, String telefono, String email){
        this.instructores.add(new Instructor(nombre, cedula, telefono, email));
    }
    
    public void addCurso(int id, String nombre, LocalDate fecha, float valor, Instructor instructor){
        Curso curso = new Curso(id, nombre, fecha, valor);
        curso.addInstructor(instructor);
        this.cursos.add(curso);
    }
    
    public Instructor getInstructor(int index){
        return this.instructores.get(index);
    }
    
    public void addPlan(String nombre, LocalDate fecha, float valor, float valorMaximoCurso){
        this.planes.add(new Plan(nombre, fecha, valor, valorMaximoCurso));
    }
    
    public void addCliente(String nombre, String cedula, String telefono, String email){
        this.clientes.add(new Cliente(nombre, cedula, telefono, email));
    }
    
    public void comprarPlan(Cliente cliente, Plan plan, LocalDate fecha){
        if(!cliente.clienteTienePlanActivo()){
            PlanCliente pc = new PlanCliente(plan.getNombre(), fecha, plan.getValor(), cliente);
            pc.setEstadoActivo(true);
            cliente.addPlan(pc);
            System.out.println("El cliente "+cliente.getNombre()+" compro exitosamente un plan "+plan.getNombre());
        }else{
            System.out.println("El cliente "+cliente.getNombre()+" ya tiene un plan activo");
        }
    }
    
    public Cliente getCliente(int index){
        return this.clientes.get(index);
    }
    
    public Plan getPlan(int index){
        return this.planes.get(index);
    }
    
    public void comprarCurso(Cliente cliente, Curso curso, LocalDate fecha){
        
    }
    
    public void comprarCurso(Cliente cliente, Curso curso, LocalDate fecha, float valorPagado){
        
    }
    
    public Curso getCurso(int index){
        return this.cursos.get(index);
    }
    
    public Cliente getClienteMayorIngreso(){
        return null;
    }
    
    public void listAll(){
        
    }
}
