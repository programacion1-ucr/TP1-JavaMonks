import javax.swing.JOptionPane;

public class Jugador{
    private String nombre;
    private int puntos;
    private Ficha[] mano;

    public Jugador(){

    }

    public void pedirNombre(String nombre){
        this.nombre = JOptionPane.showInputDialog(nombre);
    }
    public String getNombre(){
        return nombre;
    }
    public void agregarFicha(Ficha ficha){ //agrega una ficha a la mano del jugador
        for(int i = 0; i < mano.length; i++){
            if(mano[i] == null){
                mano[i] = ficha;
                return;
            }
        }
    }
    public void quitarFicha(Ficha ficha){ //quita una ficha de la mano del jugador cuando la juega
        for(int i = 0; i < mano.length; i++){
            if(mano[i] == ficha){
                mano[i] = null;
                return;
            }
        }
    }
    public Ficha[] mostrarMano() {
        return this.mano;
    }
    public boolean tieneFichaJugable(Tablero tablero) {
        return true;
    }
    public int sumarPuntos(int puntos) {
        this.puntos += puntos;
        return this.puntos;
    }
    public int calcularPuntosMano() { //calcula los puntos de las fichas que quedaron al perder la ronda
        return 0;
    }

    public static void main (String[] args) {}
}

