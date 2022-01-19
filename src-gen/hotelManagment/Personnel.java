/**
 */
package hotelManagment;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Personnel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hotelManagment.Personnel#getNom <em>Nom</em>}</li>
 *   <li>{@link hotelManagment.Personnel#getPrenom <em>Prenom</em>}</li>
 *   <li>{@link hotelManagment.Personnel#getChambre <em>Chambre</em>}</li>
 * </ul>
 *
 * @see hotelManagment.HotelManagmentPackage#getPersonnel()
 * @model
 * @generated
 */
public interface Personnel extends EObject {
	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see hotelManagment.HotelManagmentPackage#getPersonnel_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link hotelManagment.Personnel#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Prenom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prenom</em>' attribute.
	 * @see #setPrenom(String)
	 * @see hotelManagment.HotelManagmentPackage#getPersonnel_Prenom()
	 * @model
	 * @generated
	 */
	String getPrenom();

	/**
	 * Sets the value of the '{@link hotelManagment.Personnel#getPrenom <em>Prenom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prenom</em>' attribute.
	 * @see #getPrenom()
	 * @generated
	 */
	void setPrenom(String value);

	/**
	 * Returns the value of the '<em><b>Chambre</b></em>' reference list.
	 * The list contents are of type {@link hotelManagment.Chambre}.
	 * It is bidirectional and its opposite is '{@link hotelManagment.Chambre#getPersonnel <em>Personnel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chambre</em>' reference list.
	 * @see hotelManagment.HotelManagmentPackage#getPersonnel_Chambre()
	 * @see hotelManagment.Chambre#getPersonnel
	 * @model opposite="personnel"
	 * @generated
	 */
	EList<Chambre> getChambre();

} // Personnel
