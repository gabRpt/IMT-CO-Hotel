import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import hotelManagment.Hotel;
import hotelManagment.HotelManagmentPackage;

public class ResourceTools {
	//Génération d'un fichier XMI
	// Création d'un ResourceSet
	ResourceSet rs = new ResourceSetImpl();
	
	public ResourceTools() {
		// TODO Auto-generated constructor stub
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
	}
	
	public void saveResource(String filename, Hotel racineModele) {
		// Création de la ressource avec un chemin de fichier où sauvegarder le modèle
		Resource resource = rs.createResource(URI.createFileURI(filename));
		// attention, URI -> org.eclipse.emf.common.util.URI

		// On ajoute notre modèle dans la ressource
		resource.getContents().add(racineModele);
		
		// la méthode save de la Resource accepte une map contenant les options de sérialisation
		try {
		    resource.save(Collections.EMPTY_MAP);
		}
		catch (IOException e) {
		    System.out.println("erreur durant la sauvegarde du modèle : " + e.getMessage());
		}
	}
	
	public Resource getResource(String filename) {
		return rs.getResource(URI.createFileURI(filename),true);
	}
}
