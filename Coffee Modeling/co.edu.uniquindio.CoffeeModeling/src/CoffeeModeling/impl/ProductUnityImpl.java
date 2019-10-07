/**
 */
package CoffeeModeling.impl;

import CoffeeModeling.CoffeeModelingPackage;
import CoffeeModeling.Defect;
import CoffeeModeling.Feature;
import CoffeeModeling.Origin;
import CoffeeModeling.ProductUnity;

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
 * An implementation of the model object '<em><b>Product Unity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CoffeeModeling.impl.ProductUnityImpl#getId <em>Id</em>}</li>
 *   <li>{@link CoffeeModeling.impl.ProductUnityImpl#getState <em>State</em>}</li>
 *   <li>{@link CoffeeModeling.impl.ProductUnityImpl#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link CoffeeModeling.impl.ProductUnityImpl#getDefect <em>Defect</em>}</li>
 *   <li>{@link CoffeeModeling.impl.ProductUnityImpl#getRegister <em>Register</em>}</li>
 *   <li>{@link CoffeeModeling.impl.ProductUnityImpl#getOrigin <em>Origin</em>}</li>
 *   <li>{@link CoffeeModeling.impl.ProductUnityImpl#getFeature <em>Feature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductUnityImpl extends MinimalEObjectImpl.Container implements ProductUnity {
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
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final String STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected String state = STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescripcion() <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescripcion()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPCION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescripcion() <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescripcion()
	 * @generated
	 * @ordered
	 */
	protected String descripcion = DESCRIPCION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDefect() <em>Defect</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefect()
	 * @generated
	 * @ordered
	 */
	protected EList<Defect> defect;

	/**
	 * The cached value of the '{@link #getRegister() <em>Register</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegister()
	 * @generated
	 * @ordered
	 */
	protected EList<CoffeeModeling.Process> register;

	/**
	 * The cached value of the '{@link #getOrigin() <em>Origin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigin()
	 * @generated
	 * @ordered
	 */
	protected Origin origin;

	/**
	 * The cached value of the '{@link #getFeature() <em>Feature</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeature()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> feature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductUnityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoffeeModelingPackage.Literals.PRODUCT_UNITY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.PRODUCT_UNITY__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setState(String newState) {
		String oldState = state;
		state = newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.PRODUCT_UNITY__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescripcion(String newDescripcion) {
		String oldDescripcion = descripcion;
		descripcion = newDescripcion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.PRODUCT_UNITY__DESCRIPCION, oldDescripcion, descripcion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Defect> getDefect() {
		if (defect == null) {
			defect = new EObjectContainmentEList<Defect>(Defect.class, this, CoffeeModelingPackage.PRODUCT_UNITY__DEFECT);
		}
		return defect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CoffeeModeling.Process> getRegister() {
		if (register == null) {
			register = new EObjectContainmentEList<CoffeeModeling.Process>(CoffeeModeling.Process.class, this, CoffeeModelingPackage.PRODUCT_UNITY__REGISTER);
		}
		return register;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Origin getOrigin() {
		return origin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrigin(Origin newOrigin, NotificationChain msgs) {
		Origin oldOrigin = origin;
		origin = newOrigin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.PRODUCT_UNITY__ORIGIN, oldOrigin, newOrigin);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrigin(Origin newOrigin) {
		if (newOrigin != origin) {
			NotificationChain msgs = null;
			if (origin != null)
				msgs = ((InternalEObject)origin).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CoffeeModelingPackage.PRODUCT_UNITY__ORIGIN, null, msgs);
			if (newOrigin != null)
				msgs = ((InternalEObject)newOrigin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CoffeeModelingPackage.PRODUCT_UNITY__ORIGIN, null, msgs);
			msgs = basicSetOrigin(newOrigin, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoffeeModelingPackage.PRODUCT_UNITY__ORIGIN, newOrigin, newOrigin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Feature> getFeature() {
		if (feature == null) {
			feature = new EObjectContainmentEList<Feature>(Feature.class, this, CoffeeModelingPackage.PRODUCT_UNITY__FEATURE);
		}
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CoffeeModelingPackage.PRODUCT_UNITY__DEFECT:
				return ((InternalEList<?>)getDefect()).basicRemove(otherEnd, msgs);
			case CoffeeModelingPackage.PRODUCT_UNITY__REGISTER:
				return ((InternalEList<?>)getRegister()).basicRemove(otherEnd, msgs);
			case CoffeeModelingPackage.PRODUCT_UNITY__ORIGIN:
				return basicSetOrigin(null, msgs);
			case CoffeeModelingPackage.PRODUCT_UNITY__FEATURE:
				return ((InternalEList<?>)getFeature()).basicRemove(otherEnd, msgs);
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
			case CoffeeModelingPackage.PRODUCT_UNITY__ID:
				return getId();
			case CoffeeModelingPackage.PRODUCT_UNITY__STATE:
				return getState();
			case CoffeeModelingPackage.PRODUCT_UNITY__DESCRIPCION:
				return getDescripcion();
			case CoffeeModelingPackage.PRODUCT_UNITY__DEFECT:
				return getDefect();
			case CoffeeModelingPackage.PRODUCT_UNITY__REGISTER:
				return getRegister();
			case CoffeeModelingPackage.PRODUCT_UNITY__ORIGIN:
				return getOrigin();
			case CoffeeModelingPackage.PRODUCT_UNITY__FEATURE:
				return getFeature();
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
			case CoffeeModelingPackage.PRODUCT_UNITY__ID:
				setId((String)newValue);
				return;
			case CoffeeModelingPackage.PRODUCT_UNITY__STATE:
				setState((String)newValue);
				return;
			case CoffeeModelingPackage.PRODUCT_UNITY__DESCRIPCION:
				setDescripcion((String)newValue);
				return;
			case CoffeeModelingPackage.PRODUCT_UNITY__DEFECT:
				getDefect().clear();
				getDefect().addAll((Collection<? extends Defect>)newValue);
				return;
			case CoffeeModelingPackage.PRODUCT_UNITY__REGISTER:
				getRegister().clear();
				getRegister().addAll((Collection<? extends CoffeeModeling.Process>)newValue);
				return;
			case CoffeeModelingPackage.PRODUCT_UNITY__ORIGIN:
				setOrigin((Origin)newValue);
				return;
			case CoffeeModelingPackage.PRODUCT_UNITY__FEATURE:
				getFeature().clear();
				getFeature().addAll((Collection<? extends Feature>)newValue);
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
			case CoffeeModelingPackage.PRODUCT_UNITY__ID:
				setId(ID_EDEFAULT);
				return;
			case CoffeeModelingPackage.PRODUCT_UNITY__STATE:
				setState(STATE_EDEFAULT);
				return;
			case CoffeeModelingPackage.PRODUCT_UNITY__DESCRIPCION:
				setDescripcion(DESCRIPCION_EDEFAULT);
				return;
			case CoffeeModelingPackage.PRODUCT_UNITY__DEFECT:
				getDefect().clear();
				return;
			case CoffeeModelingPackage.PRODUCT_UNITY__REGISTER:
				getRegister().clear();
				return;
			case CoffeeModelingPackage.PRODUCT_UNITY__ORIGIN:
				setOrigin((Origin)null);
				return;
			case CoffeeModelingPackage.PRODUCT_UNITY__FEATURE:
				getFeature().clear();
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
			case CoffeeModelingPackage.PRODUCT_UNITY__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case CoffeeModelingPackage.PRODUCT_UNITY__STATE:
				return STATE_EDEFAULT == null ? state != null : !STATE_EDEFAULT.equals(state);
			case CoffeeModelingPackage.PRODUCT_UNITY__DESCRIPCION:
				return DESCRIPCION_EDEFAULT == null ? descripcion != null : !DESCRIPCION_EDEFAULT.equals(descripcion);
			case CoffeeModelingPackage.PRODUCT_UNITY__DEFECT:
				return defect != null && !defect.isEmpty();
			case CoffeeModelingPackage.PRODUCT_UNITY__REGISTER:
				return register != null && !register.isEmpty();
			case CoffeeModelingPackage.PRODUCT_UNITY__ORIGIN:
				return origin != null;
			case CoffeeModelingPackage.PRODUCT_UNITY__FEATURE:
				return feature != null && !feature.isEmpty();
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
		result.append(", state: ");
		result.append(state);
		result.append(", descripcion: ");
		result.append(descripcion);
		result.append(')');
		return result.toString();
	}

} //ProductUnityImpl
