package dao;

import models.Empleado;

import java.util.Map;

public interface EmpleadoDAO {
    void agregar(Empleado empleado);     // crea
    void eliminar(int id );
    void  listar();
    

}
