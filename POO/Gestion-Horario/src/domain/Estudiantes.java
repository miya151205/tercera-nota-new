package domain;

import java.util.ArrayList;

// Creación de los atributos de la clase Estudiantes
public class Estudiantes {
    private String nombre;
    private String id;
    private ArrayList<Materia> materiasInscritas;

    // Constructor de la clase Estudiantes
    public Estudiantes(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
        this.materiasInscritas = new ArrayList<>();
    }
    // Getters de los atributos

    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }

    public ArrayList<Materia> getMateriasInscritas() {
        return materiasInscritas;
    }

    // Método para inscribir una materia

    public boolean inscribirMateria(Materia materia, String horario) {

        if (!materia.getHorariosDisponibles().contains(horario)) {
            System.out.println("El horario " + horario + " no está disponible para la materia " + materia.getNombre());
            return false;
        }

        materiasInscritas.add(materia);

        System.out.println("Materia " + materia.getNombre() + " inscrita con éxito en el horario " + horario);
        return true;

    }

    public void mostrarHorariosCompletoEstdiantes() {
        System.out.println("********** El estudiante " + nombre + " con id: " + id + " tiene inscritas las siguientes materias: **********");
       if (materiasInscritas.isEmpty()) {
            System.out.println("No hay materias inscritas.");
        } else {
            for (Materia m : materiasInscritas) {
                System.out.println("Materia: " + m.getNombre() + " Código: " + m.getCodigo() + " Créditos: " + m.getCreditos());
            }
        }
    }

}
