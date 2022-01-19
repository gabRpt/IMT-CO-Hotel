/**
 */
package hotelManagment;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hotel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hotelManagment.Hotel#getNom <em>Nom</em>}</li>
 *   <li>{@link hotelManagment.Hotel#getAdresse <em>Adresse</em>}</li>
 *   <li>{@link hotelManagment.Hotel#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link hotelManagment.Hotel#getChiffreAffaire <em>Chiffre Affaire</em>}</li>
 *   <li>{@link hotelManagment.Hotel#getReserveration <em>Reserveration</em>}</li>
 *   <li>{@link hotelManagment.Hotel#getChambre <em>Chambre</em>}</li>
 *   <li>{@link hotelManagment.Hotel#getClient <em>Client</em>}</li>
 *   <li>{@link hotelManagment.Hotel#getPersonnel <em>Personnel</em>}</li>
 * </ul>
 *
 * @see hotelManagment.HotelManagmentPackage#getHotel()
 * @model
 * @generated
 */
public interface Hotel extends EObject {
	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see hotelManagment.HotelManagmentPackage#getHotel_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link hotelManagment.Hotel#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Adresse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adresse</em>' attribute.
	 * @see #setAdresse(String)
	 * @see hotelManagment.HotelManagmentPackage#getHotel_Adresse()
	 * @model
	 * @generated
	 */
	String getAdresse();

	/**
	 * Sets the value of the '{@link hotelManagment.Hotel#getAdresse <em>Adresse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adresse</em>' attribute.
	 * @see #getAdresse()
	 * @generated
	 */
	void setAdresse(String value);

	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see #setCategorie(String)
	 * @see hotelManagment.HotelManagmentPackage#getHotel_Categorie()
	 * @model
	 * @generated
	 */
	String getCategorie();

	/**
	 * Sets the value of the '{@link hotelManagment.Hotel#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(String value);

	/**
	 * Returns the value of the '<em><b>Chiffre Affaire</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chiffre Affaire</em>' attribute.
	 * @see #setChiffreAffaire(int)
	 * @see hotelManagment.HotelManagmentPackage#getHotel_ChiffreAffaire()
	 * @model
	 * @generated
	 */
	int getChiffreAffaire();

	/**
	 * Sets the value of the '{@link hotelManagment.Hotel#getChiffreAffaire <em>Chiffre Affaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chiffre Affaire</em>' attribute.
	 * @see #getChiffreAffaire()
	 * @generated
	 */
	void setChiffreAffaire(int value);

	/**
	 * Returns the value of the '<em><b>Reserveration</b></em>' containment reference list.
	 * The list contents are of type {@link hotelManagment.Reservation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reserveration</em>' containment reference list.
	 * @see hotelManagment.HotelManagmentPackage#getHotel_Reserveration()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reservation> getReserveration();

	/**
	 * Returns the value of the '<em><b>Chambre</b></em>' containment reference list.
	 * The list contents are of type {@link hotelManagment.Chambre}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chambre</em>' containment reference list.
	 * @see hotelManagment.HotelManagmentPackage#getHotel_Chambre()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<Chambre> getChambre();

	/**
	 * Returns the value of the '<em><b>Client</b></em>' containment reference list.
	 * The list contents are of type {@link hotelManagment.Client}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client</em>' containment reference list.
	 * @see hotelManagment.HotelManagmentPackage#getHotel_Client()
	 * @model containment="true"
	 * @generated
	 */
	EList<Client> getClient();

	/**
	 * Returns the value of the '<em><b>Personnel</b></em>' containment reference list.
	 * The list contents are of type {@link hotelManagment.Personnel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Personnel</em>' containment reference list.
	 * @see hotelManagment.HotelManagmentPackage#getHotel_Personnel()
	 * @model containment="true"
	 * @generated
	 */
	EList<Personnel> getPersonnel();

} // Hotel
