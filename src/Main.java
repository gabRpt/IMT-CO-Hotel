import java.io.IOException;
import java.util.Collections;

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
		
		
		//Génération d'un fichier XMI
		// Création d'un ResourceSet
		ResourceSet rs = new ResourceSetImpl();

		// Mapping entre l'extension du fichier du modèle et le format de sérialisation (xmi)
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
		    "xmi",
		    new XMIResourceFactoryImpl()
		);
		// Enregistrement de notre métamodèle dans la liste des métamodèles connus
		rs.getPackageRegistry().put(
				HotelManagmentPackage.eNS_URI,
				HotelManagmentPackage.eINSTANCE
		);
		
		// Création de la ressource avec un chemin de fichier où sauvegarder le modèle
		Resource resource = rs.createResource(URI.createFileURI("modele.xmi"));
		// attention, URI -> org.eclipse.emf.common.util.URI

		Hotel racineModele = myHotel; // notre modèle que l'on a créé avec la factory 

		// On ajoute notre modèle dans la ressource
		resource.getContents().add(racineModele);
		
		// la méthode save de la Resource accepte une map contenant les options de sérialisation
		try {
		    resource.save(Collections.EMPTY_MAP);
		}
		catch (IOException e) {
		    System.out.println("erreur durant la sauvegarde du modèle : " + e.getMessage());
		}
		
		Resource resource2 = rs.getResource(URI.createFileURI("modele.xmi"),true);
		Hotel racineModel2 = (Hotel)(resource2.getContents().get(0));		
	}
}
