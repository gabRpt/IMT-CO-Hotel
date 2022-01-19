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
 * An implementation of the model object '<em><b>Personnel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hotelManagment.impl.PersonnelImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link hotelManagment.impl.PersonnelImpl#getPrenom <em>Prenom</em>}</li>
 *   <li>{@link hotelManagment.impl.PersonnelImpl#getChambre <em>Chambre</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersonnelImpl extends MinimalEObjectImpl.Container implements Personnel {
	/**
	 * The default value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected String nom = NOM_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrenom() <em>Prenom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrenom()
	 * @generated
	 * @ordered
	 */
	protected static final String PRENOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrenom() <em>Prenom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrenom()
	 * @generated
	 * @ordered
	 */
	protected String prenom = PRENOM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getChambre() <em>Chambre</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChambre()
	 * @generated
	 * @ordered
	 */
	protected EList<Chambre> chambre;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonnelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HotelManagmentPackage.Literals.PERSONNEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNom(String newNom) {
		String oldNom = nom;
		nom = newNom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelManagmentPackage.PERSONNEL__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrenom(String newPrenom) {
		String oldPrenom = prenom;
		prenom = newPrenom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelManagmentPackage.PERSONNEL__PRENOM, oldPrenom,
					prenom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Chambre> getChambre() {
		if (chambre == null) {
			chambre = new EObjectWithInverseResolvingEList.ManyInverse<Chambre>(Chambre.class, this,
					HotelManagmentPackage.PERSONNEL__CHAMBRE, HotelManagmentPackage.CHAMBRE__PERSONNEL);
		}
		return chambre;
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
		case HotelManagmentPackage.PERSONNEL__CHAMBRE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getChambre()).basicAdd(otherEnd, msgs);
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
		case HotelManagmentPackage.PERSONNEL__CHAMBRE:
			return ((InternalEList<?>) getChambre()).basicRemove(otherEnd, msgs);
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
		case HotelManagmentPackage.PERSONNEL__NOM:
			return getNom();
		case HotelManagmentPackage.PERSONNEL__PRENOM:
			return getPrenom();
		case HotelManagmentPackage.PERSONNEL__CHAMBRE:
			return getChambre();
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
		case HotelManagmentPackage.PERSONNEL__NOM:
			setNom((String) newValue);
			return;
		case HotelManagmentPackage.PERSONNEL__PRENOM:
			setPrenom((String) newValue);
			return;
		case HotelManagmentPackage.PERSONNEL__CHAMBRE:
			getChambre().clear();
			getChambre().addAll((Collection<? extends Chambre>) newValue);
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
		case HotelManagmentPackage.PERSONNEL__NOM:
			setNom(NOM_EDEFAULT);
			return;
		case HotelManagmentPackage.PERSONNEL__PRENOM:
			setPrenom(PRENOM_EDEFAULT);
			return;
		case HotelManagmentPackage.PERSONNEL__CHAMBRE:
			getChambre().clear();
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
		case HotelManagmentPackage.PERSONNEL__NOM:
			return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
		case HotelManagmentPackage.PERSONNEL__PRENOM:
			return PRENOM_EDEFAULT == null ? prenom != null : !PRENOM_EDEFAULT.equals(prenom);
		case HotelManagmentPackage.PERSONNEL__CHAMBRE:
			return chambre != null && !chambre.isEmpty();
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
		result.append(" (nom: ");
		result.append(nom);
		result.append(", prenom: ");
		result.append(prenom);
		result.append(')');
		return result.toString();
	}

} //PersonnelImpl
