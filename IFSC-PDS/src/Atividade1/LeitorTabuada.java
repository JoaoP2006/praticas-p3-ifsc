package Atividade1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LeitorTabuada {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número de 1 a 10: ");
        int numero = leitor.nextInt();
        String nomeArquivo = "tabuada_" + numero + ".txt";
        
        try (BufferedReader leitura = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            while ((linha = leitura.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.out.println("Arquivo não encontrado: " + nomeArquivo);
        } finally {
            leitor.close();
        }
    }
}


