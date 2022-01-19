/**
 */
package hotelManagment;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chambre</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hotelManagment.Chambre#getNumero <em>Numero</em>}</li>
 *   <li>{@link hotelManagment.Chambre#getNbLits <em>Nb Lits</em>}</li>
 *   <li>{@link hotelManagment.Chambre#getPrix <em>Prix</em>}</li>
 *   <li>{@link hotelManagment.Chambre#getPersonnel <em>Personnel</em>}</li>
 * </ul>
 *
 * @see hotelManagment.HotelManagmentPackage#getChambre()
 * @model
 * @generated
 */
public interface Chambre extends EObject {
	/**
	 * Returns the value of the '<em><b>Numero</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero</em>' attribute.
	 * @see #setNumero(int)
	 * @see hotelManagment.HotelManagmentPackage#getChambre_Numero()
	 * @model
	 * @generated
	 */
	int getNumero();

	/**
	 * Sets the value of the '{@link hotelManagment.Chambre#getNumero <em>Numero</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero</em>' attribute.
	 * @see #getNumero()
	 * @generated
	 */
	void setNumero(int value);

	/**
	 * Returns the value of the '<em><b>Nb Lits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Lits</em>' attribute.
	 * @see #setNbLits(int)
	 * @see hotelManagment.HotelManagmentPackage#getChambre_NbLits()
	 * @model
	 * @generated
	 */
	int getNbLits();

	/**
	 * Sets the value of the '{@link hotelManagment.Chambre#getNbLits <em>Nb Lits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Lits</em>' attribute.
	 * @see #getNbLits()
	 * @generated
	 */
	void setNbLits(int value);

	/**
	 * Returns the value of the '<em><b>Prix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prix</em>' attribute.
	 * @see #setPrix(float)
	 * @see hotelManagment.HotelManagmentPackage#getChambre_Prix()
	 * @model
	 * @generated
	 */
	float getPrix();

	/**
	 * Sets the value of the '{@link hotelManagment.Chambre#getPrix <em>Prix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prix</em>' attribute.
	 * @see #getPrix()
	 * @generated
	 */
	void setPrix(float value);

	/**
	 * Returns the value of the '<em><b>Personnel</b></em>' reference list.
	 * The list contents are of type {@link hotelManagment.Personnel}.
	 * It is bidirectional and its opposite is '{@link hotelManagment.Personnel#getChambre <em>Chambre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Personnel</em>' reference list.
	 * @see hotelManagment.HotelManagmentPackage#getChambre_Personnel()
	 * @see hotelManagment.Personnel#getChambre
	 * @model opposite="chambre"
	 * @generated
	 */
	EList<Personnel> getPersonnel();

} // Chambre
