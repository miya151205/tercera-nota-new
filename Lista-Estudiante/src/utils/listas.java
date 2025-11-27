package utils;

import java.util.ArrayList;
import java.util.List;

import domain.Estudiante;

public class listas {
   public static void EstudiantesParImpar(Estudiante[]estudiantes){
    List<Estudiante> estudiantesPar = new ArrayList<>();
    List<Estudiante> estudiantesImpar = new ArrayList<>();
    for (Estudiante estudiante : estudiantes) {
        if (estudiante.getEdad()%2==0) {
            estudiantesPar.add(estudiante);
            
        }
        else{
            estudiantesImpar.add(estudiante);
        } 
        
    }
    System.out.println("________________ESTUDIANTES PARES____________________");
    for (Estudiante estudiante : estudiantesPar) {
        System.out.println(estudiante.getNombre());
    }
     System.out.println("________________ESTUDIANTES IMPARES____________________");
    for (Estudiante estudiante : estudiantesImpar) {
        System.out.println(estudiante.getNombre());
    }
   } 
}
