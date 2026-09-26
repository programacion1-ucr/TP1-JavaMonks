public class Jugador{

	private Ficha [] mano;

	public Jugador(){
		mano = new Ficha[] mano;
	}
	public void setMano(Ficha [] mano){
		this.mano = mano;
	}
	public Ficha[] getMano(){
		return mano;
	}
}