package fatura;

public class FaturaTeste {

	public static void main(String[] args) {
		Fatura fatura = new Fatura("1", "Camisa", 2, 10.00);
        System.out.println("Número: " + fatura.getNumero());
        System.out.println("Descrição: " + fatura.getDescricao());
        System.out.println("Quantidade: " + fatura.getQuantidade());
        System.out.println("Preço por Item: " + fatura.getPreco());
        System.out.println("Total da Fatura: " + fatura.getTotalFatura());
		
        Fatura fatura2 = new Fatura("2", "TV", 5, 3000.00);
        fatura2.setQuantidade(1111);
        fatura2.setPreco(-22.22);
        System.out.println("Número: " + fatura2.getNumero());
        System.out.println("Descrição: " + fatura2.getDescricao());
        System.out.println("Quantidade: " + fatura2.getQuantidade());
        System.out.println("Preço por Item: " + fatura2.getPreco());
        System.out.println("Total da Fatura: " + fatura2.getTotalFatura());
        

	}

}
