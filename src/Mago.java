
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
public class Mago extends Carta{
    private int manaActual;
    private double ataqueBasico;
    private double ataqueEspecial;
    private double ataquepotenciado;

    public Mago(int manaActual, double ataqueBasico, double ataqueEspecial, double ataquepotenciado, String nombre, double ataque, double defensa, double vida, String tipo, ImageIcon imagen, String descripcion) {
        super(nombre, ataque, defensa, tipo, imagen, descripcion);
        this.manaActual = manaActual;
        this.ataqueBasico = ataqueBasico;
        this.ataqueEspecial = ataqueEspecial;
        this.ataquepotenciado = ataquepotenciado;
        
    }

    public int getManaActual() {
        return manaActual;
    }

    public void setManaActual(int manaActual) {
        this.manaActual = manaActual;
    }

    public double getAtaqueBasico() {
        return ataqueBasico;
    }

    public void setAtaqueBasico(double ataqueBasico) {
        this.ataqueBasico = ataqueBasico;
    }

    public double getAtaqueEspecial() {
        return ataqueEspecial;
    }

    public void setAtaqueEspecial(double ataqueEspecial) {
        this.ataqueEspecial = ataqueEspecial;
    }

    public double getAtaquepotenciado() {
        return ataquepotenciado;
    }

    public void setAtaquepotenciado(double ataquepotenciado) {
        this.ataquepotenciado = ataquepotenciado;
    }

    public void setAtaque(double ataque) {
        if (ataque < 0) {
            ataque = 0;
        }
        super.setAtaque(ataque);
    }

    public void recibirDanio(double danio) {
        vida -= danio;
        if (vida < 0) {
            vida = 0;
        }
    }

    public void ataqueBasico() {
        setManaActual(getManaActual()); // El ataque básico no gasta mana
        double danio = 15;
        setAtaque(getAtaque() + danio);
    }

    public void ataqueEspecial() {
        double porcentajeMana = 0.15;
        double costoMana = getManaActual() * porcentajeMana;
        setManaActual(getManaActual() - (int) costoMana);
        double danioExtra = getAtaque() * 2;
        setAtaque(getAtaque() + danioExtra);
    }

    public void ataquePotenciado() {
        double porcentajeMana = 0.35;
        double costoMana = getManaActual() * porcentajeMana;
        setManaActual(getManaActual() - (int) costoMana);
        double danioExtra = getAtaque() * 2;
        setAtaque(getAtaque() + danioExtra);
    }
}
