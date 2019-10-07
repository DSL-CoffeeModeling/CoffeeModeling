/**
 */
package CoffeeModeling.impl;

import CoffeeModeling.CoffeeModelingPackage;
import CoffeeModeling.People;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>People</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CoffeeModeling.impl.PeopleImpl#getId <em>Id</em>}</li>
 *   <li>{@link CoffeeModeling.impl.PeopleImpl#getName <em>Name</em>}</li>
 *   <li>{@link CoffeeModeling.impl.PeopleImpl#getBirthdate <em>Birthdate</em>}</li>
 *   <li>{@link CoffeeModeling.impl.PeopleImpl#getExperience_years <em>Experience years</em>}</li>
 *   <li>{@link CoffeeModeling.impl.PeopleImpl#getEntailment <em>Entailment</em>}</li>
 *   <li>{@link CoffeeModeling.impl.PeopleImpl#getSpecial_population <em>Special population</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PeopleImpl extends MinimalEObjectImpl.Container implements People {
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
	 * The default value of the '{@link #getBirthdate() <em>Birthdate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirthdate()
	 * @generated
	 * @ordered
	 */
	protected static final String BIRTHDATE_EDEFAULT = "DD/MM/YYYY";

	/**
	 * The cached value of the '{@link #getBirthdate() <em>Birthdate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirthdate()
	 * @generated
	 * @ordered
	 */
	protected String birthdate = BIRTHDATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getExperience_years() <em>Experience years</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExperience_years()
	 * @generated
	 * @ordered
	 */
	protected static final float EXPERIENCE_YEARS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getExperience_years() <em>Experience years</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExperience_years()
	 * @generated
	 * @ordered
	 */
	protected float experience_years = EXPERIENCE_YEARS_EDEFAULT;

	/**
	 * The default value of the '{@link #getEntailment() <em>Entailment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntailment()
	 * @generated
	 * @ordered
	 */
	protected static final String ENTAILMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEntailment() <em>Entailment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntailment()
	 * @generated
	 * @ordered
	 */
	protected String entailment = ENTAILMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpecial_population() <em>Special population</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecial_population()
	 * @generated
	 * @ordered
	 */
	protected static final String SPECIAL_POPULATION_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getSpecial_population() <em>Special population</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecial_population()
	 * @generated
	 * @ordered
	 */
	protected String special_population = SPECIAL_POPULATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PeopleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoffeeModelingPackage.Literals.PEOPLE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.PEOPLE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.PEOPLE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBirthdate() {
		return birthdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBirthdate(String newBirthdate) {
		String oldBirthdate = birthdate;
		birthdate = newBirthdate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.PEOPLE__BIRTHDATE, oldBirthdate, birthdate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getExperience_years() {
		return experience_years;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExperience_years(float newExperience_years) {
		float oldExperience_years = experience_years;
		experience_years = newExperience_years;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.PEOPLE__EXPERIENCE_YEARS, oldExperience_years, experience_years));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEntailment() {
		return entailment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntailment(String newEntailment) {
		String oldEntailment = entailment;
		entailment = newEntailment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.PEOPLE__ENTAILMENT, oldEntailment, entailment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSpecial_population() {
		return special_population;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpecial_population(String newSpecial_population) {
		String oldSpecial_population = special_population;
		special_population = newSpecial_population;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.PEOPLE__SPECIAL_POPULATION, oldSpecial_population, special_population));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CoffeeModelingPackage.PEOPLE__ID:
				return getId();
			case CoffeeModelingPackage.PEOPLE__NAME:
				return getName();
			case CoffeeModelingPackage.PEOPLE__BIRTHDATE:
				return getBirthdate();
			case CoffeeModelingPackage.PEOPLE__EXPERIENCE_YEARS:
				return getExperience_years();
			case CoffeeModelingPackage.PEOPLE__ENTAILMENT:
				return getEntailment();
			case CoffeeModelingPackage.PEOPLE__SPECIAL_POPULATION:
				return getSpecial_population();
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
			case CoffeeModelingPackage.PEOPLE__ID:
				setId((String)newValue);
				return;
			case CoffeeModelingPackage.PEOPLE__NAME:
				setName((String)newValue);
				return;
			case CoffeeModelingPackage.PEOPLE__BIRTHDATE:
				setBirthdate((String)newValue);
				return;
			case CoffeeModelingPackage.PEOPLE__EXPERIENCE_YEARS:
				setExperience_years((Float)newValue);
				return;
			case CoffeeModelingPackage.PEOPLE__ENTAILMENT:
				setEntailment((String)newValue);
				return;
			case CoffeeModelingPackage.PEOPLE__SPECIAL_POPULATION:
				setSpecial_population((String)newValue);
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
			case CoffeeModelingPackage.PEOPLE__ID:
				setId(ID_EDEFAULT);
				return;
			case CoffeeModelingPackage.PEOPLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CoffeeModelingPackage.PEOPLE__BIRTHDATE:
				setBirthdate(BIRTHDATE_EDEFAULT);
				return;
			case CoffeeModelingPackage.PEOPLE__EXPERIENCE_YEARS:
				setExperience_years(EXPERIENCE_YEARS_EDEFAULT);
				return;
			case CoffeeModelingPackage.PEOPLE__ENTAILMENT:
				setEntailment(ENTAILMENT_EDEFAULT);
				return;
			case CoffeeModelingPackage.PEOPLE__SPECIAL_POPULATION:
				setSpecial_population(SPECIAL_POPULATION_EDEFAULT);
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
			case CoffeeModelingPackage.PEOPLE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case CoffeeModelingPackage.PEOPLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CoffeeModelingPackage.PEOPLE__BIRTHDATE:
				return BIRTHDATE_EDEFAULT == null ? birthdate != null : !BIRTHDATE_EDEFAULT.equals(birthdate);
			case CoffeeModelingPackage.PEOPLE__EXPERIENCE_YEARS:
				return experience_years != EXPERIENCE_YEARS_EDEFAULT;
			case CoffeeModelingPackage.PEOPLE__ENTAILMENT:
				return ENTAILMENT_EDEFAULT == null ? entailment != null : !ENTAILMENT_EDEFAULT.equals(entailment);
			case CoffeeModelingPackage.PEOPLE__SPECIAL_POPULATION:
				return SPECIAL_POPULATION_EDEFAULT == null ? special_population != null : !SPECIAL_POPULATION_EDEFAULT.equals(special_population);
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
		result.append(", birthdate: ");
		result.append(birthdate);
		result.append(", experience_years: ");
		result.append(experience_years);
		result.append(", entailment: ");
		result.append(entailment);
		result.append(", special_population: ");
		result.append(special_population);
		result.append(')');
		return result.toString();
	}

} //PeopleImpl
