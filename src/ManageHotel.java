import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

<<<<<<< HEAD
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

import hotelManagment.Chambre;
import hotelManagment.Classique;
=======
>>>>>>> 63b3f67b483261e0ab03010b077cec00d0175007
import hotelManagment.Hotel;
import hotelManagment.HotelManagmentFactory;
import hotelManagment.Presidentielle;
import hotelManagment.Reservation;
import hotelManagment.impl.ReservationImpl;

public class ManageHotel {
	private Hotel hotel;
	private HotelManagmentFactory hotelFactory;
	
	public ManageHotel(Hotel hotel, HotelManagmentFactory hotelFactory) {
		// TODO Auto-generated constructor stub
		this.hotel = hotel;
		this.hotelFactory = hotelFactory;
	}
	
	//Pour chaque attribut, demande la valeur à l'utilisateur
	//Retourne un map "nomAttribut":"valeur entrée par l'user"
	private Map<String, String> getFieldsValues(Field[] classFields) {
		Map<String, String> myMap = new HashMap<String, String>();
		String fieldValue = "";
		String currentAttributeName = "";
				
		for (int i = 1; i < classFields.length; i+=2) {
			currentAttributeName = classFields[i].getName();
			System.out.println("Entrez la valeur pour le champ suivant: " + currentAttributeName);
			fieldValue = Console.recupererUneEntree();
			myMap.put(currentAttributeName, fieldValue);
		}
		
		return myMap;
	}
	
	public boolean manageUserInput(String userInput) {
		boolean continueHotelManagement = true;

		switch (userInput.charAt(0)) {
			case '1':
				this.reservation(userInput.charAt(1));
				break;
				
			case '2':
				this.chambre(userInput.charAt(1));
				break;
				
			case '3':
				this.personnel(userInput.charAt(1));
				break;
				
			case '4':
				this.client(userInput.charAt(1));
				break;
	
			case '5':
				continueHotelManagement = false;
				break;
			default:
				continueHotelManagement = false;
				break;
		}
		return continueHotelManagement;
	}
	
	
	public void reservation(char userInputSecondChar) {
		Field[] classFields = ReservationImpl.class.getDeclaredFields();
		Map<String, String> myMap;
		
		switch (userInputSecondChar) {
			case '1':
				myMap = this.getFieldsValues(classFields);
				
				Reservation newReservation = this.hotelFactory.createReservation();
				newReservation.setIdClient(Integer.parseInt(myMap.get("idClient")));
				newReservation.setNumChambre(Integer.parseInt(myMap.get("numChambre")));
				newReservation.setDate(null); //TODO Date
				this.hotel.getReserveration().add(newReservation);
				
				break;
				
			case '2':{
				System.out.println("Entrez l'identifiant client");
				int idClient = Integer.parseInt(Console.recupererUneEntree());
				
				System.out.println("Entrez le numéro de chambre");
				int numChambre = Integer.parseInt(Console.recupererUneEntree());
				
				boolean edited = false;
				
				for (Reservation reservation : this.hotel.getReserveration()) {
					if (reservation.getIdClient() == idClient && reservation.getNumChambre() == numChambre) {
						myMap = this.getFieldsValues(classFields);						
						reservation.setIdClient(Integer.parseInt(myMap.get("idClient")));
						reservation.setNumChambre(Integer.parseInt(myMap.get("numChambre")));
						reservation.setDate(null); //TODO Date
						
						edited = true;
						break;
					}
				}
				
				if (edited) {					
					System.out.println("Edité avec succès");
				} else {
					System.out.println("Problème lors de l'édition");
				}
				
				break;
			}
				
			case '3':{
				System.out.println("Entrez l'identifiant client");
				int idClient = Integer.parseInt(Console.recupererUneEntree());
				
				System.out.println("Entrez le numéro de chambre");
				int numChambre = Integer.parseInt(Console.recupererUneEntree());
				
				boolean deleted = false;
								
				for (Reservation reservation : this.hotel.getReserveration()) {
					if (reservation.getIdClient() == idClient && reservation.getNumChambre() == numChambre) {
						this.hotel.getReserveration().remove(reservation);
						deleted = true;
						break;
					}
				}
				
				if (deleted) {					
					System.out.println("Edité avec succès");
				} else {
					System.out.println("Problème lors de l'édition");
				}
				break;
			}
				
			case '4':
				System.out.println("Entrez l'identifiant client");
				int idClient = Integer.parseInt(Console.recupererUneEntree());
				
				System.out.println("Entrez le numéro de chambre");
				int numChambre = Integer.parseInt(Console.recupererUneEntree());
				
				for (Reservation reservation : this.hotel.getReserveration()) {
					if (reservation.getIdClient() == idClient && reservation.getNumChambre() == numChambre) {
						System.out.println(
							"idClient: "+reservation.getIdClient()+
							"\nnumChambre: "+reservation.getNumChambre()+
							"\ndate: "+reservation.getDate()
						);
						break;
					}
				}
				break;
				
			case '5':				
				this.hotel.getReserveration().stream().forEach(System.out::println);
				break;
	
			default:
				break;
		}
	}
	
	public void chambre(char userInputSecondChar) {
		switch (userInputSecondChar) {
			case '1':
				creationChambre();
				
				break;
				
			case '2':
				
				break;
				
			case '3':
				
				break;
				
			case '4':
				
				break;
				
			case '5':
				this.hotel.getChambre().stream().forEach(System.out::println);
				break;
	
			default:
				break;
		}
	}
	
	public void creationChambre() {

		System.out.println("Quel est le numéro de la chambre ?");
		int numero = Integer.parseInt(Console.recupererUneEntree());
		
		System.out.println("Quel est le nombre de lits ?");
		int nbrLits = Integer.parseInt(Console.recupererUneEntree());
		
		System.out.println("Quel est le prix ?");
		Float prix = Float.parseFloat(Console.recupererUneEntree());
		
		Console.afficherChoixClassiqueOuPresidentielle();
		String entree = Console.recupererUneEntree();
		if(entree.equals("1")) {
			
			Classique chambre = hotelFactory.createClassique();
			chambre.setNumero(numero);
			chambre.setNbLits(nbrLits);
			chambre.setPrix(prix);
			this.hotel.getChambre().add(chambre);
			
		}else if (entree.equals("2")) {
			
			Presidentielle chambre = hotelFactory.createPresidentielle();
			chambre.setNumero(numero);
			chambre.setNbLits(nbrLits);
			chambre.setPrix(prix);
			
			System.out.println("Quel est le nombre de television ?");
			int nbTv = Integer.parseInt(Console.recupererUneEntree());
			
			System.out.println("Quel est le nombre de salle de bain ?");
			int nbSdb = Integer.parseInt(Console.recupererUneEntree());
			
			System.out.println("Ya-t'il un balcon ?");
			boolean balcon = Boolean.parseBoolean(Console.recupererUneEntree());
			
			chambre.setNbTV(nbTv);
			chambre.setNbSdB(nbSdb);
			chambre.setBalcon(balcon);
			this.hotel.getChambre().add(chambre);
			
		}else {
			throw new IllegalArgumentException("Erreur dans le choix !");
		}
		
		
		
		System.out.println("Creation de chambre effectué !");
		
		
	}

	public void personnel(char userInputSecondChar) {
		switch (userInputSecondChar) {
			case '1':
				
				break;
				
			case '2':
				
				break;
				
			case '3':
				
				break;
				
			case '4':
				
				break;
				
			case '5':
				this.hotel.getPersonnel().stream().forEach(System.out::println);
				break;
	
			default:
				break;
		}
	}
	
	public void client(char userInputSecondChar) {
		switch (userInputSecondChar) {
			case '1':
				
				break;
				
			case '2':
				
				break;
				
			case '3':
				
				break;
				
			case '4':
				
				break;
				
			case '5':
				this.hotel.getClient().stream().forEach(System.out::println);
				break;
	
			default:
				break;
		}
	}
}
