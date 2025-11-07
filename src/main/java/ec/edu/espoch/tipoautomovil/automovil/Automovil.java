/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.tipoautomovil.automovil;

import ec.edu.espoch.tipoautomovil.enumeracion.ColorAutomovil;
import ec.edu.espoch.tipoautomovil.enumeracion.TipoCombustible;
import ec.edu.espoch.tipoautomovil.enumeracion.TipoMarcas;

/**
 *
 * @author gsupe
 */
public class Automovil {
    private String marca;
    private String modelo;
    private double motor;
    private TipoCombustible tipoCombustible;
    private TipoMarcas tipoAutomovil;
    private int numeroPuertas;
    private int cantidadAsientos;
    private float velocidadMaxima;
    private ColorAutomovil color;
    private double velocidadActual;
    
    
    //Constructor

    public Automovil(String marca, String modelo, double motor, TipoCombustible tipoCombustible, TipoMarcas tipoAutomovil, int numeroPuertas, int cantidadAsientos, float velocidadMaxima, ColorAutomovil color, double velocidadActual) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.tipoCombustible = tipoCombustible;
        this.tipoAutomovil = tipoAutomovil;
        this.numeroPuertas = numeroPuertas;
        this.cantidadAsientos = cantidadAsientos;
        this.velocidadMaxima = velocidadMaxima;
        this.color = color;
        this.velocidadActual = velocidadActual;
    }

    
    //Setter y Getter
     public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getMotor() {
        return motor;
    }

    public void setMotor(double motor) {
        this.motor = motor;
    }

    public TipoCombustible getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(TipoCombustible tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public TipoMarcas getTipoAutomovil() {
        return tipoAutomovil;
    }

    public void setTipoAutomovil(TipoMarcas tipoAutomovil) {
        this.tipoAutomovil = tipoAutomovil;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public int getCantidadAsientos() {
        return cantidadAsientos;
    }

    public void setCantidadAsientos(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }

    public float getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(float velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public ColorAutomovil getColor() {
        return color;
    }

    public void setColor(ColorAutomovil color) {
        this.color = color;
    }

    public double getVelocidadActual() {
        return velocidadActual;
    }

    
    public void setVelocidadActual(double velocidadActual) {
        this.velocidadActual = velocidadActual;
    }
    
    //Metodos
 
    public void mostrarInformacion() {
        System.out.println("Automovil");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Motor: " + motor + "Lt");
        System.out.println("Tipo de Combustible: " + tipoCombustible);
        System.out.println("Tipo de Automovil: " + tipoAutomovil);
        System.out.println("Puertas: " + numeroPuertas);
        System.out.println("Asientos: " + cantidadAsientos);
        System.out.println("Velocidad Maxima: " + velocidadMaxima + " km/h");
        System.out.println("Color: " + color);
        System.out.println("Velocidad Actual: " + velocidadActual + " km/h");
    }

    public void acelerar(double incremento) {
        if (velocidadActual + incremento > velocidadMaxima) {
            System.out.println("No se puede acelerar más allá de la velocidad máxima permitida ("+ velocidadMaxima + " km/h).");
            velocidadActual = velocidadMaxima;
        } else {
            velocidadActual = velocidadActual+incremento;
            System.out.println("Velocidad Actual: " + velocidadActual + " km/h");
        }
    }
    
    
    public void desacelerar(double decremento) {
        if (velocidadActual - decremento < 0) {
            System.out.println("No se puede desacelerar a una velocidad negativa.");
            velocidadActual = 0;
        } else {
            velocidadActual -= decremento;
            System.out.println("Velocidad Actual: " + velocidadActual + " km/h");
        }
    }

    
    public void frenar() {
        velocidadActual = 0;
        System.out.println("El automovil ha frenado: 0 km/h");
    }
    

    
}


    


