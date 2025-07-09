package controllers;

import java.util.Map;
import java.util.TreeMap;

import dao.EmpleadoDAO;
import models.Empleado;

public class EmpleadoDAOTreeMap implements EmpleadoDAO {

    private Map<Empleado, Empleado> empleados;

    public EmpleadoDAOTreeMap() {
        this.empleados = new TreeMap<>();
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
