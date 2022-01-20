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
		boolean continueProgram = true;
		
		while(continueProgram) {
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
		        	continueProgram = false;
		            break;
		        }
		        default:
		            throw new IllegalArgumentException("Erreur dans le choix !");
	       }
		}
		
		System.exit(0);
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
		ManageHotel mHotelManager = new ManageHotel(hotel,this.myHotelFactory);
		Console.afficherChoixPrincicpaux(hotel);
		String userInput = Console.recupererUneEntree();
		
		while(mHotelManager.manageUserInput(userInput)) {
			Console.afficherChoixPrincicpaux(hotel);
			userInput = Console.recupererUneEntree();
		}
	}
}
