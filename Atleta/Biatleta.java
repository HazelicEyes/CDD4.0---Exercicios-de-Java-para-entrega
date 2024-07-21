package atleta;

public class Biatleta extends Atleta implements Bicicleta, Correr{

	public Biatleta(String nome, double peso) {
		super(nome, peso);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void pedalar() {
		System.out.println(getNome() + " está pedalando.");
	}
	@Override
	public void correr() {
		System.out.println(getNome() + " está correndo.");
	}
}