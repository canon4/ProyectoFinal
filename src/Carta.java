
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diego Canon
 */
public class Carta {
    private String nombre;
    private double ataque;
    private double defensa;
    private double vida;
    private String tipo;

    private String descripcion;

    public Carta(String nombre, double ataque, double defensa, String tipo) {
        this.nombre = nombre;
        this.ataque = ataque;
        this.defensa = defensa;
        this.tipo = tipo;

       
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getAtaque() {
        return ataque;
    }

    public void setAtaque(double ataque) {
        this.ataque = ataque;
    }

    public double getDefensa() {
        return defensa;
    }

    public void setDefensa(double defensa) {
        this.defensa = defensa;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    @Override
    public String toString() {
        return "Carta{" + "nombre=" + nombre + ", ataque=" + ataque + ", defensa=" + defensa + ", vida=" + vida + ", tipo=" + tipo + ", descripcion=" + descripcion + '}';
    }
    
    public String mostrarInformacion(){
         return "Descripcion: " + getDescripcion()
                + "\nNombre: " + getNombre()
                + "\nAtaque: " + getAtaque()
                + "\nDefensa: " + getDefensa()
                + "\nTipo: " + getTipo()
                + "\nVida: " + getVida();
    }
       public void recibirDanio(double danio) {
        vida -= danio;
        if (vida < 0) {
            vida = 0;
        }
    }
    
}
