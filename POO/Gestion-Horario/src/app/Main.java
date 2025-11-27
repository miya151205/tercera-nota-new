package app;

import domain.Estudiantes;
import domain.Materia;
import services.GestionHorario;

public class Main {
    public static void main(String[] args) {
        System.out.println("Gestión de Horarios de Estudiantes");
        // Crear instancia de GestionHorario
        GestionHorario gestion = new GestionHorario();
        // Crear algunas materias y registrarlas
        Materia prog = new Materia("Programación", "PRG101", 4);
        prog.agregarHorario("Lunes 6-8 am");
        prog.agregarHorario("sabado 6-8 am");

        Materia Algebra = new Materia("Algebra", "AGL104", 3);
        Algebra.agregarHorario("Martes 5-8 pm");
        Algebra.agregarHorario("Sabado 5-8 pm");

        Materia Calculo = new Materia("Cálculo", "CAL201", 4);
        Calculo.agregarHorario("Miércoles 6-8 am");
        Calculo.agregarHorario("Jueves 12-2 pm");

        gestion.resgistrarMateria(prog);
        gestion.resgistrarMateria(Algebra);
        gestion.resgistrarMateria(Calculo);
        // Crear algunos estudiantes y registrarlos
        Estudiantes student1 = new Estudiantes("Miryian", "192662");
        Estudiantes student2 = new Estudiantes("Keiner", "192605");
        Estudiantes student3 = new Estudiantes("Grissell", "192606");

        gestion.registrarEstudiante(student1);
        gestion.registrarEstudiante(student2);
        gestion.registrarEstudiante(student3);

        // En esta parte voy a inscribir a los estudiantes en materias

        student1.inscribirMateria(Calculo, "Miércoles 6-8 am");
        student1.inscribirMateria(prog, "Lunes 6-8 am");    
        // *****************************************************************
        student2.inscribirMateria(Algebra, "Martes 5-8 pm");
        student2.inscribirMateria(Calculo, "Jueves 12-2 pm");
        // *****************************************************************
        student3.inscribirMateria(prog, "Lunes 6-8 am"); 
        student3.inscribirMateria(Algebra, "Viernes 5-8 pm"); // Horario no disponible
        // Mostrar los horarios completos de los estudiantes
        student1.mostrarHorariosCompletoEstdiantes();
        student2.mostrarHorariosCompletoEstdiantes();
        student3.mostrarHorariosCompletoEstdiantes();



    }
}
