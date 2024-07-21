package atleta;

public abstract class Atleta {
    private String nome;
    private double peso;

    public Atleta(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

}
