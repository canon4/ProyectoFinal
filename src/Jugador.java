
import javax.swing.JOptionPane;


public class Jugador {
    
    private String nombre;
    private Object Cartas[];
    private int pos;
    private boolean turno;
    
    public Jugador(String nombre, boolean turno) {
        this.nombre = nombre;
        this.Cartas = new Carta[3];
        this.turno = turno;
        this.pos = 0;
    }
    
    public void agregarCartas(Object carta) {
        if (pos < Cartas.length) {
            this.Cartas[pos] = carta;
            pos++;
        }else{
            JOptionPane.showMessageDialog(null, "mazo lleno");
        }
        
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Object[] getCartas() {
        return Cartas;
    }

    public void setCartas(Object[] Cartas) {
        this.Cartas = Cartas;
    }
    
    public boolean isTurno() {
        return turno;
    }
    
    public void setTurno(boolean turno) {
        this.turno = turno;
    }
    
    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", Cartas=" + Cartas.toString() + ", turno=" + turno + '}';
    }
    
}
