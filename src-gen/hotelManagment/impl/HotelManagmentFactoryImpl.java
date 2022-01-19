/**
 */
package hotelManagment.impl;

import hotelManagment.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HotelManagmentFactoryImpl extends EFactoryImpl implements HotelManagmentFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HotelManagmentFactory init() {
		try {
			HotelManagmentFactory theHotelManagmentFactory = (HotelManagmentFactory) EPackage.Registry.INSTANCE
					.getEFactory(HotelManagmentPackage.eNS_URI);
			if (theHotelManagmentFactory != null) {
				return theHotelManagmentFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HotelManagmentFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HotelManagmentFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case HotelManagmentPackage.PERSONNEL:
			return createPersonnel();
		case HotelManagmentPackage.CHAMBRE:
			return createChambre();
		case HotelManagmentPackage.HOTEL:
			return createHotel();
		case HotelManagmentPackage.CLIENT:
			return createClient();
		case HotelManagmentPackage.RESERVATION:
			return createReservation();
		case HotelManagmentPackage.PRESIDENTIELLE:
			return createPresidentielle();
		case HotelManagmentPackage.CLASSIQUE:
			return createClassique();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Personnel createPersonnel() {
		PersonnelImpl personnel = new PersonnelImpl();
		return personnel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Chambre createChambre() {
		ChambreImpl chambre = new ChambreImpl();
		return chambre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hotel createHotel() {
		HotelImpl hotel = new HotelImpl();
		return hotel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Client createClient() {
		ClientImpl client = new ClientImpl();
		return client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reservation createReservation() {
		ReservationImpl reservation = new ReservationImpl();
		return reservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Presidentielle createPresidentielle() {
		PresidentielleImpl presidentielle = new PresidentielleImpl();
		return presidentielle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classique createClassique() {
		ClassiqueImpl classique = new ClassiqueImpl();
		return classique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HotelManagmentPackage getHotelManagmentPackage() {
		return (HotelManagmentPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static HotelManagmentPackage getPackage() {
		return HotelManagmentPackage.eINSTANCE;
	}

} //HotelManagmentFactoryImpl
