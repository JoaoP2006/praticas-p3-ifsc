package poo;

public class Main {

	public static void main(String[] args) {
		
		Pessoa p = new Paciente("renato ","1222" ,"1" );
		p.print();
		System.out.println(((Paciente)p).codigo);
	
		
		float i = 5/2f;
		System.out.println(i);
		

	}

}
