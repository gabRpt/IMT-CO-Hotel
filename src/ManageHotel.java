import java.lang.reflect.Field;
import java.util.Iterator;

import hotelManagment.Hotel;
import hotelManagment.Reservation;

public class ManageHotel {
	private Hotel hotel;
	
	public ManageHotel(Hotel hotel) {
		// TODO Auto-generated constructor stub
		this.hotel = hotel;
	}
	
	public void manageUserInput(String userInput) {
		char userInputSecondChar = userInput.charAt(1);
		switch (userInput.charAt(0)) {
			case '1':
				this.reservation(userInputSecondChar);
				break;
				
			case '2':
				this.chambre(userInputSecondChar);
				break;
				
			case '3':
				this.personnel(userInputSecondChar);
				break;
				
			case '4':
				this.client(userInputSecondChar);
				break;
	
			default:
				break;
		}
	}
	
	
	public void reservation(char userInputSecondChar) {
		Field[] classFields = this.hotel.getClass().getFields();
		String fieldValue = "";
		
		switch (userInputSecondChar) {
			case '1':
				for (int i = 0; i < classFields.length; i++) {
					System.out.println("Entrez la valeur pour le champ suivant: " + classFields[i].toString());
					fieldValue = Console.recupererUneEntree();
					System.out.println(fieldValue);
				}
				break;
				
			case '2':
				
				break;
				
			case '3':
				
				break;
				
			case '4':
				
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
