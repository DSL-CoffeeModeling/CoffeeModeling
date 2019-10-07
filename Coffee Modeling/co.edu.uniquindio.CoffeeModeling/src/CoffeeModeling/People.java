/**
 */
package CoffeeModeling;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>People</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CoffeeModeling.People#getId <em>Id</em>}</li>
 *   <li>{@link CoffeeModeling.People#getName <em>Name</em>}</li>
 *   <li>{@link CoffeeModeling.People#getBirthdate <em>Birthdate</em>}</li>
 *   <li>{@link CoffeeModeling.People#getExperience_years <em>Experience years</em>}</li>
 *   <li>{@link CoffeeModeling.People#getEntailment <em>Entailment</em>}</li>
 *   <li>{@link CoffeeModeling.People#getSpecial_population <em>Special population</em>}</li>
 * </ul>
 *
 * @see CoffeeModeling.CoffeeModelingPackage#getPeople()
 * @model
 * @generated
 */
public interface People extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see CoffeeModeling.CoffeeModelingPackage#getPeople_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link CoffeeModeling.People#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see CoffeeModeling.CoffeeModelingPackage#getPeople_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link CoffeeModeling.People#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Birthdate</b></em>' attribute.
	 * The default value is <code>"DD/MM/YYYY"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Birthdate</em>' attribute.
	 * @see #setBirthdate(String)
	 * @see CoffeeModeling.CoffeeModelingPackage#getPeople_Birthdate()
	 * @model default="DD/MM/YYYY"
	 * @generated
	 */
	String getBirthdate();

	/**
	 * Sets the value of the '{@link CoffeeModeling.People#getBirthdate <em>Birthdate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Birthdate</em>' attribute.
	 * @see #getBirthdate()
	 * @generated
	 */
	void setBirthdate(String value);

	/**
	 * Returns the value of the '<em><b>Experience years</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Experience years</em>' attribute.
	 * @see #setExperience_years(float)
	 * @see CoffeeModeling.CoffeeModelingPackage#getPeople_Experience_years()
	 * @model default="0.0"
	 * @generated
	 */
	float getExperience_years();

	/**
	 * Sets the value of the '{@link CoffeeModeling.People#getExperience_years <em>Experience years</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Experience years</em>' attribute.
	 * @see #getExperience_years()
	 * @generated
	 */
	void setExperience_years(float value);

	/**
	 * Returns the value of the '<em><b>Entailment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entailment</em>' attribute.
	 * @see #setEntailment(String)
	 * @see CoffeeModeling.CoffeeModelingPackage#getPeople_Entailment()
	 * @model
	 * @generated
	 */
	String getEntailment();

	/**
	 * Sets the value of the '{@link CoffeeModeling.People#getEntailment <em>Entailment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entailment</em>' attribute.
	 * @see #getEntailment()
	 * @generated
	 */
	void setEntailment(String value);

	/**
	 * Returns the value of the '<em><b>Special population</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Special population</em>' attribute.
	 * @see #setSpecial_population(String)
	 * @see CoffeeModeling.CoffeeModelingPackage#getPeople_Special_population()
	 * @model default=""
	 * @generated
	 */
	String getSpecial_population();

	/**
	 * Sets the value of the '{@link CoffeeModeling.People#getSpecial_population <em>Special population</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Special population</em>' attribute.
	 * @see #getSpecial_population()
	 * @generated
	 */
	void setSpecial_population(String value);

} // People
