/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenlab10p2_hectorrivera;

import java.io.Serializable;

/**
 *
 * @author hriverav
 */
public class Auto implements Serializable{
    private String marca,Modelo;
    private int velocidad;
    
    public Auto(String marca, String Modelo, int velocidad){
        this.marca = marca;
        this.Modelo = Modelo;;
        this.velocidad  =velocidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return marca + " "+ Modelo;
    }
    
    
}
