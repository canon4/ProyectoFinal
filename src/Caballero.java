
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
public class Caballero extends Carta {

    private double ataquePotenciado;
    private double ataqueBasico;
    private double escudo;

    public Caballero() {
        super("Ivan", 10, 20, "Caballero");
        this.setDescripcion("El Caballero es una carta de ataque y defensa medio,"
                + " por su versatilidad ayuda a sus compañeros en el caso que sea requerido");
        this.ataquePotenciado = this.ataqueBasico * 2;
        this.ataqueBasico = 10;
        this.escudo = 20;
    }

    public double getAtaqueBasico() {
        return ataqueBasico;
    }

    public void setAtaqueBasico(double ataqueBasico) {
        this.ataqueBasico = ataqueBasico;
    }

    public double getAtaquePotenciado() {
        return ataquePotenciado;
    }

    public void setAtaquePotenciado(double ataquePotenciado) {
        this.ataquePotenciado = ataquePotenciado;
    }

    public double getEscudo() {
        return escudo;
    }

    public void setEscudo(double escudo) {
        this.escudo = escudo;
    }

    public void atacar(Carta objetivo) {
        if (objetivo.getVida() - (objetivo.getDefensa() - this.ataqueBasico) < objetivo.getVida()) {
            objetivo.setVida(objetivo.getVida() - (objetivo.getDefensa() - this.ataqueBasico));
        } else if (objetivo.getVida() - (objetivo.getDefensa() - this.ataqueBasico) > objetivo.getVida()) {
            objetivo.setVida(0);
        }

    }

    public void atacarPotenciado(Carta objetivo) {
        objetivo.setVida(objetivo.getVida() - (objetivo.getDefensa() - this.ataquePotenciado));
    }

    public void escudar() {
        setDefensa(this.getDefensa() + escudo);
    }
  
    @Override
    public String mostrarInformacion(){
        return "Descripcion: " + getDescripcion()
                + "\nNombre: " + getNombre()
                + "\nAtaque: " + getAtaque()
                + "\nDefensa: " + getDefensa()
                + "\nTipo: " + getTipo()
                + "\nVida: " + getVida();
    }

}
