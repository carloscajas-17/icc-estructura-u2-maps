package controllers;

import java.util.HashMap;
import java.util.Map;

import dao.EmpleadoDAO;
import models.Empleado;

public class EmpleadoDAOHashMap implements EmpleadoDAO {

    private Map<Empleado, Empleado> empleados;

    public EmpleadoDAOHashMap() {
        this.empleados = new HashMap<>();
    }

    @Override
    public void agregar(Empleado empleado) {
        empleados.put(empleado, empleado);
        
    }

    @Override
    public void eliminar(int id) {
        Empleado temp = new Empleado(id);
        empleados.remove(temp);
    
    }

    @Override
    public void listar() {
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados registrados.");
        } else {
            System.out.println("Lista de empleados:");
            for (Empleado e : empleados.values()) {
                System.out.println(e);
            }
        }
    }
}
