/**
 */
package CoffeeModeling;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CoffeeModeling.Process#getId <em>Id</em>}</li>
 *   <li>{@link CoffeeModeling.Process#getDate_init <em>Date init</em>}</li>
 *   <li>{@link CoffeeModeling.Process#getName <em>Name</em>}</li>
 *   <li>{@link CoffeeModeling.Process#getDescription <em>Description</em>}</li>
 *   <li>{@link CoffeeModeling.Process#getDate_end <em>Date end</em>}</li>
 *   <li>{@link CoffeeModeling.Process#getPeople <em>People</em>}</li>
 * </ul>
 *
 * @see CoffeeModeling.CoffeeModelingPackage#getProcess()
 * @model
 * @generated
 */
public interface Process extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see CoffeeModeling.CoffeeModelingPackage#getProcess_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link CoffeeModeling.Process#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Date init</b></em>' attribute.
	 * The default value is <code>"DD/MM/YYYY"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date init</em>' attribute.
	 * @see #setDate_init(String)
	 * @see CoffeeModeling.CoffeeModelingPackage#getProcess_Date_init()
	 * @model default="DD/MM/YYYY"
	 * @generated
	 */
	String getDate_init();

	/**
	 * Sets the value of the '{@link CoffeeModeling.Process#getDate_init <em>Date init</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date init</em>' attribute.
	 * @see #getDate_init()
	 * @generated
	 */
	void setDate_init(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see CoffeeModeling.CoffeeModelingPackage#getProcess_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link CoffeeModeling.Process#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see CoffeeModeling.CoffeeModelingPackage#getProcess_Description()
	 * @model default=""
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link CoffeeModeling.Process#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Date end</b></em>' attribute.
	 * The default value is <code>"DD/MM/YYYY"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date end</em>' attribute.
	 * @see #setDate_end(String)
	 * @see CoffeeModeling.CoffeeModelingPackage#getProcess_Date_end()
	 * @model default="DD/MM/YYYY"
	 * @generated
	 */
	String getDate_end();

	/**
	 * Sets the value of the '{@link CoffeeModeling.Process#getDate_end <em>Date end</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date end</em>' attribute.
	 * @see #getDate_end()
	 * @generated
	 */
	void setDate_end(String value);

	/**
	 * Returns the value of the '<em><b>People</b></em>' containment reference list.
	 * The list contents are of type {@link CoffeeModeling.People}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>People</em>' containment reference list.
	 * @see CoffeeModeling.CoffeeModelingPackage#getProcess_People()
	 * @model containment="true"
	 * @generated
	 */
	EList<People> getPeople();

} // Process
