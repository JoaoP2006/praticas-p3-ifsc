package IFSC;

import java.util.ArrayList;
import java.util.Iterator;

public class MainVeiculo {

	public static void main(String[] args) {
	
		Veiculo bmw = new Veiculo();
		
		bmw.setNumeroderodas(4);
		bmw.setCor("branco");
		bmw.setFabricante("BMW");
		bmw.setNome("BMWa4");
        bmw.setAno(2015);
        
        
        Veiculo Kwid = new Veiculo();
        
        Kwid.setNumeroderodas(4);
		Kwid.setCor("preto");
		Kwid.setFabricante("Ronda");
		Kwid.setNome("Kwid1");
        Kwid.setAno(2012);
        
        Veiculo Volvo = new Veiculo();
        
        Volvo.setNumeroderodas(4);
        Volvo.setCor("rosa");
        Volvo.setFabricante("Volvinho");
        Volvo.setNome("Volvom2");
        Volvo.setAno(2011);
        
        ArrayList<Veiculo> veiculos = new ArrayList();
        veiculos.add(bmw);
        veiculos.add(Kwid);
        veiculos.add(Volvo);
        
        for (Veiculo veiculo : veiculos) {
			
        	System.out.println(veiculo.getNome());
        	System.out.println(veiculo.getCor());
        	System.out.println(veiculo.getFabricante());
        	System.out.println(veiculo.getNumeroderodas());
        	System.out.println(veiculo.getAno());
		}
        
	}

}
