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
public class Complejos {
    private double real;
    private double imaginario;
    
    public Complejos(Double real,double imaginario){
        this.real=real;
        this.imaginario=imaginario;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imaginario;
    }

    public void setImag(double imaginario) {
        this.imaginario = imaginario;
    }
    
    public Complejos sumar(Complejos c2){
        Complejos c;
        double real,imaginario;
        real=(this.real+c2.real);
        imaginario=(this.imaginario+c2.imaginario);
        c=new Complejos(real,imaginario);
        return c;
        
    }
    public Complejos restar(Complejos c2){
        Complejos c;
        double real,imaginario;
        real=(this.real-c2.real);
        imaginario=(this.imaginario-c2.imaginario);
        c=new Complejos(real,imaginario);
        return c;
        
    }
    public Complejos multiplicar(Complejos c2){
        Complejos c;
        double real,imaginario;
        real=(this.real*c2.real)-(this.imaginario*c2.imaginario);
        imaginario=(this.real*c2.imaginario)+(this.imaginario*c2.real);
        c=new Complejos(real,imaginario);
        return c;
        
    }
    public Complejos dividir(Complejos c2) throws ComplejosDivisionCeroException{
        Complejos c;
        double real,imaginario;
        if ((c2.real==0)||(c2.imaginario==0)) {
            throw new ComplejosDivisionCeroException();
        }
       real=((this.real*c2.real)+(this.imaginario*c2.imaginario))/((c2.real*c2.real)+(c2.imaginario*c2.imaginario));
       imaginario=((-this.real*c2.imaginario)+(this.imaginario*c2.real))/((c2.real*c2.real)+(c2.imaginario*c2.imaginario));
        c=new Complejos(real,imaginario);
        return c;
        
    }
}
