
public class Mago extends Carta{
    private int manaActual;
//    private double ataqueBasico;
//    private double ataqueEspecial;
//    private double ataquepotenciado;

    public Mago() {
        super("Arin", 10, 20, "Mago");
        this.manaActual = 200;
        
    }

    public int getManaActual() {
        return manaActual;
    }

    public void setManaActual(int manaActual) {
        this.manaActual = manaActual;
    }
    
    public void ataqueBasico() {
         // El ataque básico no gasta mana
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
    @Override
    public String mostrarInformacion(){
        return "Descripcion: " + getDescripcion()
                + "\nNombre: " + getNombre()
                + "\nAtaque: " + getAtaque()
                + "\nDefensa: " + getDefensa()
                + "\nTipo: " + getTipo()
                + "\nVida: " + getVida()
                + "\nMna: " + getManaActual();
       
    }

}
