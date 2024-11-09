package tp5;

public class Mainp {

    public static void main(String[] args) {
        // Affichage d'un message de bienvenue
        System.out.println("Pépinière GREEN HANDS");
        Pépinière pépinière = new Pépinière();
        Fleur rose = new Fleur("Rose", 30, 12, 15.99f, "Rouge", 2);
        Fleur tulipe = new Fleur("Tulipe", 20, 8, 12.99f, "Jaune", 4);
        Arbre chêne = new Arbre("Chêne", "Caduque", 60, 89.99f, 200);
        Arbre sapin = new Arbre("Sapin", "Persistant", 30, 59.99f, 150);
        System.out.println("La " + rose.getNom() + " a la couleur " + rose.getCouleur());
        pépinière.ajoutPlante(rose);
        pépinière.ajoutPlante(tulipe);
        pépinière.ajoutPlante(chêne);
        pépinière.ajoutPlante(sapin);
        pépinière.afficherInventaire();
        System.out.println("Total Absorption CO2 : " + pépinière.totalAbsorptionTotaleCO2());
        System.out.println("Nombre d'arbres Caduques dans la pépinière : " + pépinière.compterArbresCaduques());
    }
}
