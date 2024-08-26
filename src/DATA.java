import java.util.ArrayList;
import java.util.List;

public class DATA {

    public static ArrayList listadoAlumnos (){

        // BASE DE DATOS

        ArrayList<Alumno> alumnos = new ArrayList<>();
        alumnos.add(new Alumno("Mynor", "Calderon", 16));
        alumnos.add(new Alumno("Luis", "Perez", 17));
        alumnos.add(new Alumno("Ana", "Gonzalez", 18));
        alumnos.add(new Alumno("Carlos", "Rodriguez", 19));
        alumnos.add(new Alumno("Maria", "Lopez", 16));
        alumnos.add(new Alumno("Jose", "Martinez", 17));
        alumnos.add(new Alumno("Laura", "Garcia", 18));
        alumnos.add(new Alumno("Pedro", "Sanchez", 19));
        alumnos.add(new Alumno("Lucia", "Ramirez", 16));
        alumnos.add(new Alumno("Jorge", "Torres", 17));
        alumnos.add(new Alumno("Sofia", "Venegas", 18));

        return alumnos;

    }
}
