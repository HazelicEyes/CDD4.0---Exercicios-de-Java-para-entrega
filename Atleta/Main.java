package atleta;

public class Main {

	public static void main(String[] args) {
		Ciclista ci1 = new Ciclista("Henrique", 66.6);
        Corredor co2 = new Corredor("Matheus", 55.5);
        Biatleta bi1 = new Biatleta("Rodrigo", 77.7);

        ci1.pedalar();
        co2.correr();
        
        bi1.pedalar();
        bi1.correr();

	}

}
