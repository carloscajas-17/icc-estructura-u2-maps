import dao.EmpleadoDAO;
import controllers.Ejercicios;
import controllers.EmpleadoContoller;
import controllers.EmpleadoDAOHashMap;
import controllers.EmpleadoDAOTreeMap;
import controllers.Mapa;
import models.Empleado;

public class App {
    public static void main(String[] args) throws Exception {

        // Ejecuta el ejemplo de uso de HashMap con ejemplos sencillos
        //runMapExamlpe();

        // Ejecuta el ejemplo de gestión de empleados usando HashMap
        runEmpleadoExample();

        // Ejecuta los ejercicios de sumatoria y anagramas
        //runEjerccios();
    }

    private static void runEmpleadoExample() {
        EmpleadoDAO empleadoDAOHash = new EmpleadoDAOHashMap();
        EmpleadoContoller empleadoContoller = new EmpleadoContoller(empleadoDAOHash);
        EmpleadoDAOTreeMap empleadoDAOTreeMap = new EmpleadoDAOTreeMap();
        EmpleadoContoller empleadoContoller2 = new EmpleadoContoller(empleadoDAOTreeMap);

        Empleado emp1 = new Empleado(5, "Pedro", "Dev");
        Empleado emp2 = new Empleado(3, "Juan", "Dev");
        Empleado emp3 = new Empleado(1, "Jose", "Dev");
        Empleado emp4 = new Empleado(2, "Pedro", "Dev");
        Empleado emp5 = new Empleado(4, "Pedro", "Dev");


        
        empleadoContoller.agregarEmpleados(emp1);
        empleadoContoller.agregarEmpleados(emp2);
        empleadoContoller.agregarEmpleados(emp3);
        empleadoContoller.agregarEmpleados(emp4);
        empleadoContoller.agregarEmpleados(emp5);

        
        empleadoContoller2.agregarEmpleados(emp1);
        empleadoContoller2.agregarEmpleados(emp2);
        empleadoContoller2.agregarEmpleados(emp3);
        empleadoContoller2.agregarEmpleados(emp4);
        empleadoContoller2.agregarEmpleados(emp5);
        
        System.out.println("HashMap");
        empleadoContoller.listarEmpleados();
        System.out.println("\nTreeMap");
        empleadoContoller2.listarEmpleados();

    }

    private static void runMapExamlpe() {
        Mapa mapa = new Mapa();
        mapa.ejemploConHashMap();
        mapa.ejemploConLinkedHashMap();
        mapa.ejemplosConTreeMap();
    }

    //private static void runEjerccios() {

    //}
}