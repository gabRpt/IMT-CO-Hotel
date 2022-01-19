/**
 */
package hotelManagment;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reservation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hotelManagment.Reservation#getIdClient <em>Id Client</em>}</li>
 *   <li>{@link hotelManagment.Reservation#getNumChambre <em>Num Chambre</em>}</li>
 *   <li>{@link hotelManagment.Reservation#getDate <em>Date</em>}</li>
 * </ul>
 *
 * @see hotelManagment.HotelManagmentPackage#getReservation()
 * @model
 * @generated
 */
public interface Reservation extends EObject {
	/**
	 * Returns the value of the '<em><b>Id Client</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Client</em>' attribute.
	 * @see #setIdClient(int)
	 * @see hotelManagment.HotelManagmentPackage#getReservation_IdClient()
	 * @model
	 * @generated
	 */
	int getIdClient();

	/**
	 * Sets the value of the '{@link hotelManagment.Reservation#getIdClient <em>Id Client</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Client</em>' attribute.
	 * @see #getIdClient()
	 * @generated
	 */
	void setIdClient(int value);

	/**
	 * Returns the value of the '<em><b>Num Chambre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Chambre</em>' attribute.
	 * @see #setNumChambre(int)
	 * @see hotelManagment.HotelManagmentPackage#getReservation_NumChambre()
	 * @model
	 * @generated
	 */
	int getNumChambre();

	/**
	 * Sets the value of the '{@link hotelManagment.Reservation#getNumChambre <em>Num Chambre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Chambre</em>' attribute.
	 * @see #getNumChambre()
	 * @generated
	 */
	void setNumChambre(int value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see hotelManagment.HotelManagmentPackage#getReservation_Date()
	 * @model
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link hotelManagment.Reservation#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

} // Reservation
