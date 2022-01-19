/**
 */
package hotelManagment;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see hotelManagment.HotelManagmentFactory
 * @model kind="package"
 * @generated
 */
public interface HotelManagmentPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "hotelManagment";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/hotelManagment";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "hotelManagment";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HotelManagmentPackage eINSTANCE = hotelManagment.impl.HotelManagmentPackageImpl.init();

	/**
	 * The meta object id for the '{@link hotelManagment.impl.PersonnelImpl <em>Personnel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hotelManagment.impl.PersonnelImpl
	 * @see hotelManagment.impl.HotelManagmentPackageImpl#getPersonnel()
	 * @generated
	 */
	int PERSONNEL = 0;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONNEL__NOM = 0;

	/**
	 * The feature id for the '<em><b>Prenom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONNEL__PRENOM = 1;

	/**
	 * The feature id for the '<em><b>Chambre</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONNEL__CHAMBRE = 2;

	/**
	 * The number of structural features of the '<em>Personnel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONNEL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Personnel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONNEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hotelManagment.impl.ChambreImpl <em>Chambre</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hotelManagment.impl.ChambreImpl
	 * @see hotelManagment.impl.HotelManagmentPackageImpl#getChambre()
	 * @generated
	 */
	int CHAMBRE = 1;

	/**
	 * The feature id for the '<em><b>Numero</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAMBRE__NUMERO = 0;

	/**
	 * The feature id for the '<em><b>Nb Lits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAMBRE__NB_LITS = 1;

	/**
	 * The feature id for the '<em><b>Prix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAMBRE__PRIX = 2;

	/**
	 * The feature id for the '<em><b>Personnel</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAMBRE__PERSONNEL = 3;

	/**
	 * The number of structural features of the '<em>Chambre</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAMBRE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Chambre</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAMBRE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hotelManagment.impl.HotelImpl <em>Hotel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hotelManagment.impl.HotelImpl
	 * @see hotelManagment.impl.HotelManagmentPackageImpl#getHotel()
	 * @generated
	 */
	int HOTEL = 2;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL__NOM = 0;

	/**
	 * The feature id for the '<em><b>Adresse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL__ADRESSE = 1;

	/**
	 * The feature id for the '<em><b>Categorie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL__CATEGORIE = 2;

	/**
	 * The feature id for the '<em><b>Chiffre Affaire</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL__CHIFFRE_AFFAIRE = 3;

	/**
	 * The feature id for the '<em><b>Reserveration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL__RESERVERATION = 4;

	/**
	 * The feature id for the '<em><b>Chambre</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL__CHAMBRE = 5;

	/**
	 * The feature id for the '<em><b>Client</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL__CLIENT = 6;

	/**
	 * The feature id for the '<em><b>Personnel</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL__PERSONNEL = 7;

	/**
	 * The number of structural features of the '<em>Hotel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Hotel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hotelManagment.impl.ClientImpl <em>Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hotelManagment.impl.ClientImpl
	 * @see hotelManagment.impl.HotelManagmentPackageImpl#getClient()
	 * @generated
	 */
	int CLIENT = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__ID = 0;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__NOM = 1;

	/**
	 * The feature id for the '<em><b>Prenom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__PRENOM = 2;

	/**
	 * The number of structural features of the '<em>Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hotelManagment.impl.ReservationImpl <em>Reservation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hotelManagment.impl.ReservationImpl
	 * @see hotelManagment.impl.HotelManagmentPackageImpl#getReservation()
	 * @generated
	 */
	int RESERVATION = 4;

	/**
	 * The feature id for the '<em><b>Id Client</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION__ID_CLIENT = 0;

	/**
	 * The feature id for the '<em><b>Num Chambre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION__NUM_CHAMBRE = 1;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION__DATE = 2;

	/**
	 * The number of structural features of the '<em>Reservation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Reservation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hotelManagment.impl.PresidentielleImpl <em>Presidentielle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hotelManagment.impl.PresidentielleImpl
	 * @see hotelManagment.impl.HotelManagmentPackageImpl#getPresidentielle()
	 * @generated
	 */
	int PRESIDENTIELLE = 5;

	/**
	 * The feature id for the '<em><b>Numero</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESIDENTIELLE__NUMERO = CHAMBRE__NUMERO;

	/**
	 * The feature id for the '<em><b>Nb Lits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESIDENTIELLE__NB_LITS = CHAMBRE__NB_LITS;

	/**
	 * The feature id for the '<em><b>Prix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESIDENTIELLE__PRIX = CHAMBRE__PRIX;

	/**
	 * The feature id for the '<em><b>Personnel</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESIDENTIELLE__PERSONNEL = CHAMBRE__PERSONNEL;

	/**
	 * The feature id for the '<em><b>Nb TV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESIDENTIELLE__NB_TV = CHAMBRE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nb Sd B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESIDENTIELLE__NB_SD_B = CHAMBRE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Balcon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESIDENTIELLE__BALCON = CHAMBRE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Presidentielle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESIDENTIELLE_FEATURE_COUNT = CHAMBRE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Presidentielle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESIDENTIELLE_OPERATION_COUNT = CHAMBRE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hotelManagment.impl.ClassiqueImpl <em>Classique</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hotelManagment.impl.ClassiqueImpl
	 * @see hotelManagment.impl.HotelManagmentPackageImpl#getClassique()
	 * @generated
	 */
	int CLASSIQUE = 6;

	/**
	 * The feature id for the '<em><b>Numero</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIQUE__NUMERO = CHAMBRE__NUMERO;

	/**
	 * The feature id for the '<em><b>Nb Lits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIQUE__NB_LITS = CHAMBRE__NB_LITS;

	/**
	 * The feature id for the '<em><b>Prix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIQUE__PRIX = CHAMBRE__PRIX;

	/**
	 * The feature id for the '<em><b>Personnel</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIQUE__PERSONNEL = CHAMBRE__PERSONNEL;

	/**
	 * The number of structural features of the '<em>Classique</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIQUE_FEATURE_COUNT = CHAMBRE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Classique</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIQUE_OPERATION_COUNT = CHAMBRE_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link hotelManagment.Personnel <em>Personnel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Personnel</em>'.
	 * @see hotelManagment.Personnel
	 * @generated
	 */
	EClass getPersonnel();

	/**
	 * Returns the meta object for the attribute '{@link hotelManagment.Personnel#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see hotelManagment.Personnel#getNom()
	 * @see #getPersonnel()
	 * @generated
	 */
	EAttribute getPersonnel_Nom();

	/**
	 * Returns the meta object for the attribute '{@link hotelManagment.Personnel#getPrenom <em>Prenom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prenom</em>'.
	 * @see hotelManagment.Personnel#getPrenom()
	 * @see #getPersonnel()
	 * @generated
	 */
	EAttribute getPersonnel_Prenom();

	/**
	 * Returns the meta object for the reference list '{@link hotelManagment.Personnel#getChambre <em>Chambre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Chambre</em>'.
	 * @see hotelManagment.Personnel#getChambre()
	 * @see #getPersonnel()
	 * @generated
	 */
	EReference getPersonnel_Chambre();

	/**
	 * Returns the meta object for class '{@link hotelManagment.Chambre <em>Chambre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chambre</em>'.
	 * @see hotelManagment.Chambre
	 * @generated
	 */
	EClass getChambre();

	/**
	 * Returns the meta object for the attribute '{@link hotelManagment.Chambre#getNumero <em>Numero</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numero</em>'.
	 * @see hotelManagment.Chambre#getNumero()
	 * @see #getChambre()
	 * @generated
	 */
	EAttribute getChambre_Numero();

	/**
	 * Returns the meta object for the attribute '{@link hotelManagment.Chambre#getNbLits <em>Nb Lits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Lits</em>'.
	 * @see hotelManagment.Chambre#getNbLits()
	 * @see #getChambre()
	 * @generated
	 */
	EAttribute getChambre_NbLits();

	/**
	 * Returns the meta object for the attribute '{@link hotelManagment.Chambre#getPrix <em>Prix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prix</em>'.
	 * @see hotelManagment.Chambre#getPrix()
	 * @see #getChambre()
	 * @generated
	 */
	EAttribute getChambre_Prix();

	/**
	 * Returns the meta object for the reference list '{@link hotelManagment.Chambre#getPersonnel <em>Personnel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Personnel</em>'.
	 * @see hotelManagment.Chambre#getPersonnel()
	 * @see #getChambre()
	 * @generated
	 */
	EReference getChambre_Personnel();

	/**
	 * Returns the meta object for class '{@link hotelManagment.Hotel <em>Hotel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hotel</em>'.
	 * @see hotelManagment.Hotel
	 * @generated
	 */
	EClass getHotel();

	/**
	 * Returns the meta object for the attribute '{@link hotelManagment.Hotel#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see hotelManagment.Hotel#getNom()
	 * @see #getHotel()
	 * @generated
	 */
	EAttribute getHotel_Nom();

	/**
	 * Returns the meta object for the attribute '{@link hotelManagment.Hotel#getAdresse <em>Adresse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adresse</em>'.
	 * @see hotelManagment.Hotel#getAdresse()
	 * @see #getHotel()
	 * @generated
	 */
	EAttribute getHotel_Adresse();

	/**
	 * Returns the meta object for the attribute '{@link hotelManagment.Hotel#getCategorie <em>Categorie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Categorie</em>'.
	 * @see hotelManagment.Hotel#getCategorie()
	 * @see #getHotel()
	 * @generated
	 */
	EAttribute getHotel_Categorie();

	/**
	 * Returns the meta object for the attribute '{@link hotelManagment.Hotel#getChiffreAffaire <em>Chiffre Affaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Chiffre Affaire</em>'.
	 * @see hotelManagment.Hotel#getChiffreAffaire()
	 * @see #getHotel()
	 * @generated
	 */
	EAttribute getHotel_ChiffreAffaire();

	/**
	 * Returns the meta object for the containment reference list '{@link hotelManagment.Hotel#getReserveration <em>Reserveration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reserveration</em>'.
	 * @see hotelManagment.Hotel#getReserveration()
	 * @see #getHotel()
	 * @generated
	 */
	EReference getHotel_Reserveration();

	/**
	 * Returns the meta object for the containment reference list '{@link hotelManagment.Hotel#getChambre <em>Chambre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Chambre</em>'.
	 * @see hotelManagment.Hotel#getChambre()
	 * @see #getHotel()
	 * @generated
	 */
	EReference getHotel_Chambre();

	/**
	 * Returns the meta object for the containment reference list '{@link hotelManagment.Hotel#getClient <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Client</em>'.
	 * @see hotelManagment.Hotel#getClient()
	 * @see #getHotel()
	 * @generated
	 */
	EReference getHotel_Client();

	/**
	 * Returns the meta object for the containment reference list '{@link hotelManagment.Hotel#getPersonnel <em>Personnel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Personnel</em>'.
	 * @see hotelManagment.Hotel#getPersonnel()
	 * @see #getHotel()
	 * @generated
	 */
	EReference getHotel_Personnel();

	/**
	 * Returns the meta object for class '{@link hotelManagment.Client <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Client</em>'.
	 * @see hotelManagment.Client
	 * @generated
	 */
	EClass getClient();

	/**
	 * Returns the meta object for the attribute '{@link hotelManagment.Client#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see hotelManagment.Client#getId()
	 * @see #getClient()
	 * @generated
	 */
	EAttribute getClient_Id();

	/**
	 * Returns the meta object for the attribute '{@link hotelManagment.Client#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see hotelManagment.Client#getNom()
	 * @see #getClient()
	 * @generated
	 */
	EAttribute getClient_Nom();

	/**
	 * Returns the meta object for the attribute '{@link hotelManagment.Client#getPrenom <em>Prenom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prenom</em>'.
	 * @see hotelManagment.Client#getPrenom()
	 * @see #getClient()
	 * @generated
	 */
	EAttribute getClient_Prenom();

	/**
	 * Returns the meta object for class '{@link hotelManagment.Reservation <em>Reservation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reservation</em>'.
	 * @see hotelManagment.Reservation
	 * @generated
	 */
	EClass getReservation();

	/**
	 * Returns the meta object for the attribute '{@link hotelManagment.Reservation#getIdClient <em>Id Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Client</em>'.
	 * @see hotelManagment.Reservation#getIdClient()
	 * @see #getReservation()
	 * @generated
	 */
	EAttribute getReservation_IdClient();

	/**
	 * Returns the meta object for the attribute '{@link hotelManagment.Reservation#getNumChambre <em>Num Chambre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Chambre</em>'.
	 * @see hotelManagment.Reservation#getNumChambre()
	 * @see #getReservation()
	 * @generated
	 */
	EAttribute getReservation_NumChambre();

	/**
	 * Returns the meta object for the attribute '{@link hotelManagment.Reservation#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see hotelManagment.Reservation#getDate()
	 * @see #getReservation()
	 * @generated
	 */
	EAttribute getReservation_Date();

	/**
	 * Returns the meta object for class '{@link hotelManagment.Presidentielle <em>Presidentielle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Presidentielle</em>'.
	 * @see hotelManagment.Presidentielle
	 * @generated
	 */
	EClass getPresidentielle();

	/**
	 * Returns the meta object for the attribute '{@link hotelManagment.Presidentielle#getNbTV <em>Nb TV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb TV</em>'.
	 * @see hotelManagment.Presidentielle#getNbTV()
	 * @see #getPresidentielle()
	 * @generated
	 */
	EAttribute getPresidentielle_NbTV();

	/**
	 * Returns the meta object for the attribute '{@link hotelManagment.Presidentielle#getNbSdB <em>Nb Sd B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Sd B</em>'.
	 * @see hotelManagment.Presidentielle#getNbSdB()
	 * @see #getPresidentielle()
	 * @generated
	 */
	EAttribute getPresidentielle_NbSdB();

	/**
	 * Returns the meta object for the attribute '{@link hotelManagment.Presidentielle#isBalcon <em>Balcon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Balcon</em>'.
	 * @see hotelManagment.Presidentielle#isBalcon()
	 * @see #getPresidentielle()
	 * @generated
	 */
	EAttribute getPresidentielle_Balcon();

	/**
	 * Returns the meta object for class '{@link hotelManagment.Classique <em>Classique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classique</em>'.
	 * @see hotelManagment.Classique
	 * @generated
	 */
	EClass getClassique();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HotelManagmentFactory getHotelManagmentFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link hotelManagment.impl.PersonnelImpl <em>Personnel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hotelManagment.impl.PersonnelImpl
		 * @see hotelManagment.impl.HotelManagmentPackageImpl#getPersonnel()
		 * @generated
		 */
		EClass PERSONNEL = eINSTANCE.getPersonnel();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONNEL__NOM = eINSTANCE.getPersonnel_Nom();

		/**
		 * The meta object literal for the '<em><b>Prenom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONNEL__PRENOM = eINSTANCE.getPersonnel_Prenom();

		/**
		 * The meta object literal for the '<em><b>Chambre</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSONNEL__CHAMBRE = eINSTANCE.getPersonnel_Chambre();

		/**
		 * The meta object literal for the '{@link hotelManagment.impl.ChambreImpl <em>Chambre</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hotelManagment.impl.ChambreImpl
		 * @see hotelManagment.impl.HotelManagmentPackageImpl#getChambre()
		 * @generated
		 */
		EClass CHAMBRE = eINSTANCE.getChambre();

		/**
		 * The meta object literal for the '<em><b>Numero</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHAMBRE__NUMERO = eINSTANCE.getChambre_Numero();

		/**
		 * The meta object literal for the '<em><b>Nb Lits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHAMBRE__NB_LITS = eINSTANCE.getChambre_NbLits();

		/**
		 * The meta object literal for the '<em><b>Prix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHAMBRE__PRIX = eINSTANCE.getChambre_Prix();

		/**
		 * The meta object literal for the '<em><b>Personnel</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHAMBRE__PERSONNEL = eINSTANCE.getChambre_Personnel();

		/**
		 * The meta object literal for the '{@link hotelManagment.impl.HotelImpl <em>Hotel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hotelManagment.impl.HotelImpl
		 * @see hotelManagment.impl.HotelManagmentPackageImpl#getHotel()
		 * @generated
		 */
		EClass HOTEL = eINSTANCE.getHotel();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOTEL__NOM = eINSTANCE.getHotel_Nom();

		/**
		 * The meta object literal for the '<em><b>Adresse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOTEL__ADRESSE = eINSTANCE.getHotel_Adresse();

		/**
		 * The meta object literal for the '<em><b>Categorie</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOTEL__CATEGORIE = eINSTANCE.getHotel_Categorie();

		/**
		 * The meta object literal for the '<em><b>Chiffre Affaire</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOTEL__CHIFFRE_AFFAIRE = eINSTANCE.getHotel_ChiffreAffaire();

		/**
		 * The meta object literal for the '<em><b>Reserveration</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOTEL__RESERVERATION = eINSTANCE.getHotel_Reserveration();

		/**
		 * The meta object literal for the '<em><b>Chambre</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOTEL__CHAMBRE = eINSTANCE.getHotel_Chambre();

		/**
		 * The meta object literal for the '<em><b>Client</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOTEL__CLIENT = eINSTANCE.getHotel_Client();

		/**
		 * The meta object literal for the '<em><b>Personnel</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOTEL__PERSONNEL = eINSTANCE.getHotel_Personnel();

		/**
		 * The meta object literal for the '{@link hotelManagment.impl.ClientImpl <em>Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hotelManagment.impl.ClientImpl
		 * @see hotelManagment.impl.HotelManagmentPackageImpl#getClient()
		 * @generated
		 */
		EClass CLIENT = eINSTANCE.getClient();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENT__ID = eINSTANCE.getClient_Id();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENT__NOM = eINSTANCE.getClient_Nom();

		/**
		 * The meta object literal for the '<em><b>Prenom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENT__PRENOM = eINSTANCE.getClient_Prenom();

		/**
		 * The meta object literal for the '{@link hotelManagment.impl.ReservationImpl <em>Reservation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hotelManagment.impl.ReservationImpl
		 * @see hotelManagment.impl.HotelManagmentPackageImpl#getReservation()
		 * @generated
		 */
		EClass RESERVATION = eINSTANCE.getReservation();

		/**
		 * The meta object literal for the '<em><b>Id Client</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVATION__ID_CLIENT = eINSTANCE.getReservation_IdClient();

		/**
		 * The meta object literal for the '<em><b>Num Chambre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVATION__NUM_CHAMBRE = eINSTANCE.getReservation_NumChambre();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVATION__DATE = eINSTANCE.getReservation_Date();

		/**
		 * The meta object literal for the '{@link hotelManagment.impl.PresidentielleImpl <em>Presidentielle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hotelManagment.impl.PresidentielleImpl
		 * @see hotelManagment.impl.HotelManagmentPackageImpl#getPresidentielle()
		 * @generated
		 */
		EClass PRESIDENTIELLE = eINSTANCE.getPresidentielle();

		/**
		 * The meta object literal for the '<em><b>Nb TV</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESIDENTIELLE__NB_TV = eINSTANCE.getPresidentielle_NbTV();

		/**
		 * The meta object literal for the '<em><b>Nb Sd B</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESIDENTIELLE__NB_SD_B = eINSTANCE.getPresidentielle_NbSdB();

		/**
		 * The meta object literal for the '<em><b>Balcon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESIDENTIELLE__BALCON = eINSTANCE.getPresidentielle_Balcon();

		/**
		 * The meta object literal for the '{@link hotelManagment.impl.ClassiqueImpl <em>Classique</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hotelManagment.impl.ClassiqueImpl
		 * @see hotelManagment.impl.HotelManagmentPackageImpl#getClassique()
		 * @generated
		 */
		EClass CLASSIQUE = eINSTANCE.getClassique();

	}

} //HotelManagmentPackage
