import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Datos");

        ArrayList alumnos = DATA.listadoAlumnos();

        for (Object cadaAlumno : alumnos){
            System.out.println(cadaAlumno.toString());
        }
    }
}