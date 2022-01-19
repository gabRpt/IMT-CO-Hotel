import java.io.IOException;
import java.util.Collections;
import java.util.Scanner;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import hotelManagment.Classique;
import hotelManagment.Client;
import hotelManagment.Hotel;
import hotelManagment.HotelManagmentFactory;
import hotelManagment.HotelManagmentPackage;
import hotelManagment.Personnel;
import hotelManagment.Presidentielle;
import hotelManagment.Reservation;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HotelManagmentFactory myHotelFactory = HotelManagmentFactory.eINSTANCE;
		/*
		Hotel myHotel = myHotelFactory.createHotel();
		
		myHotel.setNom("Papeete Hotel");
		myHotel.setAdresse("3 rue des fleurs, Papeete");
		myHotel.setCategorie("Luxe");
		myHotel.setChiffreAffaire(5000000);		
		
		Classique roomClassique1 = myHotelFactory.createClassique();
		Classique roomClassique2 = myHotelFactory.createClassique();
		Classique roomClassique3 = myHotelFactory.createClassique();
		Presidentielle roomPresidentielle1 = myHotelFactory.createPresidentielle();
		
		roomClassique1.setNbLits(1);
		roomClassique1.setNumero(101);
		roomClassique1.setPrix(20);

		roomClassique2.setNbLits(1);
		roomClassique2.setNumero(102);
		roomClassique2.setPrix(20);

		roomClassique3.setNbLits(1);
		roomClassique3.setNumero(103);
		roomClassique3.setPrix(20);

		roomPresidentielle1.setNbLits(3);
		roomPresidentielle1.setNumero(200);
		roomPresidentielle1.setPrix(400);
		roomPresidentielle1.setBalcon(true);
		roomPresidentielle1.setNbSdB(2);
		roomPresidentielle1.setNbTV(3);
		
		Personnel gabinPersonnel = myHotelFactory.createPersonnel();
		Personnel antoninPersonnel = myHotelFactory.createPersonnel();
		gabinPersonnel.setNom("Raapoto");
		gabinPersonnel.setPrenom("Gabin");
		antoninPersonnel.setNom("Maystre");
		antoninPersonnel.setPrenom("Antonin");
		
		Client bobRossClient = myHotelFactory.createClient();
		Client steveJobsClient = myHotelFactory.createClient();
		bobRossClient.setId(1);
		bobRossClient.setNom("Ross");
		bobRossClient.setPrenom("Bob");
		steveJobsClient.setId(2);
		steveJobsClient.setNom("Jobs");
		steveJobsClient.setPrenom("Steve");
		
		Reservation bobRossReservation = myHotelFactory.createReservation();
		Reservation steveJobsReservation = myHotelFactory.createReservation();
		bobRossReservation.setIdClient(1);
		bobRossReservation.setNumChambre(200);
		bobRossReservation.setDate(null);
		steveJobsReservation.setIdClient(2);
		steveJobsReservation.setNumChambre(101);
		steveJobsReservation.setDate(null);
		
		myHotel.getChambre().add(roomClassique1);
		myHotel.getChambre().add(roomClassique2);
		myHotel.getChambre().add(roomClassique3);
		myHotel.getChambre().add(roomPresidentielle1);
		
		myHotel.getClient().add(steveJobsClient);
		myHotel.getClient().add(bobRossClient);
		
		myHotel.getPersonnel().add(antoninPersonnel);
		myHotel.getPersonnel().add(gabinPersonnel);
		
		myHotel.getReserveration().add(steveJobsReservation);
		myHotel.getReserveration().add(bobRossReservation);
		
		ResourceTools myResourceTools = new ResourceTools();
		myResourceTools.saveResource("model.xmi", myHotel);
		
		Resource rr = myResourceTools.getResource("model.xmi");
		Hotel hotel = (Hotel)(rr.getContents().get(0));
		System.out.println(hotel.getAdresse());
		*/
		
		lancementDuProgramme();
		
		
            
        try (Scanner scan = new Scanner(System.in)) {
            String myLine;
            Hotel newHotel = myHotelFactory.createHotel();
            
          /*  while (true) {
                myLine = scan.nextLine();
                System.out.println(myLine);
                
                switch (myLine) {
                case "c": {
                    myLine = scan.nextLine();
                    
                    
                    break;
                }
                default:
                    throw new IllegalArgumentException("Unexpected value: " + myLine);
                }
            }*/
            
            
        }
	}

	private static void lancementDuProgramme() {
		System.out.println("Bienvenue dans le système de gestion d'hotel");
		System.out.println("1 - charger un hotel :");
		System.out.println("2 - créer un hotel :");
		System.out.println("3 - Quitter");
		
		Scanner scan = new Scanner(System.in);
		String value = scan.nextLine();
		
		switch (value) {
        case "1": {
            chargementHotel();
            break;
        }
        case "2": {
            creationHotel();
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

	private static void creationHotel() {		
		ResourceTools myResourceTools = new ResourceTools();
		
		HotelManagmentFactory myHotelFactory = HotelManagmentFactory.eINSTANCE;
		Hotel myHotel = myHotelFactory.createHotel();
		
		System.out.println("Quel sera le nom de votre Hotel ?");
		
		Scanner scan = new Scanner(System.in);
		String value = scan.nextLine();
		
		myHotel.setNom(value);
		
		managerHotel(myHotel);
		
	}

	private static void chargementHotel() {
		System.out.println("Quel est le chemin d'accès à votre model ?");
		
		Scanner scan = new Scanner(System.in);
		String value = scan.nextLine();
		
		ResourceTools myResourceTools = new ResourceTools();
		
		try {
			Resource rr = myResourceTools.getResource(value);
			Hotel hotel = (Hotel)(rr.getContents().get(0));
			
			managerHotel(hotel);
		}catch (Exception e) {
			throw new IllegalArgumentException("Erreur dans le choix !");
		}
		
		
		
	}

	private static void managerHotel(Hotel hotel) {
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


		System.out.println("3 - Quitter et enregistrer");

	}
}
