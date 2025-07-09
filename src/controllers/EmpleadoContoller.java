package controllers;

import dao.EmpleadoDAO;
import models.Empleado;

public class EmpleadoContoller {

    private EmpleadoDAO empleadoDAO;

    public EmpleadoContoller(EmpleadoDAO empleadoDAO) {
        this.empleadoDAO = empleadoDAO;
    }

    public void agregarEmpleados(Empleado empleado) {
        empleadoDAO.agregar(empleado);
    }

    public void eliminarEmpleado(int id) {
        empleadoDAO.eliminar(id);
    }

    public void listarEmpleados() {
        empleadoDAO.listar();
    }

}