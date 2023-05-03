
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
public class Arquero extends Carta{
     private double vida = 130;
    private double mana = 210;
    private double ataqueBásico;
    private double ataqueConPenetracion;
    private double ataqueDevasstador;

    public Arquero(double ataqueBásico, double ataqueConPenetracion, double ataqueDevasstador, String nombre, double ataque, double defensa, double vida, String tipo, ImageIcon imagen, String descripcion) {
        super(nombre, ataque, defensa, tipo, imagen, descripcion);
        this.ataqueBásico = ataqueBásico;
        this.ataqueConPenetracion = ataqueConPenetracion;
        this.ataqueDevasstador = ataqueDevasstador;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public double getMana() {
        return mana;
    }

    public void setMana(double mana) {
        this.mana = mana;
    }

    public double getAtaqueBásico() {
        return ataqueBásico;
    }

    public void setAtaqueBásico(double ataqueBásico) {
        this.ataqueBásico = ataqueBásico;
    }

    public double getAtaqueConPenetracion() {
        return ataqueConPenetracion;
    }

    public void setAtaqueConPenetracion(double ataqueConPenetracion) {
        this.ataqueConPenetracion = ataqueConPenetracion;
    }

    public double getAtaqueDevasstador() {
        return ataqueDevasstador;
    }

    public void setAtaqueDevasstador(double ataqueDevasstador) {
        this.ataqueDevasstador = ataqueDevasstador;
    }

    public void ataqueBasico(Carta objetivo) {
        double danio = 40;
        objetivo.recibirDanio(danio);
    }

    public void ataqueConPenetracion(Carta objetivo) {
        double costoMana = 60;
        if (this.mana >= costoMana) {
            double danio = 2 * 40;
            objetivo.recibirDanio(danio);
            this.mana -= costoMana;
        } else {
            System.out.println("No tienes suficiente mana para este ataque");
        }
    }

    public void ataqueDevastador(Carta objetivo) {
        double costoMana = 110;
        if (this.mana >= costoMana) {
            double danio = 2 * 40 + 46;
            objetivo.recibirDanio(danio);
            this.mana -= costoMana;
        } else {
            System.out.println("No tienes suficiente mana para este ataque");
        }
    }
}
