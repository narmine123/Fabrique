public class Main {
    public static void main(String[] args) {
        CompteInterface compteClient = CompteFactory.creerCompte("Client");
        compteClient.afficherType();

        CompteInterface compteServeur = CompteFactory.creerCompte("Serveur");
        compteServeur.afficherType();
    }
}
