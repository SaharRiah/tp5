package tp5;

public class Pépinière {
    private Plante[] inventaire;
    private static final int MAX_PLANTES = 1000;
    private int nbrPlante = 0;

    public Pépinière(Plante[] inventaire, int nbrPlante) {
        if (inventaire.length <= MAX_PLANTES) {
            this.inventaire = inventaire;
            this.nbrPlante = nbrPlante;
        } else {
            System.out.println("Le nombre de plantes dépasse la capacité maximale.");
            this.inventaire = new Plante[MAX_PLANTES];
            this.nbrPlante = MAX_PLANTES;
        }
    }

    public Pépinière(int nbrPlante) {
        if (nbrPlante <= MAX_PLANTES) {
            this.inventaire = new Plante[nbrPlante];
        } else {
            this.inventaire = new Plante[MAX_PLANTES];
        }
    }

    public Pépinière() {
        this.inventaire = new Plante[MAX_PLANTES];
        this.nbrPlante = 0;
    }

    // Méthode pour ajouter une plante
    public void ajoutPlante(Plante plante) {
        if (nbrPlante < inventaire.length) {
            inventaire[nbrPlante] = plante;
            nbrPlante++;
        } else {
            System.out.println("Erreur : Inventaire plein.");
        }
    }

    public void afficherInventaire() {
        for (int i = 0; i < nbrPlante; i++) {
            System.out.println(inventaire[i].toString());
        }
    }

    public double totalAbsorptionTotaleCO2() {
        double absorptionTotale = 0;
        for (int i = 0; i < nbrPlante; i++) {
            if (inventaire[i] instanceof Arbre) {
                absorptionTotale += ((Arbre) inventaire[i]).absorption();
            }
        }
        return absorptionTotale;
    }

    public int compterArbresCaduques() {
        int nb = 0;
        for (int i = 0; i < nbrPlante; i++) {
            if (inventaire[i] instanceof Arbre) {
                Arbre arbre = (Arbre) inventaire[i];
                if (arbre.getNom().equals("arbre") && arbre.getType_Feuillage().equals("caduque")) {
                    nb++;
                }
            }
        }
        return nb;
    }
}
