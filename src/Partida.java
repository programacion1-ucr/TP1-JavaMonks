public class Partida {
    private Jugador jugador1;
    private Jugador jugador2;
    private Mazo mazo;
    private Tablero tablero;
    private String modoDeJuego;
    private String turno;
    private int metaPuntos;
    private boolean partidaFinalizada;


   /* public void iniciarRonda(){ //inicia la ronda, reparte las fichas a los jugadores y determina el primer turno
        mazo.barajar();
        jugador1.setMano(mazo.manoInicial());
        jugador2.setMano(mazo.manoInicial());
        Ficha [] mano1 = jugador1.getMano();
        Ficha [] mano2 = jugador2.getMano();
        for (int i = 0; i < mano1.length; i++){
            if (mano1.esDoble()){
                //
            }
        nota: aun no esta terminado, no compila aun, apenas pueda lo termino.
        }

    }*/
    public void jugarTurno(){ //el jugador elige qué jugada hacer, se valida y se coloca, o se hace comer/pasar el turno

    }
    public void finalizarRonda(){ //se determina el ganador de la ronda y se le suman los puntos, se verifica si hay ganador de la partida

    }
    public void calcularGanador() { //se determina el ganador de la partida
    }
    public void jugarPartida(){ //se repite el ciclo de iniciar ronda, jugar turno y finalizar ronda hasta que haya un ganador

    }

    public static void main(String[] args){

    }
}