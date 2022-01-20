import org.eclipse.emf.ecore.resource.Resource;

import hotelManagment.Hotel;
import hotelManagment.HotelManagmentFactory;

public class User {

	public ResourceTools myResourceTools;
	public HotelManagmentFactory myHotelFactory;
	private Hotel myHotel;
	private String modelFilename;
	
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

		this.myHotel = this.myHotelFactory.createHotel();
		
		Console.afficherChoixNomHotel();
		this.myHotel.setNom(Console.recupererUneEntree());
		
		this.sauvegarderHotel();		
		this.managerHotel();
	}

	void chargerHotel() {
		Console.afficherChoixCheminAcces();
		
		try {
			this.modelFilename = Console.recupererUneEntree();
			Resource rr = this.myResourceTools.getResource(this.modelFilename);
			this.myHotel = (Hotel)(rr.getContents().get(0));
			managerHotel();
		}catch (Exception e) {
			throw new IllegalArgumentException("Erreur dans le choix !");
		}		
	}

	void managerHotel() {
		ManageHotel mHotelManager = new ManageHotel(this.myHotel,this.myHotelFactory);
		Console.afficherChoixPrincicpaux(this.myHotel);
		String userInput = Console.recupererUneEntree();
		
		while(mHotelManager.manageUserInput(userInput)) {
			Console.afficherChoixPrincicpaux(this.myHotel);
			userInput = Console.recupererUneEntree();
		}
		
		this.sauvegarderHotel();
	}
	
	void sauvegarderHotel() {
		Console.afficherChoixCreationCheminAcces();
		this.myResourceTools.saveResource(Console.recupererUneEntree(), this.myHotel);
	}
}
