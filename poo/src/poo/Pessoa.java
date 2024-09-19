package poo;

public abstract class Pessoa {
	
	private String nome;
	
	String cpf;
	Endereco endereco;
	public Pessoa(String nome, String cpf) { 
		this.nome=nome;
        this.cpf=cpf;
		
		
	}
	public void print() {
		
		System.out.println("nome" + nome);
		System.out.println("cpf" + cpf);
		
		
		
	}
	

}
