import dao.EmpleadoDAO;
import controllers.Ejercicios;
import controllers.EmpleadoContoller;
import controllers.EmpleadoDAOHashMap;
import controllers.EmpleadoDAOTreeMap;
import controllers.Mapa;
import models.Empleado;

public class App {

    public static void main(String[] args) throws Exception {
        // Ejemplo de uso de HashMap con claves simples
        // runMapExample();

        // Ejemplo de gestión de empleados (HashMap y TreeMap)
        runEmpleadoExample();

        // Ejercicios: anagramas, sumatoria de dos, contar caracteres
        runEjercicios();
    }

    private static void runEmpleadoExample() {
        // DAO con HashMap
        EmpleadoDAO empleadoDAOHash = new EmpleadoDAOHashMap();
        EmpleadoContoller empleadoContoller = new EmpleadoContoller(empleadoDAOHash);

        // DAO con TreeMap
        EmpleadoDAO empleadoDAOTreeMap = new EmpleadoDAOTreeMap();
        EmpleadoContoller empleadoContoller2 = new EmpleadoContoller(empleadoDAOTreeMap);

        // Crear empleados
        Empleado emp1 = new Empleado(5, "Pedro", "Dev");
        Empleado emp2 = new Empleado(3, "Juan", "Dev");
        Empleado emp3 = new Empleado(1, "Jose", "Dev");
        Empleado emp4 = new Empleado(2, "Pedro", "Dev");
        Empleado emp5 = new Empleado(4, "Pedro", "Dev");

        // Agregar a HashMap
        empleadoContoller.agregarEmpleados(emp1);
        empleadoContoller.agregarEmpleados(emp2);
        empleadoContoller.agregarEmpleados(emp3);
        empleadoContoller.agregarEmpleados(emp4);
        empleadoContoller.agregarEmpleados(emp5);

        // Agregar a TreeMap
        empleadoContoller2.agregarEmpleados(emp1);
        empleadoContoller2.agregarEmpleados(emp2);
        empleadoContoller2.agregarEmpleados(emp3);
        empleadoContoller2.agregarEmpleados(emp4);
        empleadoContoller2.agregarEmpleados(emp5);

        // Mostrar resultados
        System.out.println("HashMap");
        empleadoContoller.listarEmpleados();

        System.out.println("\nTreeMap");
        empleadoContoller2.listarEmpleados();
    }

    private static void runMapExample() {
        Mapa mapa = new Mapa();
        mapa.ejemploConHashMap();
        mapa.ejemploConLinkedHashMap();
        mapa.ejemplosConTreeMap();
    }

    private static void runEjercicios() {
        Ejercicios ejercicios = new Ejercicios();

        // Anagramas
        String palabra1 = "roma";
        String palabra2 = "amor";
        System.out.println("¿'" + palabra1 + "' y '" + palabra2 + "' son anagramas? " +
                ejercicios.areAnagrams(palabra1, palabra2));

        // Sumatoria de dos números
        int[] nums = {9, 2, 3, 6};
        int objetivo = 5;
        int[] resultado = ejercicios.sumatoriaDeDos(nums, objetivo);
        if (resultado != null) {
            System.out.println("Índices que suman " + objetivo + ": [" + resultado[0] + ", " + resultado[1] + "]");
        } else {
            System.out.println("No se encontró suma.");
        }

        // Contar caracteres
        ejercicios.contarCaracteres("holamundo");
    }
}
