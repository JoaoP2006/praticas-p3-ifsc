package exer3e4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Agenda {
    private List<Contatinho> listaContatinhos;

   
    public Agenda() {
        listaContatinhos = new ArrayList<>();
    }

    
    public void addContatinho(Contatinho contatinho) {
        listaContatinhos.add(contatinho);
    }

    
    public void ordenarLista() {
        Collections.sort(listaContatinhos, Comparator.comparing(Contatinho::getNome));
    }

   
    public void salvarLista(String nomeArquivo) {
        ordenarLista();  
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo))) {
            for (Contatinho contatinho : listaContatinhos) {
                writer.write(contatinho.toString());
                writer.newLine();
            }
            System.out.println("Lista salva com sucesso no arquivo: " + nomeArquivo);
        } catch (IOException e) {
            System.out.println("Erro ao salvar o arquivo: " + e.getMessage());
        }
    }
}

