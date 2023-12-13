public static void main(String[] args) {
    Livre livre1 = new Livre("Auteur1", "Titre1");
    Livre livre2 = new Livre("Auteur2", "Titre2");
    System.out.println("Les auteurs des deux livres sont : " + livre1.getAuteur() + " et " + livre2.getAuteur());
}