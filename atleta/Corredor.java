package atleta;

public class Corredor extends Atleta implements Correr{
	public Corredor(String nome, double peso) {
		super(nome, peso);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void correr() {
		System.out.println(getNome() + " está correndo.");
	}
}
