
public class Arquero extends Carta{
    private double mana = 210;

    public Arquero() {
        super("Lyra", 10, 10, "Arquero");
        
    }

    public double getMana() {
        return mana;
    }

    public void setMana(double mana) {
        this.mana = mana;
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
    
    @Override
    public String mostrarInformacion(){
        return "Descripcion: " + getDescripcion()
                + "\nNombre: " + getNombre()
                + "\nAtaque: " + getAtaque()
                + "\nDefensa: " + getDefensa()
                + "\nTipo: " + getTipo()
                + "\nVida: " + getVida()
                + "\nMana; " + getMana();
    }
}
