/**
 */
package hotelManagment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Presidentielle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hotelManagment.Presidentielle#getNbTV <em>Nb TV</em>}</li>
 *   <li>{@link hotelManagment.Presidentielle#getNbSdB <em>Nb Sd B</em>}</li>
 *   <li>{@link hotelManagment.Presidentielle#isBalcon <em>Balcon</em>}</li>
 * </ul>
 *
 * @see hotelManagment.HotelManagmentPackage#getPresidentielle()
 * @model
 * @generated
 */
public interface Presidentielle extends Chambre {
	/**
	 * Returns the value of the '<em><b>Nb TV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb TV</em>' attribute.
	 * @see #setNbTV(int)
	 * @see hotelManagment.HotelManagmentPackage#getPresidentielle_NbTV()
	 * @model
	 * @generated
	 */
	int getNbTV();

	/**
	 * Sets the value of the '{@link hotelManagment.Presidentielle#getNbTV <em>Nb TV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb TV</em>' attribute.
	 * @see #getNbTV()
	 * @generated
	 */
	void setNbTV(int value);

	/**
	 * Returns the value of the '<em><b>Nb Sd B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Sd B</em>' attribute.
	 * @see #setNbSdB(int)
	 * @see hotelManagment.HotelManagmentPackage#getPresidentielle_NbSdB()
	 * @model
	 * @generated
	 */
	int getNbSdB();

	/**
	 * Sets the value of the '{@link hotelManagment.Presidentielle#getNbSdB <em>Nb Sd B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Sd B</em>' attribute.
	 * @see #getNbSdB()
	 * @generated
	 */
	void setNbSdB(int value);

	/**
	 * Returns the value of the '<em><b>Balcon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Balcon</em>' attribute.
	 * @see #setBalcon(boolean)
	 * @see hotelManagment.HotelManagmentPackage#getPresidentielle_Balcon()
	 * @model
	 * @generated
	 */
	boolean isBalcon();

	/**
	 * Sets the value of the '{@link hotelManagment.Presidentielle#isBalcon <em>Balcon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Balcon</em>' attribute.
	 * @see #isBalcon()
	 * @generated
	 */
	void setBalcon(boolean value);

} // Presidentielle
