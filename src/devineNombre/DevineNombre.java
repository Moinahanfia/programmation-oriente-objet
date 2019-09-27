//creation package
package devineNombre;
import java.util.Random;

//creation de_classe_principale pour_execution_programme
public class DevineNombre {
	
	
	static boolean gagne = false;
    static boolean exit = false;
    
    //La_classe_methode_static.devient_un_attribut_contenant_les_caracteristiques_Affichage
    //.creation_de_news_affichage_appelé_afficher
    public static void main(String[] args) {
    	
        Affichage.afficher("Bienvenue \n Devinez le nombre!");
        do {
            // Générer le nombre aléatoire.
            Random r = new Random();
            int nbOrdi = r.nextInt(50);
            Affichage.afficher(nbOrdi);
            do {
                Affichage.afficher("Saissez le nombre");
                String choix = Affichage.lireSaisie();
                if (choix.matches("[0-9]*")) {
                    int nombre = Integer.parseInt(choix);
                    if (nombre == nbOrdi) {
                        Affichage.afficher("Gagné");
                        gagne = true;
                    } else if (nombre < nbOrdi) {
                        Affichage.afficher("Le nombre est plus grand ");
                    } else {
                        Affichage.afficher("Le nombre est plus petit ");
                    }
                }
            } while (!gagne);
            Affichage.afficher("Voulez-vous continuer[O,n] ?");
            String reponse = Affichage.exit();
            if (reponse.equals("n")) {
                exit = true;
                Affichage.afficher("Au revoir!");
            }
        } while (!exit);
    }
}


