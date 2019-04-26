/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generadorreporte;

import sensorvelocidad.DatosVehiculo;

/**
 *
 * @author EducaciónIT
 */
public class Registro {

    public String getId() {
        return id;
    }

    public String getMulta() {
        return multa;
    }

    public String getPatente() {
        return patente;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public String getVelocidadMedida() {
        return velocidadMedida;
    }
    private String id;
    private String multa;
    private String patente;
    private String tipoVehiculo;
    private String velocidadMedida;

    public Registro(String id, String multa, String patente, String tipoVehiculo, String velocidadMedida) {
        this.id = id;
        this.multa = multa;
        this.patente = patente;
        this.tipoVehiculo = tipoVehiculo;
        this.velocidadMedida = velocidadMedida;
    }
    
}
