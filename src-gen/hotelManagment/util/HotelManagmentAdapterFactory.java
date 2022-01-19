/**
 */
package hotelManagment.util;

import hotelManagment.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see hotelManagment.HotelManagmentPackage
 * @generated
 */
public class HotelManagmentAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static HotelManagmentPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HotelManagmentAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = HotelManagmentPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HotelManagmentSwitch<Adapter> modelSwitch = new HotelManagmentSwitch<Adapter>() {
		@Override
		public Adapter casePersonnel(Personnel object) {
			return createPersonnelAdapter();
		}

		@Override
		public Adapter caseChambre(Chambre object) {
			return createChambreAdapter();
		}

		@Override
		public Adapter caseHotel(Hotel object) {
			return createHotelAdapter();
		}

		@Override
		public Adapter caseClient(Client object) {
			return createClientAdapter();
		}

		@Override
		public Adapter caseReservation(Reservation object) {
			return createReservationAdapter();
		}

		@Override
		public Adapter casePresidentielle(Presidentielle object) {
			return createPresidentielleAdapter();
		}

		@Override
		public Adapter caseClassique(Classique object) {
			return createClassiqueAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link hotelManagment.Personnel <em>Personnel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hotelManagment.Personnel
	 * @generated
	 */
	public Adapter createPersonnelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hotelManagment.Chambre <em>Chambre</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hotelManagment.Chambre
	 * @generated
	 */
	public Adapter createChambreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hotelManagment.Hotel <em>Hotel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hotelManagment.Hotel
	 * @generated
	 */
	public Adapter createHotelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hotelManagment.Client <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hotelManagment.Client
	 * @generated
	 */
	public Adapter createClientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hotelManagment.Reservation <em>Reservation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hotelManagment.Reservation
	 * @generated
	 */
	public Adapter createReservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hotelManagment.Presidentielle <em>Presidentielle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hotelManagment.Presidentielle
	 * @generated
	 */
	public Adapter createPresidentielleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hotelManagment.Classique <em>Classique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hotelManagment.Classique
	 * @generated
	 */
	public Adapter createClassiqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //HotelManagmentAdapterFactory
