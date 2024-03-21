// CompteFactory.java
public class CompteFactory {
    public static CompteInterface creerCompte(String type) {
        if (type.equalsIgnoreCase("Client")) {
            return new CompteClient();
        } else if (type.equalsIgnoreCase("Serveur")) {
            return new CompteServer();
        } else {
            return null;
        }
    }
}
