import java.util.Scanner;

import org.eclipse.emf.ecore.resource.Resource;

import hotelManagment.Hotel;
import hotelManagment.HotelManagmentFactory;

public class User {

	public ResourceTools myResourceTools;
	public HotelManagmentFactory myHotelFactory;
	
	public User(ResourceTools ressource,HotelManagmentFactory hotelFactory) {
		this.myResourceTools = ressource;
		this.myHotelFactory = hotelFactory;	
	}
	
	void debutProgramme() {
		
		Console.afficherChoixCreationOuImportation();
		
		switch (Console.recupererUneEntree()) {
        case "1": {
        	chargerHotel();
            break;
        }
        case "2": {
        	creerHotel();
            break;
        }
        case "3": {
        	System.exit(0);
            break;
        }
        default:
            throw new IllegalArgumentException("Erreur dans le choix !");
        }
	}
	
	private void creerHotel() {		

		Hotel myHotel = this.myHotelFactory.createHotel();
		
		Console.afficherChoixNomHotel();
		myHotel.setNom(Console.recupererUneEntree());
		
		Console.afficherChoixCreationCheminAcces();
		this.myResourceTools.saveResource(Console.recupererUneEntree(), myHotel);
		
		this.managerHotel(myHotel);
		
	}

	void chargerHotel() {
		
		Console.afficherChoixCheminAcces();
		
		try {
			
			Resource rr = this.myResourceTools.getResource(Console.recupererUneEntree());
			Hotel hotel = (Hotel)(rr.getContents().get(0));
			managerHotel(hotel);
			
		}catch (Exception e) {
			throw new IllegalArgumentException("Erreur dans le choix !");
		}
		
		
		
	}

	void managerHotel(Hotel hotel) {
		System.out.println("Bienvenue dans l'hotel : " + hotel.getNom());
		
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


		System.out.println("5 - Quitter et enregistrer");

	}
	
	
	
}
