/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Marcos Sarmientos
 */
public class Cafetera {
    private int capacidadMaxima;
    private int cantidadActual;

    public Cafetera() {
        this.capacidadMaxima = 1000;
        this.cantidadActual = 0;
    }

    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        if (cantidadActual > capacidadMaxima) {
            this.cantidadActual = capacidadMaxima;
        } else {
            this.cantidadActual = cantidadActual;
        }
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public void llenarCafetera() {
        this.setCantidadActual(this.getCapacidadMaxima());
    }

    public void servirTaza(int capacidadTaza) {
        int aux;
        if (capacidadTaza > this.getCantidadActual()) {
            aux = 0;
            this.setCantidadActual(aux);
        } else {
            aux = this.getCantidadActual() - capacidadTaza;
            this.setCantidadActual(aux);
        }
    }

    public void vaciarCafetera() {
        this.setCantidadActual(0);
    }

    public void agregarCafe(int cantidadCafe) {
        int aux;
         aux = this.getCantidadActual() + cantidadCafe;
        if (aux > this.getCapacidadMaxima()) {
            this.setCantidadActual(this.getCapacidadMaxima());
        } else {
            this.setCantidadActual(aux);
        }
    }
}
