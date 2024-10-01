package esercizio3;

import java.util.HashMap;


public class RubricaTelefonica {

    HashMap<String, Integer> rubricaTelefonica = new HashMap<>();


    public void inserisciContatto(String nome, int telefono) {
        rubricaTelefonica.put(nome, telefono);
        System.out.println("Contatto aggiunto: " + nome + " - " + telefono);
    }

    public void cancellaContatto(String nome) {
        if (rubricaTelefonica.containsKey(nome)) {
            rubricaTelefonica.remove(nome);
            System.out.println("Contatto cancellato: " + nome);
        } else {
            System.out.println("Contatto non trovato: " + nome);
        }
    }

    public void stampaRubrica() {
        if (rubricaTelefonica.isEmpty()) {
            System.out.println("La rubrica è vuota.");
        } else {
            System.out.println("Elenco dei contatti:");
            for (String nome : rubricaTelefonica.keySet()) {
                System.out.println("Nome: " + nome + ", Telefono: " + rubricaTelefonica.get(nome));
            }
        }
    }
}
