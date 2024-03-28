package ifsc;

public class main {

	public static void main(String[] args) {
		
		//instanciar a classe
	Pessoa thalles	 = new Pessoa();
	
	thalles.cpf = "123456";
	thalles.primeironome = "Thalles";
	thalles.sobrenome = "Santos";
	
	System.out.println(thalles.cpf);
	System.out.println(thalles.primeironome);
	System.out.println(thalles.sobrenome);
	
	
	Pessoa mariana = new Pessoa();
	mariana.cpf = "789456";
	mariana.primeironome = "Mariana";
	mariana.sobrenome = "Azevedo";
	
	System.out.println(mariana.cpf);
	System.out.println(mariana.primeironome);
	System.out.println(mariana.sobrenome);
	
	Pessoa[] pessoas = new Pessoa[2];
	pessoas[0] = thalles;
	pessoas[1] = mariana;		
	
	
	
	
	
	
	
	
	
	}

}
