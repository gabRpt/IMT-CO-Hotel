/**
 */
package hotelManagment.impl;

import hotelManagment.HotelManagmentPackage;
import hotelManagment.Reservation;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reservation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hotelManagment.impl.ReservationImpl#getIdClient <em>Id Client</em>}</li>
 *   <li>{@link hotelManagment.impl.ReservationImpl#getNumChambre <em>Num Chambre</em>}</li>
 *   <li>{@link hotelManagment.impl.ReservationImpl#getDate <em>Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReservationImpl extends MinimalEObjectImpl.Container implements Reservation {
	/**
	 * The default value of the '{@link #getIdClient() <em>Id Client</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdClient()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_CLIENT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIdClient() <em>Id Client</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdClient()
	 * @generated
	 * @ordered
	 */
	protected int idClient = ID_CLIENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumChambre() <em>Num Chambre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumChambre()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_CHAMBRE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumChambre() <em>Num Chambre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumChambre()
	 * @generated
	 * @ordered
	 */
	protected int numChambre = NUM_CHAMBRE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Date date = DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HotelManagmentPackage.Literals.RESERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIdClient() {
		return idClient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdClient(int newIdClient) {
		int oldIdClient = idClient;
		idClient = newIdClient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelManagmentPackage.RESERVATION__ID_CLIENT,
					oldIdClient, idClient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumChambre() {
		return numChambre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumChambre(int newNumChambre) {
		int oldNumChambre = numChambre;
		numChambre = newNumChambre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelManagmentPackage.RESERVATION__NUM_CHAMBRE,
					oldNumChambre, numChambre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(Date newDate) {
		Date oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelManagmentPackage.RESERVATION__DATE, oldDate,
					date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case HotelManagmentPackage.RESERVATION__ID_CLIENT:
			return getIdClient();
		case HotelManagmentPackage.RESERVATION__NUM_CHAMBRE:
			return getNumChambre();
		case HotelManagmentPackage.RESERVATION__DATE:
			return getDate();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case HotelManagmentPackage.RESERVATION__ID_CLIENT:
			setIdClient((Integer) newValue);
			return;
		case HotelManagmentPackage.RESERVATION__NUM_CHAMBRE:
			setNumChambre((Integer) newValue);
			return;
		case HotelManagmentPackage.RESERVATION__DATE:
			setDate((Date) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case HotelManagmentPackage.RESERVATION__ID_CLIENT:
			setIdClient(ID_CLIENT_EDEFAULT);
			return;
		case HotelManagmentPackage.RESERVATION__NUM_CHAMBRE:
			setNumChambre(NUM_CHAMBRE_EDEFAULT);
			return;
		case HotelManagmentPackage.RESERVATION__DATE:
			setDate(DATE_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case HotelManagmentPackage.RESERVATION__ID_CLIENT:
			return idClient != ID_CLIENT_EDEFAULT;
		case HotelManagmentPackage.RESERVATION__NUM_CHAMBRE:
			return numChambre != NUM_CHAMBRE_EDEFAULT;
		case HotelManagmentPackage.RESERVATION__DATE:
			return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (idClient: ");
		result.append(idClient);
		result.append(", numChambre: ");
		result.append(numChambre);
		result.append(", date: ");
		result.append(date);
		result.append(')');
		return result.toString();
	}

} //ReservationImpl
