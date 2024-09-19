package Atividade1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Tabuada {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("digite um numero de 1 a 10: ");
		int numero = leitor.nextInt();
		String nomeArquivo = "tabuada_" + numero + ".txt";
		try(BufferedWriter escrita =
				new BufferedWriter(
				new FileWriter(nomeArquivo))){
			for(int i = 1; i <= 10; i++) {
				escrita.write(numero + "x" + i + "=" + (numero * i));
				escrita.newLine();
				
				
				
			}
			System.out.println("Tabuada salva no arquivo: " + nomeArquivo);
			
					
				} catch (IOException e ) {
					
					System.err.println("erro ao escrever no arquivo" + e.getMessage());
				}finally {
					leitor.close();
					
				}
		
		
		
		
		
		
	}
}

