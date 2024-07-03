package Revisao;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		
		
		Tutor TutorA = new Tutor();
		TutorA.setNomeCompleto("JaoPaulo");
		Tutor TutorB = new Tutor();
		TutorB.setNomeCompleto("PedroArago");
		Tutor TutorC = new Tutor();
		TutorC.setNomeCompleto("Andreyoung");
		
		
		
		
		
		
		Gato GatoA = new Gato();
		Gato GatoB = new Gato();
		Gato GatoC = new Gato();
		
		GatoA.setApelido("Joca");
		GatoA.setPedigree("SRL");
		GatoA.setNomeCientifico("GatusCurricularis");
		GatoA.setClasse("Herbivurus");
		TutorA.setGato(GatoA);
		
		GatoB.setApelido("Pedra");
		GatoB.setPedigree("CLT");
		GatoB.setNomeCientifico("GatusPretusMilharis");
		GatoB.setClasse("Mamifero");
		TutorB.setGato(GatoB);
		
		GatoA.setApelido("Joca");
		GatoA.setPedigree("SRL");
		GatoA.setNomeCientifico("gatoslares");
		GatoA.setClasse("Canemurus");
		TutorC.setGato(GatoC);
		
		ArrayList<Tutor> tutores = new ArrayList<>();
		tutores.add(TutorA);
		tutores.add(TutorB);
		tutores.add(TutorC);
		
		for (Tutor tutor : tutores) {
			System.out.println(tutor.getNomeCompleto());
		   
			Gato gato = tutor.getGato();
			
			System.out.println(gato.getApelido());
			System.out.println(gato.getPedigree());
			System.out.println(gato.getClass());
			
			
			
		}
	
		
		
		

	}

}
