/**
 */
package CoffeeModeling.impl;

import CoffeeModeling.CoffeeModelingPackage;
import CoffeeModeling.People;

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
 * An implementation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CoffeeModeling.impl.ProcessImpl#getId <em>Id</em>}</li>
 *   <li>{@link CoffeeModeling.impl.ProcessImpl#getDate_init <em>Date init</em>}</li>
 *   <li>{@link CoffeeModeling.impl.ProcessImpl#getName <em>Name</em>}</li>
 *   <li>{@link CoffeeModeling.impl.ProcessImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link CoffeeModeling.impl.ProcessImpl#getDate_end <em>Date end</em>}</li>
 *   <li>{@link CoffeeModeling.impl.ProcessImpl#getPeople <em>People</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessImpl extends MinimalEObjectImpl.Container implements CoffeeModeling.Process {
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
	 * The default value of the '{@link #getDate_init() <em>Date init</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate_init()
	 * @generated
	 * @ordered
	 */
	protected static final String DATE_INIT_EDEFAULT = "DD/MM/YYYY";

	/**
	 * The cached value of the '{@link #getDate_init() <em>Date init</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate_init()
	 * @generated
	 * @ordered
	 */
	protected String date_init = DATE_INIT_EDEFAULT;

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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDate_end() <em>Date end</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate_end()
	 * @generated
	 * @ordered
	 */
	protected static final String DATE_END_EDEFAULT = "DD/MM/YYYY";

	/**
	 * The cached value of the '{@link #getDate_end() <em>Date end</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate_end()
	 * @generated
	 * @ordered
	 */
	protected String date_end = DATE_END_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPeople() <em>People</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeople()
	 * @generated
	 * @ordered
	 */
	protected EList<People> people;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoffeeModelingPackage.Literals.PROCESS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.PROCESS__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDate_init() {
		return date_init;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDate_init(String newDate_init) {
		String oldDate_init = date_init;
		date_init = newDate_init;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.PROCESS__DATE_INIT, oldDate_init, date_init));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.PROCESS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.PROCESS__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDate_end() {
		return date_end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDate_end(String newDate_end) {
		String oldDate_end = date_end;
		date_end = newDate_end;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.PROCESS__DATE_END, oldDate_end, date_end));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<People> getPeople() {
		if (people == null) {
			people = new EObjectContainmentEList<People>(People.class, this, CoffeeModelingPackage.PROCESS__PEOPLE);
		}
		return people;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CoffeeModelingPackage.PROCESS__PEOPLE:
				return ((InternalEList<?>)getPeople()).basicRemove(otherEnd, msgs);
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
			case CoffeeModelingPackage.PROCESS__ID:
				return getId();
			case CoffeeModelingPackage.PROCESS__DATE_INIT:
				return getDate_init();
			case CoffeeModelingPackage.PROCESS__NAME:
				return getName();
			case CoffeeModelingPackage.PROCESS__DESCRIPTION:
				return getDescription();
			case CoffeeModelingPackage.PROCESS__DATE_END:
				return getDate_end();
			case CoffeeModelingPackage.PROCESS__PEOPLE:
				return getPeople();
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
			case CoffeeModelingPackage.PROCESS__ID:
				setId((String)newValue);
				return;
			case CoffeeModelingPackage.PROCESS__DATE_INIT:
				setDate_init((String)newValue);
				return;
			case CoffeeModelingPackage.PROCESS__NAME:
				setName((String)newValue);
				return;
			case CoffeeModelingPackage.PROCESS__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case CoffeeModelingPackage.PROCESS__DATE_END:
				setDate_end((String)newValue);
				return;
			case CoffeeModelingPackage.PROCESS__PEOPLE:
				getPeople().clear();
				getPeople().addAll((Collection<? extends People>)newValue);
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
			case CoffeeModelingPackage.PROCESS__ID:
				setId(ID_EDEFAULT);
				return;
			case CoffeeModelingPackage.PROCESS__DATE_INIT:
				setDate_init(DATE_INIT_EDEFAULT);
				return;
			case CoffeeModelingPackage.PROCESS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CoffeeModelingPackage.PROCESS__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case CoffeeModelingPackage.PROCESS__DATE_END:
				setDate_end(DATE_END_EDEFAULT);
				return;
			case CoffeeModelingPackage.PROCESS__PEOPLE:
				getPeople().clear();
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
			case CoffeeModelingPackage.PROCESS__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case CoffeeModelingPackage.PROCESS__DATE_INIT:
				return DATE_INIT_EDEFAULT == null ? date_init != null : !DATE_INIT_EDEFAULT.equals(date_init);
			case CoffeeModelingPackage.PROCESS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CoffeeModelingPackage.PROCESS__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case CoffeeModelingPackage.PROCESS__DATE_END:
				return DATE_END_EDEFAULT == null ? date_end != null : !DATE_END_EDEFAULT.equals(date_end);
			case CoffeeModelingPackage.PROCESS__PEOPLE:
				return people != null && !people.isEmpty();
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
		result.append(", date_init: ");
		result.append(date_init);
		result.append(", name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", date_end: ");
		result.append(date_end);
		result.append(')');
		return result.toString();
	}

} //ProcessImpl
