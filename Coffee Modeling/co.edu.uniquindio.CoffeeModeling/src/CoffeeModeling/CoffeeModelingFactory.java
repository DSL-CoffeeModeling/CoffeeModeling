/**
 */
package CoffeeModeling;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see CoffeeModeling.CoffeeModelingPackage
 * @generated
 */
public interface CoffeeModelingFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CoffeeModelingFactory eINSTANCE = CoffeeModeling.impl.CoffeeModelingFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Origin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Origin</em>'.
	 * @generated
	 */
	Origin createOrigin();

	/**
	 * Returns a new object of class '<em>Product Unity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Unity</em>'.
	 * @generated
	 */
	ProductUnity createProductUnity();

	/**
	 * Returns a new object of class '<em>Defect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Defect</em>'.
	 * @generated
	 */
	Defect createDefect();

	/**
	 * Returns a new object of class '<em>People</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>People</em>'.
	 * @generated
	 */
	People createPeople();

	/**
	 * Returns a new object of class '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process</em>'.
	 * @generated
	 */
	Process createProcess();

	/**
	 * Returns a new object of class '<em>Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature</em>'.
	 * @generated
	 */
	Feature createFeature();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CoffeeModelingPackage getCoffeeModelingPackage();

} //CoffeeModelingFactory
