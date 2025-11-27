package domain;

import java.util.ArrayList;

// Creación de los atributos
public class Materia {
    private String nombre;
    private String codigo;
    private int creditos;
    private ArrayList<String> horariosDisponibles;

    // constructor de la clase Materia
    public Materia(String nombre, String codigo, int creditos) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.creditos = creditos;
        this.horariosDisponibles = new ArrayList<>();
    }

    // Getters de los atributos
    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getCreditos() {
        return creditos;
    }

    public ArrayList<String> getHorariosDisponibles() {
        return horariosDisponibles;
    }

    // Métodos para agregar y mostrar horarios disponibles
    public void agregarHorario(String horario) {
        horariosDisponibles.add(horario);
    }

    public void mostrarHorariosDisponibles() {

        System.out.println("Los horarios disponibles para " + nombre + " son:");
        for (String h : horariosDisponibles) {
            System.out.println("---->" + h + "<---");
        }
    }

}
