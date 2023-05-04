
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
    private double mana;
    private double ataqueBasico;

    public Clerigo() {
        super("Lirien", 10, 20, "Clerigo");
        this.mana = 200;
  
    }

    public void autoCuracion() {
        if (this.mana >= 100) {
            this.setVida(this.getVida() * 0.5); // Devuelve el 50% de la vida
            this.mana -= 75; // Resta 100 de mana
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
    @Override
    public String mostrarInformacion(){
        return "Descripcion: " + getDescripcion()
                + "\nNombre: " + getNombre()
                + "\nAtaque: " + getAtaque()
                + "\nDefensa: " + getDefensa()
                + "\nTipo: " + getTipo()
                + "\nVida: " + getVida()
                + "\nMana: " + getMana();
    }
    
}
