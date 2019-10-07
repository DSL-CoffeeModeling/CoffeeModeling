/**
 */
package CoffeeModeling.impl;

import CoffeeModeling.CoffeeModelingFactory;
import CoffeeModeling.CoffeeModelingPackage;
import CoffeeModeling.Defect;
import CoffeeModeling.Feature;
import CoffeeModeling.Origin;
import CoffeeModeling.People;
import CoffeeModeling.ProductUnity;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CoffeeModelingFactoryImpl extends EFactoryImpl implements CoffeeModelingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CoffeeModelingFactory init() {
		try {
			CoffeeModelingFactory theCoffeeModelingFactory = (CoffeeModelingFactory)EPackage.Registry.INSTANCE.getEFactory(CoffeeModelingPackage.eNS_URI);
			if (theCoffeeModelingFactory != null) {
				return theCoffeeModelingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CoffeeModelingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoffeeModelingFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CoffeeModelingPackage.ORIGIN: return createOrigin();
			case CoffeeModelingPackage.PRODUCT_UNITY: return createProductUnity();
			case CoffeeModelingPackage.DEFECT: return createDefect();
			case CoffeeModelingPackage.PEOPLE: return createPeople();
			case CoffeeModelingPackage.PROCESS: return createProcess();
			case CoffeeModelingPackage.FEATURE: return createFeature();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Origin createOrigin() {
		OriginImpl origin = new OriginImpl();
		return origin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductUnity createProductUnity() {
		ProductUnityImpl productUnity = new ProductUnityImpl();
		return productUnity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Defect createDefect() {
		DefectImpl defect = new DefectImpl();
		return defect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public People createPeople() {
		PeopleImpl people = new PeopleImpl();
		return people;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoffeeModeling.Process createProcess() {
		ProcessImpl process = new ProcessImpl();
		return process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature createFeature() {
		FeatureImpl feature = new FeatureImpl();
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoffeeModelingPackage getCoffeeModelingPackage() {
		return (CoffeeModelingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CoffeeModelingPackage getPackage() {
		return CoffeeModelingPackage.eINSTANCE;
	}

} //CoffeeModelingFactoryImpl
