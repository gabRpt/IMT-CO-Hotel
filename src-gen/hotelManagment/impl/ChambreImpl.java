/**
 */
package hotelManagment.impl;

import hotelManagment.Chambre;
import hotelManagment.HotelManagmentPackage;
import hotelManagment.Personnel;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chambre</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hotelManagment.impl.ChambreImpl#getNumero <em>Numero</em>}</li>
 *   <li>{@link hotelManagment.impl.ChambreImpl#getNbLits <em>Nb Lits</em>}</li>
 *   <li>{@link hotelManagment.impl.ChambreImpl#getPrix <em>Prix</em>}</li>
 *   <li>{@link hotelManagment.impl.ChambreImpl#getPersonnel <em>Personnel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChambreImpl extends MinimalEObjectImpl.Container implements Chambre {
	/**
	 * The default value of the '{@link #getNumero() <em>Numero</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumero()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMERO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumero() <em>Numero</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumero()
	 * @generated
	 * @ordered
	 */
	protected int numero = NUMERO_EDEFAULT;

	/**
	 * The default value of the '{@link #getNbLits() <em>Nb Lits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbLits()
	 * @generated
	 * @ordered
	 */
	protected static final int NB_LITS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNbLits() <em>Nb Lits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbLits()
	 * @generated
	 * @ordered
	 */
	protected int nbLits = NB_LITS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrix() <em>Prix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrix()
	 * @generated
	 * @ordered
	 */
	protected static final float PRIX_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPrix() <em>Prix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrix()
	 * @generated
	 * @ordered
	 */
	protected float prix = PRIX_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPersonnel() <em>Personnel</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonnel()
	 * @generated
	 * @ordered
	 */
	protected EList<Personnel> personnel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChambreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HotelManagmentPackage.Literals.CHAMBRE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumero(int newNumero) {
		int oldNumero = numero;
		numero = newNumero;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelManagmentPackage.CHAMBRE__NUMERO, oldNumero,
					numero));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbLits() {
		return nbLits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbLits(int newNbLits) {
		int oldNbLits = nbLits;
		nbLits = newNbLits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelManagmentPackage.CHAMBRE__NB_LITS, oldNbLits,
					nbLits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPrix() {
		return prix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrix(float newPrix) {
		float oldPrix = prix;
		prix = newPrix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelManagmentPackage.CHAMBRE__PRIX, oldPrix, prix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Personnel> getPersonnel() {
		if (personnel == null) {
			personnel = new EObjectWithInverseResolvingEList.ManyInverse<Personnel>(Personnel.class, this,
					HotelManagmentPackage.CHAMBRE__PERSONNEL, HotelManagmentPackage.PERSONNEL__CHAMBRE);
		}
		return personnel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case HotelManagmentPackage.CHAMBRE__PERSONNEL:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getPersonnel()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case HotelManagmentPackage.CHAMBRE__PERSONNEL:
			return ((InternalEList<?>) getPersonnel()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case HotelManagmentPackage.CHAMBRE__NUMERO:
			return getNumero();
		case HotelManagmentPackage.CHAMBRE__NB_LITS:
			return getNbLits();
		case HotelManagmentPackage.CHAMBRE__PRIX:
			return getPrix();
		case HotelManagmentPackage.CHAMBRE__PERSONNEL:
			return getPersonnel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case HotelManagmentPackage.CHAMBRE__NUMERO:
			setNumero((Integer) newValue);
			return;
		case HotelManagmentPackage.CHAMBRE__NB_LITS:
			setNbLits((Integer) newValue);
			return;
		case HotelManagmentPackage.CHAMBRE__PRIX:
			setPrix((Float) newValue);
			return;
		case HotelManagmentPackage.CHAMBRE__PERSONNEL:
			getPersonnel().clear();
			getPersonnel().addAll((Collection<? extends Personnel>) newValue);
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
		case HotelManagmentPackage.CHAMBRE__NUMERO:
			setNumero(NUMERO_EDEFAULT);
			return;
		case HotelManagmentPackage.CHAMBRE__NB_LITS:
			setNbLits(NB_LITS_EDEFAULT);
			return;
		case HotelManagmentPackage.CHAMBRE__PRIX:
			setPrix(PRIX_EDEFAULT);
			return;
		case HotelManagmentPackage.CHAMBRE__PERSONNEL:
			getPersonnel().clear();
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
		case HotelManagmentPackage.CHAMBRE__NUMERO:
			return numero != NUMERO_EDEFAULT;
		case HotelManagmentPackage.CHAMBRE__NB_LITS:
			return nbLits != NB_LITS_EDEFAULT;
		case HotelManagmentPackage.CHAMBRE__PRIX:
			return prix != PRIX_EDEFAULT;
		case HotelManagmentPackage.CHAMBRE__PERSONNEL:
			return personnel != null && !personnel.isEmpty();
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
		result.append(" (numero: ");
		result.append(numero);
		result.append(", nbLits: ");
		result.append(nbLits);
		result.append(", prix: ");
		result.append(prix);
		result.append(')');
		return result.toString();
	}

} //ChambreImpl
