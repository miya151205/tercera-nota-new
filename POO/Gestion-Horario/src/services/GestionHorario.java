package services;

import java.util.ArrayList;

import domain.Estudiantes;
import domain.Materia;
// Clase para gestionar el horario de los estudiantes
public class GestionHorario {
    private  ArrayList< Materia> materiasRegistradas;
    private ArrayList <Estudiantes> estudiantesRegistrados;
// Constructor de la clase GestionHorario
    public GestionHorario() {
        this.materiasRegistradas = new ArrayList<>();
        this.estudiantesRegistrados = new ArrayList<>();
    }
    // Método para registrar materias 
 public void resgistrarMateria(Materia materia){
    materiasRegistradas.add(materia);
    System.out.println(" La Materia " + materia.getNombre()+ " con codigo " +materia.getCodigo()+" ha sido registrada con exito");
 }
//  Método para registrar estudiantes
  public void registrarEstudiante(Estudiantes estudiante){
    estudiantesRegistrados.add(estudiante);
    System.out.println(" El Estudiante " + estudiante.getNombre()+ " con id " +estudiante.getId()+ " ha sido registrado con exito");

}
// en esta parte se crea un metodo para verificar que los hoarrios no se crucen
//  public boolean verificarConflictoHorarios(Estudiantes estudiante, String horario){
//     for(Materia m: estudiante.getMateriasInscritas()){
//         if(m.getHorariosDisponibles().contains(horario)){
//             System.out.println(" Conflicto de horario detectado para el estudiante "+ estudiante.getNombre()+" en el horario "+ horario);
//             return true;
//         }
//     }
//     return false;
//  }
}
