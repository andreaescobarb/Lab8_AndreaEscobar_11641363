/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_andreaescobar_p2;

/**
 *
 * @author andre
 */
public class Lamias extends Hadas{
    private int aletas;
    private int branquias;

    public Lamias(int aletas, int branquias, String nombre, int edad, int salud, int estatura, int poder) {
        super(nombre, edad, salud, estatura, poder);
        this.aletas = aletas;
        this.branquias = branquias;
    }

    public Lamias(int aletas, int branquias) {
        this.aletas = aletas;
        this.branquias = branquias;
    }

    public int getAletas() {
        return aletas;
    }

    public void setAletas(int aletas) {
        this.aletas = aletas;
    }

    public int getBranquias() {
        return branquias;
    }

    public void setBranquias(int branquias) {
        this.branquias = branquias;
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

    public void setSalud(double salud) {
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
    
}
