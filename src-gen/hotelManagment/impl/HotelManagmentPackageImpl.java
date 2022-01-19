/**
 */
package hotelManagment.impl;

import hotelManagment.Chambre;
import hotelManagment.Classique;
import hotelManagment.Client;
import hotelManagment.Hotel;
import hotelManagment.HotelManagmentFactory;
import hotelManagment.HotelManagmentPackage;
import hotelManagment.Personnel;
import hotelManagment.Presidentielle;
import hotelManagment.Reservation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HotelManagmentPackageImpl extends EPackageImpl implements HotelManagmentPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personnelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chambreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hotelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass presidentielleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classiqueEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see hotelManagment.HotelManagmentPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private HotelManagmentPackageImpl() {
		super(eNS_URI, HotelManagmentFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link HotelManagmentPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static HotelManagmentPackage init() {
		if (isInited)
			return (HotelManagmentPackage) EPackage.Registry.INSTANCE.getEPackage(HotelManagmentPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredHotelManagmentPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		HotelManagmentPackageImpl theHotelManagmentPackage = registeredHotelManagmentPackage instanceof HotelManagmentPackageImpl
				? (HotelManagmentPackageImpl) registeredHotelManagmentPackage
				: new HotelManagmentPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theHotelManagmentPackage.createPackageContents();

		// Initialize created meta-data
		theHotelManagmentPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theHotelManagmentPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(HotelManagmentPackage.eNS_URI, theHotelManagmentPackage);
		return theHotelManagmentPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersonnel() {
		return personnelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonnel_Nom() {
		return (EAttribute) personnelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonnel_Prenom() {
		return (EAttribute) personnelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonnel_Chambre() {
		return (EReference) personnelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChambre() {
		return chambreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChambre_Numero() {
		return (EAttribute) chambreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChambre_NbLits() {
		return (EAttribute) chambreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChambre_Prix() {
		return (EAttribute) chambreEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChambre_Personnel() {
		return (EReference) chambreEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHotel() {
		return hotelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHotel_Nom() {
		return (EAttribute) hotelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHotel_Adresse() {
		return (EAttribute) hotelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHotel_Categorie() {
		return (EAttribute) hotelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHotel_ChiffreAffaire() {
		return (EAttribute) hotelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHotel_Reserveration() {
		return (EReference) hotelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHotel_Chambre() {
		return (EReference) hotelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHotel_Client() {
		return (EReference) hotelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHotel_Personnel() {
		return (EReference) hotelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClient() {
		return clientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClient_Id() {
		return (EAttribute) clientEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClient_Nom() {
		return (EAttribute) clientEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClient_Prenom() {
		return (EAttribute) clientEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReservation() {
		return reservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReservation_IdClient() {
		return (EAttribute) reservationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReservation_NumChambre() {
		return (EAttribute) reservationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReservation_Date() {
		return (EAttribute) reservationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPresidentielle() {
		return presidentielleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresidentielle_NbTV() {
		return (EAttribute) presidentielleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresidentielle_NbSdB() {
		return (EAttribute) presidentielleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresidentielle_Balcon() {
		return (EAttribute) presidentielleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassique() {
		return classiqueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HotelManagmentFactory getHotelManagmentFactory() {
		return (HotelManagmentFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		personnelEClass = createEClass(PERSONNEL);
		createEAttribute(personnelEClass, PERSONNEL__NOM);
		createEAttribute(personnelEClass, PERSONNEL__PRENOM);
		createEReference(personnelEClass, PERSONNEL__CHAMBRE);

		chambreEClass = createEClass(CHAMBRE);
		createEAttribute(chambreEClass, CHAMBRE__NUMERO);
		createEAttribute(chambreEClass, CHAMBRE__NB_LITS);
		createEAttribute(chambreEClass, CHAMBRE__PRIX);
		createEReference(chambreEClass, CHAMBRE__PERSONNEL);

		hotelEClass = createEClass(HOTEL);
		createEAttribute(hotelEClass, HOTEL__NOM);
		createEAttribute(hotelEClass, HOTEL__ADRESSE);
		createEAttribute(hotelEClass, HOTEL__CATEGORIE);
		createEAttribute(hotelEClass, HOTEL__CHIFFRE_AFFAIRE);
		createEReference(hotelEClass, HOTEL__RESERVERATION);
		createEReference(hotelEClass, HOTEL__CHAMBRE);
		createEReference(hotelEClass, HOTEL__CLIENT);
		createEReference(hotelEClass, HOTEL__PERSONNEL);

		clientEClass = createEClass(CLIENT);
		createEAttribute(clientEClass, CLIENT__ID);
		createEAttribute(clientEClass, CLIENT__NOM);
		createEAttribute(clientEClass, CLIENT__PRENOM);

		reservationEClass = createEClass(RESERVATION);
		createEAttribute(reservationEClass, RESERVATION__ID_CLIENT);
		createEAttribute(reservationEClass, RESERVATION__NUM_CHAMBRE);
		createEAttribute(reservationEClass, RESERVATION__DATE);

		presidentielleEClass = createEClass(PRESIDENTIELLE);
		createEAttribute(presidentielleEClass, PRESIDENTIELLE__NB_TV);
		createEAttribute(presidentielleEClass, PRESIDENTIELLE__NB_SD_B);
		createEAttribute(presidentielleEClass, PRESIDENTIELLE__BALCON);

		classiqueEClass = createEClass(CLASSIQUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		presidentielleEClass.getESuperTypes().add(this.getChambre());
		classiqueEClass.getESuperTypes().add(this.getChambre());

		// Initialize classes, features, and operations; add parameters
		initEClass(personnelEClass, Personnel.class, "Personnel", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPersonnel_Nom(), ecorePackage.getEString(), "nom", null, 0, 1, Personnel.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersonnel_Prenom(), ecorePackage.getEString(), "prenom", null, 0, 1, Personnel.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersonnel_Chambre(), this.getChambre(), this.getChambre_Personnel(), "chambre", null, 0, -1,
				Personnel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(chambreEClass, Chambre.class, "Chambre", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChambre_Numero(), ecorePackage.getEInt(), "numero", null, 0, 1, Chambre.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChambre_NbLits(), ecorePackage.getEInt(), "nbLits", null, 0, 1, Chambre.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChambre_Prix(), ecorePackage.getEFloat(), "prix", null, 0, 1, Chambre.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChambre_Personnel(), this.getPersonnel(), this.getPersonnel_Chambre(), "personnel", null, 0,
				-1, Chambre.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hotelEClass, Hotel.class, "Hotel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHotel_Nom(), ecorePackage.getEString(), "nom", null, 0, 1, Hotel.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHotel_Adresse(), ecorePackage.getEString(), "adresse", null, 0, 1, Hotel.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHotel_Categorie(), ecorePackage.getEString(), "categorie", null, 0, 1, Hotel.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHotel_ChiffreAffaire(), ecorePackage.getEInt(), "chiffreAffaire", null, 0, 1, Hotel.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHotel_Reserveration(), this.getReservation(), null, "reserveration", null, 0, -1, Hotel.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHotel_Chambre(), this.getChambre(), null, "chambre", null, 2, -1, Hotel.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getHotel_Client(), this.getClient(), null, "client", null, 0, -1, Hotel.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getHotel_Personnel(), this.getPersonnel(), null, "personnel", null, 0, -1, Hotel.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(clientEClass, Client.class, "Client", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClient_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Client.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClient_Nom(), ecorePackage.getEString(), "nom", null, 0, 1, Client.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClient_Prenom(), ecorePackage.getEString(), "prenom", null, 0, 1, Client.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reservationEClass, Reservation.class, "Reservation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReservation_IdClient(), ecorePackage.getEInt(), "idClient", null, 0, 1, Reservation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReservation_NumChambre(), ecorePackage.getEInt(), "numChambre", null, 0, 1, Reservation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReservation_Date(), ecorePackage.getEDate(), "date", null, 0, 1, Reservation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(presidentielleEClass, Presidentielle.class, "Presidentielle", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPresidentielle_NbTV(), ecorePackage.getEInt(), "nbTV", null, 0, 1, Presidentielle.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresidentielle_NbSdB(), ecorePackage.getEInt(), "nbSdB", null, 0, 1, Presidentielle.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresidentielle_Balcon(), ecorePackage.getEBoolean(), "balcon", null, 0, 1,
				Presidentielle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(classiqueEClass, Classique.class, "Classique", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //HotelManagmentPackageImpl
