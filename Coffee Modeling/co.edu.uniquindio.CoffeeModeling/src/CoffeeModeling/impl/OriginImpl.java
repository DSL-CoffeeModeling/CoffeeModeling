/**
 */
package CoffeeModeling.impl;

import CoffeeModeling.CoffeeModelingPackage;
import CoffeeModeling.Origin;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Origin</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CoffeeModeling.impl.OriginImpl#getId <em>Id</em>}</li>
 *   <li>{@link CoffeeModeling.impl.OriginImpl#getName <em>Name</em>}</li>
 *   <li>{@link CoffeeModeling.impl.OriginImpl#getAverage_altitude <em>Average altitude</em>}</li>
 *   <li>{@link CoffeeModeling.impl.OriginImpl#getAverage_latitude <em>Average latitude</em>}</li>
 *   <li>{@link CoffeeModeling.impl.OriginImpl#getAverage_longitude <em>Average longitude</em>}</li>
 *   <li>{@link CoffeeModeling.impl.OriginImpl#getAnual_production <em>Anual production</em>}</li>
 *   <li>{@link CoffeeModeling.impl.OriginImpl#getAverage_temperature <em>Average temperature</em>}</li>
 *   <li>{@link CoffeeModeling.impl.OriginImpl#getAssortment <em>Assortment</em>}</li>
 *   <li>{@link CoffeeModeling.impl.OriginImpl#getDetails <em>Details</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OriginImpl extends MinimalEObjectImpl.Container implements Origin {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAverage_altitude() <em>Average altitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAverage_altitude()
	 * @generated
	 * @ordered
	 */
	protected static final String AVERAGE_ALTITUDE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAverage_altitude() <em>Average altitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAverage_altitude()
	 * @generated
	 * @ordered
	 */
	protected String average_altitude = AVERAGE_ALTITUDE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAverage_latitude() <em>Average latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAverage_latitude()
	 * @generated
	 * @ordered
	 */
	protected static final String AVERAGE_LATITUDE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAverage_latitude() <em>Average latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAverage_latitude()
	 * @generated
	 * @ordered
	 */
	protected String average_latitude = AVERAGE_LATITUDE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAverage_longitude() <em>Average longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAverage_longitude()
	 * @generated
	 * @ordered
	 */
	protected static final String AVERAGE_LONGITUDE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAverage_longitude() <em>Average longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAverage_longitude()
	 * @generated
	 * @ordered
	 */
	protected String average_longitude = AVERAGE_LONGITUDE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAnual_production() <em>Anual production</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnual_production()
	 * @generated
	 * @ordered
	 */
	protected static final float ANUAL_PRODUCTION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAnual_production() <em>Anual production</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnual_production()
	 * @generated
	 * @ordered
	 */
	protected float anual_production = ANUAL_PRODUCTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getAverage_temperature() <em>Average temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAverage_temperature()
	 * @generated
	 * @ordered
	 */
	protected static final float AVERAGE_TEMPERATURE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAverage_temperature() <em>Average temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAverage_temperature()
	 * @generated
	 * @ordered
	 */
	protected float average_temperature = AVERAGE_TEMPERATURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAssortment() <em>Assortment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssortment()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSORTMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssortment() <em>Assortment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssortment()
	 * @generated
	 * @ordered
	 */
	protected String assortment = ASSORTMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDetails() <em>Details</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetails()
	 * @generated
	 * @ordered
	 */
	protected static final String DETAILS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDetails() <em>Details</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetails()
	 * @generated
	 * @ordered
	 */
	protected String details = DETAILS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OriginImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoffeeModelingPackage.Literals.ORIGIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.ORIGIN__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.ORIGIN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAverage_altitude() {
		return average_altitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAverage_altitude(String newAverage_altitude) {
		String oldAverage_altitude = average_altitude;
		average_altitude = newAverage_altitude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.ORIGIN__AVERAGE_ALTITUDE, oldAverage_altitude, average_altitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAverage_latitude() {
		return average_latitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAverage_latitude(String newAverage_latitude) {
		String oldAverage_latitude = average_latitude;
		average_latitude = newAverage_latitude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.ORIGIN__AVERAGE_LATITUDE, oldAverage_latitude, average_latitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAverage_longitude() {
		return average_longitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAverage_longitude(String newAverage_longitude) {
		String oldAverage_longitude = average_longitude;
		average_longitude = newAverage_longitude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.ORIGIN__AVERAGE_LONGITUDE, oldAverage_longitude, average_longitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getAnual_production() {
		return anual_production;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnual_production(float newAnual_production) {
		float oldAnual_production = anual_production;
		anual_production = newAnual_production;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.ORIGIN__ANUAL_PRODUCTION, oldAnual_production, anual_production));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getAverage_temperature() {
		return average_temperature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAverage_temperature(float newAverage_temperature) {
		float oldAverage_temperature = average_temperature;
		average_temperature = newAverage_temperature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.ORIGIN__AVERAGE_TEMPERATURE, oldAverage_temperature, average_temperature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAssortment() {
		return assortment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssortment(String newAssortment) {
		String oldAssortment = assortment;
		assortment = newAssortment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.ORIGIN__ASSORTMENT, oldAssortment, assortment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDetails() {
		return details;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDetails(String newDetails) {
		String oldDetails = details;
		details = newDetails;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.ORIGIN__DETAILS, oldDetails, details));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CoffeeModelingPackage.ORIGIN__ID:
				return getId();
			case CoffeeModelingPackage.ORIGIN__NAME:
				return getName();
			case CoffeeModelingPackage.ORIGIN__AVERAGE_ALTITUDE:
				return getAverage_altitude();
			case CoffeeModelingPackage.ORIGIN__AVERAGE_LATITUDE:
				return getAverage_latitude();
			case CoffeeModelingPackage.ORIGIN__AVERAGE_LONGITUDE:
				return getAverage_longitude();
			case CoffeeModelingPackage.ORIGIN__ANUAL_PRODUCTION:
				return getAnual_production();
			case CoffeeModelingPackage.ORIGIN__AVERAGE_TEMPERATURE:
				return getAverage_temperature();
			case CoffeeModelingPackage.ORIGIN__ASSORTMENT:
				return getAssortment();
			case CoffeeModelingPackage.ORIGIN__DETAILS:
				return getDetails();
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
			case CoffeeModelingPackage.ORIGIN__ID:
				setId((String)newValue);
				return;
			case CoffeeModelingPackage.ORIGIN__NAME:
				setName((String)newValue);
				return;
			case CoffeeModelingPackage.ORIGIN__AVERAGE_ALTITUDE:
				setAverage_altitude((String)newValue);
				return;
			case CoffeeModelingPackage.ORIGIN__AVERAGE_LATITUDE:
				setAverage_latitude((String)newValue);
				return;
			case CoffeeModelingPackage.ORIGIN__AVERAGE_LONGITUDE:
				setAverage_longitude((String)newValue);
				return;
			case CoffeeModelingPackage.ORIGIN__ANUAL_PRODUCTION:
				setAnual_production((Float)newValue);
				return;
			case CoffeeModelingPackage.ORIGIN__AVERAGE_TEMPERATURE:
				setAverage_temperature((Float)newValue);
				return;
			case CoffeeModelingPackage.ORIGIN__ASSORTMENT:
				setAssortment((String)newValue);
				return;
			case CoffeeModelingPackage.ORIGIN__DETAILS:
				setDetails((String)newValue);
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
			case CoffeeModelingPackage.ORIGIN__ID:
				setId(ID_EDEFAULT);
				return;
			case CoffeeModelingPackage.ORIGIN__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CoffeeModelingPackage.ORIGIN__AVERAGE_ALTITUDE:
				setAverage_altitude(AVERAGE_ALTITUDE_EDEFAULT);
				return;
			case CoffeeModelingPackage.ORIGIN__AVERAGE_LATITUDE:
				setAverage_latitude(AVERAGE_LATITUDE_EDEFAULT);
				return;
			case CoffeeModelingPackage.ORIGIN__AVERAGE_LONGITUDE:
				setAverage_longitude(AVERAGE_LONGITUDE_EDEFAULT);
				return;
			case CoffeeModelingPackage.ORIGIN__ANUAL_PRODUCTION:
				setAnual_production(ANUAL_PRODUCTION_EDEFAULT);
				return;
			case CoffeeModelingPackage.ORIGIN__AVERAGE_TEMPERATURE:
				setAverage_temperature(AVERAGE_TEMPERATURE_EDEFAULT);
				return;
			case CoffeeModelingPackage.ORIGIN__ASSORTMENT:
				setAssortment(ASSORTMENT_EDEFAULT);
				return;
			case CoffeeModelingPackage.ORIGIN__DETAILS:
				setDetails(DETAILS_EDEFAULT);
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
			case CoffeeModelingPackage.ORIGIN__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case CoffeeModelingPackage.ORIGIN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CoffeeModelingPackage.ORIGIN__AVERAGE_ALTITUDE:
				return AVERAGE_ALTITUDE_EDEFAULT == null ? average_altitude != null : !AVERAGE_ALTITUDE_EDEFAULT.equals(average_altitude);
			case CoffeeModelingPackage.ORIGIN__AVERAGE_LATITUDE:
				return AVERAGE_LATITUDE_EDEFAULT == null ? average_latitude != null : !AVERAGE_LATITUDE_EDEFAULT.equals(average_latitude);
			case CoffeeModelingPackage.ORIGIN__AVERAGE_LONGITUDE:
				return AVERAGE_LONGITUDE_EDEFAULT == null ? average_longitude != null : !AVERAGE_LONGITUDE_EDEFAULT.equals(average_longitude);
			case CoffeeModelingPackage.ORIGIN__ANUAL_PRODUCTION:
				return anual_production != ANUAL_PRODUCTION_EDEFAULT;
			case CoffeeModelingPackage.ORIGIN__AVERAGE_TEMPERATURE:
				return average_temperature != AVERAGE_TEMPERATURE_EDEFAULT;
			case CoffeeModelingPackage.ORIGIN__ASSORTMENT:
				return ASSORTMENT_EDEFAULT == null ? assortment != null : !ASSORTMENT_EDEFAULT.equals(assortment);
			case CoffeeModelingPackage.ORIGIN__DETAILS:
				return DETAILS_EDEFAULT == null ? details != null : !DETAILS_EDEFAULT.equals(details);
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
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", average_altitude: ");
		result.append(average_altitude);
		result.append(", average_latitude: ");
		result.append(average_latitude);
		result.append(", average_longitude: ");
		result.append(average_longitude);
		result.append(", anual_production: ");
		result.append(anual_production);
		result.append(", average_temperature: ");
		result.append(average_temperature);
		result.append(", assortment: ");
		result.append(assortment);
		result.append(", details: ");
		result.append(details);
		result.append(')');
		return result.toString();
	}

} //OriginImpl
