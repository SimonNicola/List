/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.corredor;

/**
 *
 * @author DAWTarde
 */
public class Corredor implements Cloneable,Comparable<Corredor>{

    private String nombre;
    private String apellidos;
    private int dorsal;
    private int minutos;
    private int segundos;
    private int posicion;

    public Corredor() {
        this.nombre = "";
        this.apellidos = "";
        this.dorsal = -1;
        this.minutos = -1;
        this.segundos = -1;
        this.posicion = -1;
    }

    public Corredor(String nombre, String apellidos, int dorsal, int minutos, int segundos, int posicion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dorsal = dorsal;
        this.minutos = minutos;
        this.segundos = segundos;
        this.posicion = posicion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getDorsal() {
        return dorsal;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
    
    public Corredor clone(Corredor c){
        Corredor temp = new Corredor(c.getNombre(),c.getApellidos(),c.getDorsal(), c.getMinutos(), c.getSegundos(), c.getDorsal());
        return temp;
    }
    public String toString(){
        return "Nombre del corredor " + this.getNombre() + " Apellido jugador " + this.getApellidos() + " Dorsal jugador " + this.dorsal + " minutos jugador " + this.getMinutos() + " segundos jugador " + this.getSegundos() ;
    }

    @Override
    public int compareTo(Corredor o) {
        int segundosJugador1;
        int segundosJugador2;
        segundosJugador1=this.minutos*60;
        segundosJugador2=o.minutos*60;
        //si el jugador1 tiene mas segundos
        if(segundosJugador1 > segundosJugador2){
            return -1;
        //si el jugador tiene menos segundos
        } else if (segundosJugador1 < segundosJugador2){
            return 1;
        } else if (segundosJugador1 == segundosJugador2){
            return 0;
        } else {
            return -55;
        }
    }
}
