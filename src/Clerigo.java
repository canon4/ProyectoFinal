
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
public class Clerigo extends Carta{
    private double vida = 220;
    private double mana = 230;
    private double ataqueBasico = 34;

    public Clerigo(String nombre, double ataque, double defensa, double vida, String tipo, ImageIcon imagen, String descripcion) {
        super(nombre, ataque, defensa, tipo, imagen, descripcion);
    }

    public void curarPersonaje() {
        if (this.mana >= 100) {
            this.vida += this.vida * 0.5; // Devuelve el 50% de la vida
            this.mana -= 100; // Resta 100 de mana
        } else {
            System.out.println("No tienes suficiente mana para realizar esta acción.");
        }
    }

    public void curarAliado(Carta aliado) {
        if (this.mana >= 120) {
            if (aliado.getVida() > 0) {
                aliado.setVida(aliado.getVida() * 2); // Devuelve el 100% de la vida
                this.mana -= 120; // Resta 120 de mana
            } else {
                System.out.println("No puedes curar a un aliado muerto.");
            }
        } else {
            System.out.println("No tienes suficiente mana para realizar esta acción.");
        }
    }

    public void usarAtaqueBasico(Carta objetivo) {
        if (this.mana >= 40) {
            double danio = this.ataqueBasico - objetivo.getDefensa();
            if (danio > 0) {
                objetivo.setVida(objetivo.getVida() - danio);
            }
        } else {
            System.out.println("No tienes suficiente mana para realizar esta acción.");
        }
    }

    public double getVida() {
        return this.vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public double getMana() {
        return this.mana;
    }

    public void setMana(double mana) {
        this.mana = mana;
    }

    public double getAtaqueBasico() {
        return this.ataqueBasico;
    }

    public void setAtaqueBasico(double ataqueBasico) {
        this.ataqueBasico = ataqueBasico;
    }
}
