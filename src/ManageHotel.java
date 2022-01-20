import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

import hotelManagment.Hotel;
import hotelManagment.HotelManagmentFactory;
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
				//TODO Gérer les exceptions
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
