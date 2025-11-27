package domain;

public class Vehiculo {
    
    private String placa;
    private String type;
    private String propietario;
    
    public Vehiculo(String placa,String type, String propietario){
        this.placa = placa;
        this.type = type;
        this.propietario = propietario;
    }
    public String getPlaca() {
        return placa;
    }

    public String getType() {
        return type;
    }

    public String getPropietario() {
        return propietario;
    }

}
