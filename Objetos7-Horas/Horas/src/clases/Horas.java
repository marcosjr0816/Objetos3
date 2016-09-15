/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author msarmien19
 */
public class Horas {
    private int segundos;
    private int minutos;
    private int horas;

    public Horas(int segundos, int minutos, int horas) {
        this.segundos = segundos;
        this.minutos = minutos;
        this.horas = horas;
    }
    public Horas(){
        this.horas = 00;
        this.minutos = 00;
        this.segundos = 00;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
    
    public String valida (){
        String aux;
        
        if(this.getHoras() > 23 || this.getMinutos() > 60 || this.getSegundos() > 60){
            aux = "La hora 1 no es correcta";
        }else{
            aux = "La hora 1 es correcta";
        }
        return  aux;
    }
    public String valida2 (int h , int m ,  int s){
        String aux;
        
        if(h > 23 || m > 60 || s > 60){
            aux = "La hora 2 no es correcta";
        }else{
            aux = "La hora 2 es correcta";
        }
        return  aux;
    }
    public String mostar ( int h , int m , int s){
        String aux;
        
        aux = "Hora 1"+"\n"
                +"Las horas son "+this.getHoras() + "\n"
                + "Los minutos son "+this.getMinutos() + "\n"
                + "Los segundo son "+this.getSegundos() +"\n\n"
                + "Hora 2"+"\n"
                + "Las Horas son "+ h +"\n"
                + "Los minutos son "+m+"\n"
                + "Los Segundos son "+s+"\n";
        
        return aux;
    }
    public String Igual (int hor ,  int min ,  int seg){
        String aux;
        int h , m , s;
        h = this.getHoras();
        m = this.getMinutos();
        s = this.getSegundos();
        
        if (h == hor && m == min && s == seg){
            aux = "La horas ingresadas son iguales";
        }else{
            aux = "La horas ingresada no son iguales";
        }
        return aux;
    }
    public String Mayorque (int hor ,  int min ,  int seg){
        String aux;
        int h , m , s;
        h = this.getHoras();
        m = this.getMinutos();
        s = this.getSegundos();
        
         if (h > hor && m > min && s > seg){
            aux = "La hora ingresada es mayor que la proposionada";
        }else{
            aux = "La hora ingresada no es mayor que la proposionada";
        }
        return aux;
    }
    public String Menorque (int hor ,  int min ,  int seg){
        String aux;
        int h , m , s;
        h = this.getHoras();
        m = this.getMinutos();
        s = this.getSegundos();
        
         if (h < hor && m < min && s < seg){
            aux = "La hora ingresada es menor que la proposionada";
        }else{
            aux = "La hora ingresada no es menor que la proposionada";
        }
        return aux;
    }
}
