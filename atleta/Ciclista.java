package atleta;

public class Ciclista extends Atleta implements Bicicleta{
	public Ciclista(String nome, double peso) {
		super(nome, peso);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void pedalar() {
		System.out.println(getNome() + " está pedalando.");
	}
}
