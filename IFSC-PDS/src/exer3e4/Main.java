package exer3e4;

public class Main {
    public static void main(String[] args) {
        
        Agenda agenda = new Agenda();

        
        agenda.addContatinho(new Contatinho("Neymar Ferreira", "neymar@gmail.com", "83988888", "Professor"));
        agenda.addContatinho(new Contatinho("Marta da Silva", "martinha@gmail.com", "83999999", "Amiga"));
        agenda.addContatinho(new Contatinho("João melao Souza", "joaos@gmail.com", "83977777", "Colega"));

        
        agenda.salvarLista("agenda.txt");
    }
}
