package app;

import domain.EspacioParqueadero;
import domain.Vehiculo;
import services.GestionParqueadero;

public class Main {
    public static void main(String[] args) {
        System.out.println("Gestión de Parqueadero");

        GestionParqueadero gestion = new GestionParqueadero();

        // Agregar espacios de parqueadero
        EspacioParqueadero espacio1 = new EspacioParqueadero(1, "carro");
        EspacioParqueadero espacio2 = new EspacioParqueadero(2, "moto");
        EspacioParqueadero espacio3 = new EspacioParqueadero(3, "carro");
        gestion.agregarEspacio(espacio1);
        gestion.agregarEspacio(espacio2);
        gestion.agregarEspacio(espacio3);
    
        // Registrar vehículos
        Vehiculo vehiculo1 = new Vehiculo("ABC123", "carro", "Juan Perez");
        Vehiculo vehiculo2 = new Vehiculo("XYZ789", "moto", "Maria Gomez");
        Vehiculo vehiculo3 = new Vehiculo("LMN456", "carro", "Carlos Ruiz");
        gestion.registrarVehiculo(vehiculo1);
        gestion.registrarVehiculo(vehiculo2);
        gestion.registrarVehiculo(vehiculo3);
    
        // Mostrar espacios disponibles
        gestion.mostrarEspaciosDisponibles();

        // Asignar espacios a vehículos
        gestion.asignarEspacio(vehiculo3);
        gestion.asignarEspacio(vehiculo2);
        gestion.asignarEspacio(vehiculo1);

        // Mostrar espacios disponibles después de asignaciones
        gestion.mostrarEspaciosDisponibles();

        // Liberar un espacio
        espacio1.liberarEspacio();

        // Mostrar espacios disponibles después de liberar uno
        gestion.mostrarEspaciosDisponibles();
    }
}
