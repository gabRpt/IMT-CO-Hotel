/**
 */
package hotelManagment.impl;

import hotelManagment.HotelManagmentPackage;
import hotelManagment.Presidentielle;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Presidentielle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hotelManagment.impl.PresidentielleImpl#getNbTV <em>Nb TV</em>}</li>
 *   <li>{@link hotelManagment.impl.PresidentielleImpl#getNbSdB <em>Nb Sd B</em>}</li>
 *   <li>{@link hotelManagment.impl.PresidentielleImpl#isBalcon <em>Balcon</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PresidentielleImpl extends ChambreImpl implements Presidentielle {
	/**
	 * The default value of the '{@link #getNbTV() <em>Nb TV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbTV()
	 * @generated
	 * @ordered
	 */
	protected static final int NB_TV_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNbTV() <em>Nb TV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbTV()
	 * @generated
	 * @ordered
	 */
	protected int nbTV = NB_TV_EDEFAULT;

	/**
	 * The default value of the '{@link #getNbSdB() <em>Nb Sd B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbSdB()
	 * @generated
	 * @ordered
	 */
	protected static final int NB_SD_B_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNbSdB() <em>Nb Sd B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbSdB()
	 * @generated
	 * @ordered
	 */
	protected int nbSdB = NB_SD_B_EDEFAULT;

	/**
	 * The default value of the '{@link #isBalcon() <em>Balcon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBalcon()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BALCON_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBalcon() <em>Balcon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBalcon()
	 * @generated
	 * @ordered
	 */
	protected boolean balcon = BALCON_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PresidentielleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HotelManagmentPackage.Literals.PRESIDENTIELLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbTV() {
		return nbTV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbTV(int newNbTV) {
		int oldNbTV = nbTV;
		nbTV = newNbTV;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelManagmentPackage.PRESIDENTIELLE__NB_TV, oldNbTV,
					nbTV));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbSdB() {
		return nbSdB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbSdB(int newNbSdB) {
		int oldNbSdB = nbSdB;
		nbSdB = newNbSdB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelManagmentPackage.PRESIDENTIELLE__NB_SD_B,
					oldNbSdB, nbSdB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBalcon() {
		return balcon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBalcon(boolean newBalcon) {
		boolean oldBalcon = balcon;
		balcon = newBalcon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelManagmentPackage.PRESIDENTIELLE__BALCON,
					oldBalcon, balcon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case HotelManagmentPackage.PRESIDENTIELLE__NB_TV:
			return getNbTV();
		case HotelManagmentPackage.PRESIDENTIELLE__NB_SD_B:
			return getNbSdB();
		case HotelManagmentPackage.PRESIDENTIELLE__BALCON:
			return isBalcon();
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
		case HotelManagmentPackage.PRESIDENTIELLE__NB_TV:
			setNbTV((Integer) newValue);
			return;
		case HotelManagmentPackage.PRESIDENTIELLE__NB_SD_B:
			setNbSdB((Integer) newValue);
			return;
		case HotelManagmentPackage.PRESIDENTIELLE__BALCON:
			setBalcon((Boolean) newValue);
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
		case HotelManagmentPackage.PRESIDENTIELLE__NB_TV:
			setNbTV(NB_TV_EDEFAULT);
			return;
		case HotelManagmentPackage.PRESIDENTIELLE__NB_SD_B:
			setNbSdB(NB_SD_B_EDEFAULT);
			return;
		case HotelManagmentPackage.PRESIDENTIELLE__BALCON:
			setBalcon(BALCON_EDEFAULT);
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
		case HotelManagmentPackage.PRESIDENTIELLE__NB_TV:
			return nbTV != NB_TV_EDEFAULT;
		case HotelManagmentPackage.PRESIDENTIELLE__NB_SD_B:
			return nbSdB != NB_SD_B_EDEFAULT;
		case HotelManagmentPackage.PRESIDENTIELLE__BALCON:
			return balcon != BALCON_EDEFAULT;
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
		result.append(" (nbTV: ");
		result.append(nbTV);
		result.append(", nbSdB: ");
		result.append(nbSdB);
		result.append(", balcon: ");
		result.append(balcon);
		result.append(')');
		return result.toString();
	}

} //PresidentielleImpl
