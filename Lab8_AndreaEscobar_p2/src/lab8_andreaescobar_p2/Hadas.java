/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_andreaescobar_p2;

import java.io.Serializable;

/**
 *
 * @author andre
 */
public class Hadas implements Serializable{
    protected String nombre;
    protected int edad;
    protected double salud;
    protected int estatura;
    protected int poder;
    protected static final long SerialVersionUID = 777L;
    
    public Hadas(String nombre, int edad, int salud, int estatura, int poder) {
        this.nombre = nombre;
        this.edad = edad;
        this.salud = salud;
        this.estatura = estatura;
        this.poder = poder;
    }

    public Hadas() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getEstatura() {
        return estatura;
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    @Override
    public String toString() {
        return  nombre ;
    }
    
}
