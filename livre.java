
public class Livre {
    // Variables
    private String titre, auteur;
    private int nbPages;
    // Constructeur
    public Livre(String unAuteur, String unTitre) {
        auteur = unAuteur;
        titre = unTitre;
    }
    // Accesseur
    public String getAuteur() {
        return auteur;
    }
    // Modificateur
    void setNbPages(int n) {
        nbPages = n;
    }
}
