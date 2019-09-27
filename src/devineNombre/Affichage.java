//creation package
package devineNombre;

import java.util.Scanner;

//creation classe_contenant_methode_debut
public class Affichage {
	
	 static Scanner saisie = new Scanner(System.in);
	    
	    public static void afficher(String message) {
	        System.out.println(message);
	    }
	    public static void afficher(int message) {
	        System.out.println(message);
	    }
	    
	    public static String lireSaisie() {
	        
	        System.out.println("Veuillez saisir un nombre:");
	        String str = saisie.nextLine();
	        System.out.println("Vous avez saisi : " + str);
	        return str;
	    }
	    
	    public static String exit() {
	        return saisie.nextLine();
	    }


	

}
