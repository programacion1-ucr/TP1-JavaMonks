public class Mazo{
	private Ficha [] mazo;

	public Mazo(int valorMaximo){ //Funciona para cualquier modo de juego, ya sea hasta [7|7], [8|8], etc.
		int tamanoMazo = 0;
		for (int i = 0; i < valorMaximo+2; i++){
			tamanoMazo += i;
		}
		mazo = new Ficha[tamanoMazo];
		int contador = 0;
		for (int i = 0; i <= valorMaximo; i++){
			for (int j = 0; j <= i;j++){
				Ficha fichaInstancia = new Ficha(i,j);
				mazo[contador] = fichaInstancia;
				contador++;
			}
		}
	}
	public void barajar(){ //Funciona para cualquiera
		for (int i = 0; i<mazo.length; i++){
			int aleatorio = (int)(Math.random()*mazo.length);
			Ficha temporal = mazo[i];
			mazo[i] = mazo[aleatorio];
			mazo[aleatorio] = temporal;
		}
	}
	public void imprimir(Ficha [] fichas){
		for(int i = 0 ; i < fichas.length; ++i){
			System.out.println(fichas[i]);
		}
		System.out.println("");
	}
	public Ficha sacarFicha(){ 
		if (mazo.length == 0){
			System.out.println("Se acabaron las fichas del mazo");
			return null;
		}
		Ficha fichaSacada = mazo[0];
		Ficha [] nuevoMazo = new Ficha[mazo.length-1];
		for (int i = 1; i < mazo.length;i++){
			nuevoMazo[i-1] = mazo[i];
		}
		mazo = nuevoMazo;
		return fichaSacada;
	}
	public Ficha [] manoInicial(){ //Recordar barajar antes de llamar al metodo
		Ficha [] manoInicial = new Ficha[7];
		for (int i = 0; i < manoInicial.length; i++){
			manoInicial[i] = sacarFicha();
		}
		return manoInicial;
	}
	public boolean quedanFichas(){
		boolean quedanFichas = true;
		if (mazo.length == 0){
			quedanFichas = false;
		}
		return quedanFichas;
	}

	public static void main (String [] args){ //Es solo para probar que todo funcione, eliminar al final del proyecto
		Mazo mazo = new Mazo(6);
		mazo.imprimir(mazo.mazo);
		mazo.barajar();
		mazo.imprimir(mazo.mazo);
		Ficha[] mano1 = mazo.manoInicial();
		Ficha[] mano2 = mazo.manoInicial();
		mazo.imprimir(mazo.mazo);
		mazo.imprimir(mano1);
		mazo.imprimir(mano2);
		System.out.println(mazo.quedanFichas());





	}	
}