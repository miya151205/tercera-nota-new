package app;

import domain.Estudiante;
import utils.listas;

public class Main {
public static void main(String[] args) {
    Estudiante estudiante1 = new Estudiante("Milton", "192647", 23);
     Estudiante estudiante2 = new Estudiante("Miryian", "192662", 19);
     Estudiante estudiante3 = new Estudiante("keiner", "192605", 17);
      Estudiante estudiante4 = new Estudiante("Grissell", "192606", 17);
       Estudiante estudiante5 = new Estudiante("Maria", "192645", 18);
        Estudiante estudiante6 = new Estudiante("Mateo", "192664", 17);

        Estudiante[] estudiantes = {estudiante1,estudiante2,estudiante3,estudiante4,estudiante5,estudiante6};

        listas.EstudiantesParImpar(estudiantes);



    }
}
