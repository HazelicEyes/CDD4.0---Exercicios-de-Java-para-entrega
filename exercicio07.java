package exercicios_para_entrega;

public class exercicio07 {

	public static void main(String[] args) {
//		String array1[] = {"a","vida","é","bela"};
//		String texto1 = array1[3] + " " + array1[2] + " " + array1[1] + " " + array1[0];
//		String texto2 = texto1.toUpperCase();
//		System.out.println(texto2);

		String array1[] = {"a","vida","é","bela"};
		String texto1 = new String();
		for (int x = 3; x>=0; x--)
			texto1 = texto1 + " " + array1[x];
		String texto2 = texto1.toUpperCase();
		System.out.println(texto2);

	}

}
