package domain;

public class EspacioParqueadero {
    private int numeroEspacio;
    private String tipoVehiculo; // carro o moto
    private boolean ocupado;
    private Vehiculo vehiculoAsignado; // se agrega la relacion con la clase vehiculo
    // constructor

    public EspacioParqueadero(int numeroEspacio, String tipoVehiculo) {
        this.numeroEspacio = numeroEspacio;
        this.tipoVehiculo = tipoVehiculo;
        this.ocupado = false; // inicializa el espacio como desocupado
        this.vehiculoAsignado = null; // inicializa el vehiculo asignado como nulo
    }

    public int getNumeroEspacio() {
        return numeroEspacio;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public boolean getOcupado() {
        return ocupado;
    }

    public Vehiculo getVehiculoAsignado() {
        return vehiculoAsignado;
    }

    // se crea el metodo para que se cambie el estado de espacio a ocupado
    public boolean asignarVehiculo(Vehiculo vehiculo) {
        if (ocupado) {
            System.out.println("El espacio " + numeroEspacio + " ya está ocupado.");
            return false;
        }
        if (!vehiculo.getType().equalsIgnoreCase(tipoVehiculo)) {
            System.out.println("El vehículo no es del tipo adecuado para este espacio.");
            return false;
        }
        this.vehiculoAsignado = vehiculo;
        this.ocupado = true;
        System.out.println("El vehículo con placa " + vehiculo.getPlaca() + " ha sido asignado al espacio " + numeroEspacio + ".");
        return true;
        
    }
    // se crea el metodo para liberar el espacio
    public void liberarEspacio() {
        if (!ocupado) {
            System.out.println("El espacio " + numeroEspacio + " ya está libre.");
            return;
        }
        System.out.println("El vehículo con placa " + vehiculoAsignado.getPlaca() + " ha salido del espacio " + numeroEspacio + ".");
        this.vehiculoAsignado = null;
        this.ocupado = false;
    }


}
