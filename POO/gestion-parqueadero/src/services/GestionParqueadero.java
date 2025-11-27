package services;

import java.util.ArrayList;

import domain.EspacioParqueadero;
import domain.Vehiculo;

public class GestionParqueadero {
    private ArrayList<Vehiculo> vehiculosRegistrados;
    private ArrayList<EspacioParqueadero> espacios;

    public GestionParqueadero() {
        this.vehiculosRegistrados = new ArrayList<>();
        this.espacios = new ArrayList<>();
    }

    public void registrarVehiculo(Vehiculo vehiculo) {
        vehiculosRegistrados.add(vehiculo);
        System.out.println("Vehículo con placa " + vehiculo.getPlaca() + " registrado exitosamente.");
    }

    public boolean asignarEspacio(Vehiculo vehiculo) {
        for (EspacioParqueadero e : espacios) {
            if (!e.getOcupado() && e.getTipoVehiculo().equalsIgnoreCase(vehiculo.getType())) {
                
                System.out.println("Espacio asignado exitosamente." + e.getNumeroEspacio());
                return e.asignarVehiculo(vehiculo);
            }
        }
        System.out.println("No hay espacios disponibles para el tipo de vehículo: " + vehiculo.getType());
        return false;
    }

    public void agregarEspacio(EspacioParqueadero espacio) {
        espacios.add(espacio);
    }

    public void mostrarEspaciosDisponibles() {
        System.out.println(" **************** Epacios Disponibles: **************");
        for (EspacioParqueadero e : espacios) {
            if (!e.getOcupado()) {
                System.out.println("Espacio N°: " + e.getNumeroEspacio() + " Tipo de Vehiculo: " + e.getTipoVehiculo());

            }
        }
    }
}
