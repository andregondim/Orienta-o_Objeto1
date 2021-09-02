package orientacao_objeto;

public class Principal {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Carro carro = new Carro();
		
		carro.marca = "HYUNDAI";
		carro.modelo = "HB20";		
		carro.cor = "Preto";
		carro.versao = "TURBO";
		carro.valor = 51.20;
		carro.ano = "Dois Mil e vinte";
		
		System.out.printf("A Versão do carro no da HYUNDAI %s é %s",carro.versao, carro.cor, carro.marca);
		
	
	    

	}

}

