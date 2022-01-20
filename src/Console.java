import java.util.Scanner;

import hotelManagment.Hotel;

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
	
	public static void afficherChoixCreationCheminAcces() {
		System.out.println("Entrez le nom du fichier dans le format suivant:  exemple.xmi");
		System.out.println("Attention, si le fichier existe déjà il sera écrasé");
	}
	
	public static void afficherChoixCheminAcces() {
		System.out.println("Quel sera le chemin d'accès du modele ?");
	}
	
	public static void afficherChoixPrincicpaux(Hotel hotel) {
		System.out.println("\nBienvenue dans l'hotel : " + hotel.getNom());
		
		System.out.println("Que voulez vous faire ?\n");
		
		System.out.println("---------[ RESERVATION ]----------");
		System.out.println("11 - Créer une RESERVATION :");
		System.out.println("12 - Modifier une RESERVATION :");
		System.out.println("13 - Supprimer une RESERVATION :");
		System.out.println("14 - Afficher une RESERVATION :");
		System.out.println("15 - Afficher toutes les RESERVATION :");
		
		System.out.println("---------[ CHAMBRE ]----------");
		System.out.println("21 - Créer une CHAMBRE :");
		System.out.println("22 - Modifier une CHAMBRE :");
		System.out.println("23 - Supprimer une CHAMBRE :");
		System.out.println("24 - Afficher une CHAMBRE :");
		System.out.println("25 - Afficher toutes les CHAMBRE :");

		System.out.println("---------[ PERSONNEL ]----------");
		System.out.println("31 - Créer un PERSONNEL :");
		System.out.println("32 - Modifier un PERSONNEL :");
		System.out.println("33 - Supprimer un PERSONNEL :");
		System.out.println("34 - Afficher un PERSONNEL :");
		System.out.println("35 - Afficher tout le PERSONNEL :");
		
		System.out.println("---------[ CLIENT ]----------");
		System.out.println("41 - Créer un CLIENT :");
		System.out.println("42 - Modifier un CLIENT :");
		System.out.println("43 - Supprimer un CLIENT :");
		System.out.println("44 - Afficher un CLIENT :");
		System.out.println("45 - Afficher tous les CLIENT :");
		
		System.out.println("\n5 - Quitter et enregistrer");
	}
	
	public static String recupererUneEntree() {
		Scanner scan = new Scanner(System.in);
		return scan.nextLine();
	}	
}
