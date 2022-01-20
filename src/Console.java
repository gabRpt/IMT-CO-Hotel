import java.util.Scanner;

public class Console {
	
	public static void afficherChoixCreationOuImportation() {
		System.out.println("Bienvenue dans le système de gestion d'hotel");
		System.out.println("1 - charger un hotel :");
		System.out.println("2 - créer un hotel :");
		System.out.println("3 - Quitter");
	}
	
	public static void afficherChoixNomHotel() {
		System.out.println("Quel sera le nom de votre Hotel ?");
	}
	
	public static void afficherChoixCheminAcces() {
		System.out.println("Quel sera le chemin d'accès du modele ?");
	}
	
	public static String recupererUneEntree() {
		Scanner scan = new Scanner(System.in);
		return scan.nextLine();
	}
	
	
}
