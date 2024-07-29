package poo;

public class Paciente extends Pessoa {
	
	String codigo;
	public Paciente( String nome, String cpf, String codigo) {
		
		super(nome, cpf);
		this.codigo = codigo;
		System.out.println("criando paciente " + nome);
		System.out.println("codigo: " + codigo);
		
		
	}
	public Paciente(String nome , String cpf) { 
		this(nome, cpf , "1");
		
	}
	public void print() { 
		super.print();
		System.out.println("codigo " + codigo);
		System.out.println("=================================");
		
	}


}
