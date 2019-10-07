/**
 */
package CoffeeModeling;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Unity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CoffeeModeling.ProductUnity#getId <em>Id</em>}</li>
 *   <li>{@link CoffeeModeling.ProductUnity#getState <em>State</em>}</li>
 *   <li>{@link CoffeeModeling.ProductUnity#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link CoffeeModeling.ProductUnity#getDefect <em>Defect</em>}</li>
 *   <li>{@link CoffeeModeling.ProductUnity#getRegister <em>Register</em>}</li>
 *   <li>{@link CoffeeModeling.ProductUnity#getOrigin <em>Origin</em>}</li>
 *   <li>{@link CoffeeModeling.ProductUnity#getFeature <em>Feature</em>}</li>
 * </ul>
 *
 * @see CoffeeModeling.CoffeeModelingPackage#getProductUnity()
 * @model
 * @generated
 */
public interface ProductUnity extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see CoffeeModeling.CoffeeModelingPackage#getProductUnity_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link CoffeeModeling.ProductUnity#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see #setState(String)
	 * @see CoffeeModeling.CoffeeModelingPackage#getProductUnity_State()
	 * @model
	 * @generated
	 */
	String getState();

	/**
	 * Sets the value of the '{@link CoffeeModeling.ProductUnity#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see #getState()
	 * @generated
	 */
	void setState(String value);

	/**
	 * Returns the value of the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descripcion</em>' attribute.
	 * @see #setDescripcion(String)
	 * @see CoffeeModeling.CoffeeModelingPackage#getProductUnity_Descripcion()
	 * @model
	 * @generated
	 */
	String getDescripcion();

	/**
	 * Sets the value of the '{@link CoffeeModeling.ProductUnity#getDescripcion <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descripcion</em>' attribute.
	 * @see #getDescripcion()
	 * @generated
	 */
	void setDescripcion(String value);

	/**
	 * Returns the value of the '<em><b>Defect</b></em>' containment reference list.
	 * The list contents are of type {@link CoffeeModeling.Defect}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defect</em>' containment reference list.
	 * @see CoffeeModeling.CoffeeModelingPackage#getProductUnity_Defect()
	 * @model containment="true"
	 * @generated
	 */
	EList<Defect> getDefect();

	/**
	 * Returns the value of the '<em><b>Register</b></em>' containment reference list.
	 * The list contents are of type {@link CoffeeModeling.Process}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Register</em>' containment reference list.
	 * @see CoffeeModeling.CoffeeModelingPackage#getProductUnity_Register()
	 * @model containment="true"
	 * @generated
	 */
	EList<CoffeeModeling.Process> getRegister();

	/**
	 * Returns the value of the '<em><b>Origin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin</em>' containment reference.
	 * @see #setOrigin(Origin)
	 * @see CoffeeModeling.CoffeeModelingPackage#getProductUnity_Origin()
	 * @model containment="true"
	 * @generated
	 */
	Origin getOrigin();

	/**
	 * Sets the value of the '{@link CoffeeModeling.ProductUnity#getOrigin <em>Origin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin</em>' containment reference.
	 * @see #getOrigin()
	 * @generated
	 */
	void setOrigin(Origin value);

	/**
	 * Returns the value of the '<em><b>Feature</b></em>' containment reference list.
	 * The list contents are of type {@link CoffeeModeling.Feature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' containment reference list.
	 * @see CoffeeModeling.CoffeeModelingPackage#getProductUnity_Feature()
	 * @model containment="true"
	 * @generated
	 */
	EList<Feature> getFeature();

} // ProductUnity
