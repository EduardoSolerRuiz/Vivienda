/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hogar;

/**
 * Creacion de la clase donde recoge las propiedades de una vivienda
 * @author paqui
 * @version 1.0
 */
public class Vivienda {
    /**
     * Atributos de la clase vivienda
     */
    private double precio;
    private int numHabitaciones;
    private double superficie;
    private boolean parking;
    private String estado;
    private String propietario;
    
    /**
     * Constructor que inicializa todos los parametros de la clase vivienda
     * @param precio
     * @param numHabitaciones
     * @param superficie
     * @param parking
     * @param estado
     * @param propietario 
     */

    public Vivienda(double precio, int numHabitaciones, double superficie, boolean parking, String estado, String propietario) {
        this.precio = precio;
        this.numHabitaciones = numHabitaciones;
        this.superficie = superficie;
        this.parking = parking;
        this.estado = estado;
        this.propietario = propietario;
    }
    
    
    /**
     * constructor que inicializa el atributo precio
     * @param precio 
     */
    
    public Vivienda (double precio)
    {
        this.precio = precio;
    }
    
    /**
     * actualiza el precio de la vivienda y se le pasar por parametro un descuento 
     * @param descuento 
     */
    public void actualizarPrecio(double descuento)
    {
        setPrecio(getPrecio() - getPrecio() * descuento);
    }

    /**
     * devuelve el precio
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * devuelve el numero de habitaciones
     * @return the numHabitaciones
     */
    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    /**
     * devuelve la supercie de la vivienda
     * @return the superficie
     */
    public double getSuperficie() {
        return superficie;
    }

    /**
     * devuelve un true o false si tiene o no tiene parking
     * @return the parking
     */
    public boolean isParking() {
        return parking;
    }

    /**
     * devuelve el estado de la vivienda
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * devuelve el propietario de la vivienda
     * @return the propietario
     */
    public String getPropietario() {
        return propietario;
    }

    /**
     * establece el precio de la vivienda
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * establece el numero de habitaciones de la vivienda
     * @param numHabitaciones the numHabitaciones to set
     */
    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    /**
     * estabñece la superficie 
     * @param superficie the superficie to set
     */
    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    /**
     * establece el parking tanto como si tiene como si no
     * @param parking the parking to set
     */
    public void setParking(boolean parking) {
        this.parking = parking;
    }

    /**
     * establece el estado de la vivienda
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * establece el propietario de la vivienda
     * @param propietario the propietario to set
     */
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
    
}
