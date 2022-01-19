/**
 */
package hotelManagment.impl;

import hotelManagment.Chambre;
import hotelManagment.Client;
import hotelManagment.Hotel;
import hotelManagment.HotelManagmentPackage;
import hotelManagment.Personnel;
import hotelManagment.Reservation;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hotel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hotelManagment.impl.HotelImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link hotelManagment.impl.HotelImpl#getAdresse <em>Adresse</em>}</li>
 *   <li>{@link hotelManagment.impl.HotelImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link hotelManagment.impl.HotelImpl#getChiffreAffaire <em>Chiffre Affaire</em>}</li>
 *   <li>{@link hotelManagment.impl.HotelImpl#getReserveration <em>Reserveration</em>}</li>
 *   <li>{@link hotelManagment.impl.HotelImpl#getChambre <em>Chambre</em>}</li>
 *   <li>{@link hotelManagment.impl.HotelImpl#getClient <em>Client</em>}</li>
 *   <li>{@link hotelManagment.impl.HotelImpl#getPersonnel <em>Personnel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HotelImpl extends MinimalEObjectImpl.Container implements Hotel {
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
	 * The default value of the '{@link #getAdresse() <em>Adresse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdresse()
	 * @generated
	 * @ordered
	 */
	protected static final String ADRESSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdresse() <em>Adresse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdresse()
	 * @generated
	 * @ordered
	 */
	protected String adresse = ADRESSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final String CATEGORIE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected String categorie = CATEGORIE_EDEFAULT;

	/**
	 * The default value of the '{@link #getChiffreAffaire() <em>Chiffre Affaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChiffreAffaire()
	 * @generated
	 * @ordered
	 */
	protected static final int CHIFFRE_AFFAIRE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getChiffreAffaire() <em>Chiffre Affaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChiffreAffaire()
	 * @generated
	 * @ordered
	 */
	protected int chiffreAffaire = CHIFFRE_AFFAIRE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReserveration() <em>Reserveration</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserveration()
	 * @generated
	 * @ordered
	 */
	protected EList<Reservation> reserveration;

	/**
	 * The cached value of the '{@link #getChambre() <em>Chambre</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChambre()
	 * @generated
	 * @ordered
	 */
	protected EList<Chambre> chambre;

	/**
	 * The cached value of the '{@link #getClient() <em>Client</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClient()
	 * @generated
	 * @ordered
	 */
	protected EList<Client> client;

	/**
	 * The cached value of the '{@link #getPersonnel() <em>Personnel</em>}' containment reference list.
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
	protected HotelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HotelManagmentPackage.Literals.HOTEL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, HotelManagmentPackage.HOTEL__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAdresse() {
		return adresse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdresse(String newAdresse) {
		String oldAdresse = adresse;
		adresse = newAdresse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelManagmentPackage.HOTEL__ADRESSE, oldAdresse,
					adresse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(String newCategorie) {
		String oldCategorie = categorie;
		categorie = newCategorie;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelManagmentPackage.HOTEL__CATEGORIE, oldCategorie,
					categorie));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getChiffreAffaire() {
		return chiffreAffaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChiffreAffaire(int newChiffreAffaire) {
		int oldChiffreAffaire = chiffreAffaire;
		chiffreAffaire = newChiffreAffaire;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelManagmentPackage.HOTEL__CHIFFRE_AFFAIRE,
					oldChiffreAffaire, chiffreAffaire));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reservation> getReserveration() {
		if (reserveration == null) {
			reserveration = new EObjectContainmentEList<Reservation>(Reservation.class, this,
					HotelManagmentPackage.HOTEL__RESERVERATION);
		}
		return reserveration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Chambre> getChambre() {
		if (chambre == null) {
			chambre = new EObjectContainmentEList<Chambre>(Chambre.class, this, HotelManagmentPackage.HOTEL__CHAMBRE);
		}
		return chambre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Client> getClient() {
		if (client == null) {
			client = new EObjectContainmentEList<Client>(Client.class, this, HotelManagmentPackage.HOTEL__CLIENT);
		}
		return client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Personnel> getPersonnel() {
		if (personnel == null) {
			personnel = new EObjectContainmentEList<Personnel>(Personnel.class, this,
					HotelManagmentPackage.HOTEL__PERSONNEL);
		}
		return personnel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case HotelManagmentPackage.HOTEL__RESERVERATION:
			return ((InternalEList<?>) getReserveration()).basicRemove(otherEnd, msgs);
		case HotelManagmentPackage.HOTEL__CHAMBRE:
			return ((InternalEList<?>) getChambre()).basicRemove(otherEnd, msgs);
		case HotelManagmentPackage.HOTEL__CLIENT:
			return ((InternalEList<?>) getClient()).basicRemove(otherEnd, msgs);
		case HotelManagmentPackage.HOTEL__PERSONNEL:
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
		case HotelManagmentPackage.HOTEL__NOM:
			return getNom();
		case HotelManagmentPackage.HOTEL__ADRESSE:
			return getAdresse();
		case HotelManagmentPackage.HOTEL__CATEGORIE:
			return getCategorie();
		case HotelManagmentPackage.HOTEL__CHIFFRE_AFFAIRE:
			return getChiffreAffaire();
		case HotelManagmentPackage.HOTEL__RESERVERATION:
			return getReserveration();
		case HotelManagmentPackage.HOTEL__CHAMBRE:
			return getChambre();
		case HotelManagmentPackage.HOTEL__CLIENT:
			return getClient();
		case HotelManagmentPackage.HOTEL__PERSONNEL:
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
		case HotelManagmentPackage.HOTEL__NOM:
			setNom((String) newValue);
			return;
		case HotelManagmentPackage.HOTEL__ADRESSE:
			setAdresse((String) newValue);
			return;
		case HotelManagmentPackage.HOTEL__CATEGORIE:
			setCategorie((String) newValue);
			return;
		case HotelManagmentPackage.HOTEL__CHIFFRE_AFFAIRE:
			setChiffreAffaire((Integer) newValue);
			return;
		case HotelManagmentPackage.HOTEL__RESERVERATION:
			getReserveration().clear();
			getReserveration().addAll((Collection<? extends Reservation>) newValue);
			return;
		case HotelManagmentPackage.HOTEL__CHAMBRE:
			getChambre().clear();
			getChambre().addAll((Collection<? extends Chambre>) newValue);
			return;
		case HotelManagmentPackage.HOTEL__CLIENT:
			getClient().clear();
			getClient().addAll((Collection<? extends Client>) newValue);
			return;
		case HotelManagmentPackage.HOTEL__PERSONNEL:
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
		case HotelManagmentPackage.HOTEL__NOM:
			setNom(NOM_EDEFAULT);
			return;
		case HotelManagmentPackage.HOTEL__ADRESSE:
			setAdresse(ADRESSE_EDEFAULT);
			return;
		case HotelManagmentPackage.HOTEL__CATEGORIE:
			setCategorie(CATEGORIE_EDEFAULT);
			return;
		case HotelManagmentPackage.HOTEL__CHIFFRE_AFFAIRE:
			setChiffreAffaire(CHIFFRE_AFFAIRE_EDEFAULT);
			return;
		case HotelManagmentPackage.HOTEL__RESERVERATION:
			getReserveration().clear();
			return;
		case HotelManagmentPackage.HOTEL__CHAMBRE:
			getChambre().clear();
			return;
		case HotelManagmentPackage.HOTEL__CLIENT:
			getClient().clear();
			return;
		case HotelManagmentPackage.HOTEL__PERSONNEL:
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
		case HotelManagmentPackage.HOTEL__NOM:
			return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
		case HotelManagmentPackage.HOTEL__ADRESSE:
			return ADRESSE_EDEFAULT == null ? adresse != null : !ADRESSE_EDEFAULT.equals(adresse);
		case HotelManagmentPackage.HOTEL__CATEGORIE:
			return CATEGORIE_EDEFAULT == null ? categorie != null : !CATEGORIE_EDEFAULT.equals(categorie);
		case HotelManagmentPackage.HOTEL__CHIFFRE_AFFAIRE:
			return chiffreAffaire != CHIFFRE_AFFAIRE_EDEFAULT;
		case HotelManagmentPackage.HOTEL__RESERVERATION:
			return reserveration != null && !reserveration.isEmpty();
		case HotelManagmentPackage.HOTEL__CHAMBRE:
			return chambre != null && !chambre.isEmpty();
		case HotelManagmentPackage.HOTEL__CLIENT:
			return client != null && !client.isEmpty();
		case HotelManagmentPackage.HOTEL__PERSONNEL:
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
		result.append(" (nom: ");
		result.append(nom);
		result.append(", adresse: ");
		result.append(adresse);
		result.append(", categorie: ");
		result.append(categorie);
		result.append(", chiffreAffaire: ");
		result.append(chiffreAffaire);
		result.append(')');
		return result.toString();
	}

} //HotelImpl
