public class Ficha{
	private int numeroSuperior;
	private int numeroInferior;

	public Ficha(int numeroSuperior, int numeroInferior){
		this.numeroSuperior = numeroSuperior;
		this.numeroInferior = numeroInferior;
	}

	public int getPuntaje(){
		int puntaje = getNumeroInferior()+getNumeroSuperior();
		return puntaje;
	}
	public int getNumeroSuperior(){
		return numeroSuperior;
	}
	public int getNumeroInferior(){
		return numeroInferior;
	}
	public String toString(){
		return "[" + numeroSuperior + "|" + numeroInferior + "]";
	}
}