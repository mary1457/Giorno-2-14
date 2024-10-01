package esercizio3;

public class Main3 {
    public static void main(String[] args) {

        RubricaTelefonica rubrica = new RubricaTelefonica();


        rubrica.inserisciContatto("Mario Bros", 123);
        rubrica.inserisciContatto("Luigi Bros", 456);
        rubrica.inserisciContatto("Peach", 789);

        rubrica.cancellaContatto("Peach");
        rubrica.cancellaContatto("Toad");



        rubrica.stampaRubrica();


    }
}
