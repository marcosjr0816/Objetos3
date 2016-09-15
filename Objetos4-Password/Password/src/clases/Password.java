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
public class Password {
    
    private int longitud;
    private String contraseña;
    
    public Password(String contraseña){
        this.longitud = 8;
        this.contraseña = contraseña;
    }
    
    public Password (int longitud,String contraseña){
        this.longitud = longitud;
        this.contraseña = contraseña;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }   
    
    public String fuerte(){
        
        String f;
        if (this.getLongitud()>=6) {
            f="La contraseña actual es fuerte y segura";
        }
        else{
            f="La contraseña actual no es fuerte y no es egura";
        }
        return f;
    }
    
    public String  mostrar(){
       String aux;
       aux="La contraseña es :" + getContraseña()+ "\n"
               + "la longitud es de :" + getLongitud();
       return aux;
    }
    
    public void CambiarContraseña(String nueva,int longitud){
        
        this.setContraseña(nueva);
        this.setLongitud(longitud);
    }
}
