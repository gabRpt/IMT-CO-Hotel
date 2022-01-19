/**
 */
package hotelManagment;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hotelManagment.HotelManagmentPackage
 * @generated
 */
public interface HotelManagmentFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HotelManagmentFactory eINSTANCE = hotelManagment.impl.HotelManagmentFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Personnel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Personnel</em>'.
	 * @generated
	 */
	Personnel createPersonnel();

	/**
	 * Returns a new object of class '<em>Chambre</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Chambre</em>'.
	 * @generated
	 */
	Chambre createChambre();

	/**
	 * Returns a new object of class '<em>Hotel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hotel</em>'.
	 * @generated
	 */
	Hotel createHotel();

	/**
	 * Returns a new object of class '<em>Client</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Client</em>'.
	 * @generated
	 */
	Client createClient();

	/**
	 * Returns a new object of class '<em>Reservation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reservation</em>'.
	 * @generated
	 */
	Reservation createReservation();

	/**
	 * Returns a new object of class '<em>Presidentielle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Presidentielle</em>'.
	 * @generated
	 */
	Presidentielle createPresidentielle();

	/**
	 * Returns a new object of class '<em>Classique</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Classique</em>'.
	 * @generated
	 */
	Classique createClassique();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	HotelManagmentPackage getHotelManagmentPackage();

} //HotelManagmentFactory
