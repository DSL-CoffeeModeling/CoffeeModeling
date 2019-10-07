/**
 */
package CoffeeModeling;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see CoffeeModeling.CoffeeModelingFactory
 * @model kind="package"
 * @generated
 */
public interface CoffeeModelingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "CoffeeModeling";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/CoffeeModeling";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "CoffeeModeling";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CoffeeModelingPackage eINSTANCE = CoffeeModeling.impl.CoffeeModelingPackageImpl.init();

	/**
	 * The meta object id for the '{@link CoffeeModeling.impl.OriginImpl <em>Origin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CoffeeModeling.impl.OriginImpl
	 * @see CoffeeModeling.impl.CoffeeModelingPackageImpl#getOrigin()
	 * @generated
	 */
	int ORIGIN = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGIN__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGIN__NAME = 1;

	/**
	 * The feature id for the '<em><b>Average altitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGIN__AVERAGE_ALTITUDE = 2;

	/**
	 * The feature id for the '<em><b>Average latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGIN__AVERAGE_LATITUDE = 3;

	/**
	 * The feature id for the '<em><b>Average longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGIN__AVERAGE_LONGITUDE = 4;

	/**
	 * The feature id for the '<em><b>Anual production</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGIN__ANUAL_PRODUCTION = 5;

	/**
	 * The feature id for the '<em><b>Average temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGIN__AVERAGE_TEMPERATURE = 6;

	/**
	 * The feature id for the '<em><b>Assortment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGIN__ASSORTMENT = 7;

	/**
	 * The feature id for the '<em><b>Details</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGIN__DETAILS = 8;

	/**
	 * The number of structural features of the '<em>Origin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGIN_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Origin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CoffeeModeling.impl.ProductUnityImpl <em>Product Unity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CoffeeModeling.impl.ProductUnityImpl
	 * @see CoffeeModeling.impl.CoffeeModelingPackageImpl#getProductUnity()
	 * @generated
	 */
	int PRODUCT_UNITY = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_UNITY__ID = 0;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_UNITY__STATE = 1;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_UNITY__DESCRIPCION = 2;

	/**
	 * The feature id for the '<em><b>Defect</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_UNITY__DEFECT = 3;

	/**
	 * The feature id for the '<em><b>Register</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_UNITY__REGISTER = 4;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_UNITY__ORIGIN = 5;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_UNITY__FEATURE = 6;

	/**
	 * The number of structural features of the '<em>Product Unity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_UNITY_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Product Unity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_UNITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CoffeeModeling.impl.DefectImpl <em>Defect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CoffeeModeling.impl.DefectImpl
	 * @see CoffeeModeling.impl.CoffeeModelingPackageImpl#getDefect()
	 * @generated
	 */
	int DEFECT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFECT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFECT__ID = 1;

	/**
	 * The number of structural features of the '<em>Defect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFECT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Defect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CoffeeModeling.impl.PeopleImpl <em>People</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CoffeeModeling.impl.PeopleImpl
	 * @see CoffeeModeling.impl.CoffeeModelingPackageImpl#getPeople()
	 * @generated
	 */
	int PEOPLE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEOPLE__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEOPLE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Birthdate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEOPLE__BIRTHDATE = 2;

	/**
	 * The feature id for the '<em><b>Experience years</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEOPLE__EXPERIENCE_YEARS = 3;

	/**
	 * The feature id for the '<em><b>Entailment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEOPLE__ENTAILMENT = 4;

	/**
	 * The feature id for the '<em><b>Special population</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEOPLE__SPECIAL_POPULATION = 5;

	/**
	 * The number of structural features of the '<em>People</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEOPLE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>People</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEOPLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CoffeeModeling.impl.ProcessImpl <em>Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CoffeeModeling.impl.ProcessImpl
	 * @see CoffeeModeling.impl.CoffeeModelingPackageImpl#getProcess()
	 * @generated
	 */
	int PROCESS = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__ID = 0;

	/**
	 * The feature id for the '<em><b>Date init</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__DATE_INIT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__NAME = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Date end</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__DATE_END = 4;

	/**
	 * The feature id for the '<em><b>People</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__PEOPLE = 5;

	/**
	 * The number of structural features of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CoffeeModeling.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CoffeeModeling.impl.FeatureImpl
	 * @see CoffeeModeling.impl.CoffeeModelingPackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__VALUE = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__DESCRIPTION = 3;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link CoffeeModeling.Origin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Origin</em>'.
	 * @see CoffeeModeling.Origin
	 * @generated
	 */
	EClass getOrigin();

	/**
	 * Returns the meta object for the attribute '{@link CoffeeModeling.Origin#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see CoffeeModeling.Origin#getId()
	 * @see #getOrigin()
	 * @generated
	 */
	EAttribute getOrigin_Id();

	/**
	 * Returns the meta object for the attribute '{@link CoffeeModeling.Origin#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see CoffeeModeling.Origin#getName()
	 * @see #getOrigin()
	 * @generated
	 */
	EAttribute getOrigin_Name();

	/**
	 * Returns the meta object for the attribute '{@link CoffeeModeling.Origin#getAverage_altitude <em>Average altitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Average altitude</em>'.
	 * @see CoffeeModeling.Origin#getAverage_altitude()
	 * @see #getOrigin()
	 * @generated
	 */
	EAttribute getOrigin_Average_altitude();

	/**
	 * Returns the meta object for the attribute '{@link CoffeeModeling.Origin#getAverage_latitude <em>Average latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Average latitude</em>'.
	 * @see CoffeeModeling.Origin#getAverage_latitude()
	 * @see #getOrigin()
	 * @generated
	 */
	EAttribute getOrigin_Average_latitude();

	/**
	 * Returns the meta object for the attribute '{@link CoffeeModeling.Origin#getAverage_longitude <em>Average longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Average longitude</em>'.
	 * @see CoffeeModeling.Origin#getAverage_longitude()
	 * @see #getOrigin()
	 * @generated
	 */
	EAttribute getOrigin_Average_longitude();

	/**
	 * Returns the meta object for the attribute '{@link CoffeeModeling.Origin#getAnual_production <em>Anual production</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anual production</em>'.
	 * @see CoffeeModeling.Origin#getAnual_production()
	 * @see #getOrigin()
	 * @generated
	 */
	EAttribute getOrigin_Anual_production();

	/**
	 * Returns the meta object for the attribute '{@link CoffeeModeling.Origin#getAverage_temperature <em>Average temperature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Average temperature</em>'.
	 * @see CoffeeModeling.Origin#getAverage_temperature()
	 * @see #getOrigin()
	 * @generated
	 */
	EAttribute getOrigin_Average_temperature();

	/**
	 * Returns the meta object for the attribute '{@link CoffeeModeling.Origin#getAssortment <em>Assortment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assortment</em>'.
	 * @see CoffeeModeling.Origin#getAssortment()
	 * @see #getOrigin()
	 * @generated
	 */
	EAttribute getOrigin_Assortment();

	/**
	 * Returns the meta object for the attribute '{@link CoffeeModeling.Origin#getDetails <em>Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Details</em>'.
	 * @see CoffeeModeling.Origin#getDetails()
	 * @see #getOrigin()
	 * @generated
	 */
	EAttribute getOrigin_Details();

	/**
	 * Returns the meta object for class '{@link CoffeeModeling.ProductUnity <em>Product Unity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Unity</em>'.
	 * @see CoffeeModeling.ProductUnity
	 * @generated
	 */
	EClass getProductUnity();

	/**
	 * Returns the meta object for the attribute '{@link CoffeeModeling.ProductUnity#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see CoffeeModeling.ProductUnity#getId()
	 * @see #getProductUnity()
	 * @generated
	 */
	EAttribute getProductUnity_Id();

	/**
	 * Returns the meta object for the attribute '{@link CoffeeModeling.ProductUnity#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see CoffeeModeling.ProductUnity#getState()
	 * @see #getProductUnity()
	 * @generated
	 */
	EAttribute getProductUnity_State();

	/**
	 * Returns the meta object for the attribute '{@link CoffeeModeling.ProductUnity#getDescripcion <em>Descripcion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descripcion</em>'.
	 * @see CoffeeModeling.ProductUnity#getDescripcion()
	 * @see #getProductUnity()
	 * @generated
	 */
	EAttribute getProductUnity_Descripcion();

	/**
	 * Returns the meta object for the containment reference list '{@link CoffeeModeling.ProductUnity#getDefect <em>Defect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Defect</em>'.
	 * @see CoffeeModeling.ProductUnity#getDefect()
	 * @see #getProductUnity()
	 * @generated
	 */
	EReference getProductUnity_Defect();

	/**
	 * Returns the meta object for the containment reference list '{@link CoffeeModeling.ProductUnity#getRegister <em>Register</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Register</em>'.
	 * @see CoffeeModeling.ProductUnity#getRegister()
	 * @see #getProductUnity()
	 * @generated
	 */
	EReference getProductUnity_Register();

	/**
	 * Returns the meta object for the containment reference '{@link CoffeeModeling.ProductUnity#getOrigin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Origin</em>'.
	 * @see CoffeeModeling.ProductUnity#getOrigin()
	 * @see #getProductUnity()
	 * @generated
	 */
	EReference getProductUnity_Origin();

	/**
	 * Returns the meta object for the containment reference list '{@link CoffeeModeling.ProductUnity#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feature</em>'.
	 * @see CoffeeModeling.ProductUnity#getFeature()
	 * @see #getProductUnity()
	 * @generated
	 */
	EReference getProductUnity_Feature();

	/**
	 * Returns the meta object for class '{@link CoffeeModeling.Defect <em>Defect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Defect</em>'.
	 * @see CoffeeModeling.Defect
	 * @generated
	 */
	EClass getDefect();

	/**
	 * Returns the meta object for the attribute '{@link CoffeeModeling.Defect#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see CoffeeModeling.Defect#getName()
	 * @see #getDefect()
	 * @generated
	 */
	EAttribute getDefect_Name();

	/**
	 * Returns the meta object for the attribute '{@link CoffeeModeling.Defect#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see CoffeeModeling.Defect#getId()
	 * @see #getDefect()
	 * @generated
	 */
	EAttribute getDefect_Id();

	/**
	 * Returns the meta object for class '{@link CoffeeModeling.People <em>People</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>People</em>'.
	 * @see CoffeeModeling.People
	 * @generated
	 */
	EClass getPeople();

	/**
	 * Returns the meta object for the attribute '{@link CoffeeModeling.People#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see CoffeeModeling.People#getId()
	 * @see #getPeople()
	 * @generated
	 */
	EAttribute getPeople_Id();

	/**
	 * Returns the meta object for the attribute '{@link CoffeeModeling.People#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see CoffeeModeling.People#getName()
	 * @see #getPeople()
	 * @generated
	 */
	EAttribute getPeople_Name();

	/**
	 * Returns the meta object for the attribute '{@link CoffeeModeling.People#getBirthdate <em>Birthdate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Birthdate</em>'.
	 * @see CoffeeModeling.People#getBirthdate()
	 * @see #getPeople()
	 * @generated
	 */
	EAttribute getPeople_Birthdate();

	/**
	 * Returns the meta object for the attribute '{@link CoffeeModeling.People#getExperience_years <em>Experience years</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Experience years</em>'.
	 * @see CoffeeModeling.People#getExperience_years()
	 * @see #getPeople()
	 * @generated
	 */
	EAttribute getPeople_Experience_years();

	/**
	 * Returns the meta object for the attribute '{@link CoffeeModeling.People#getEntailment <em>Entailment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entailment</em>'.
	 * @see CoffeeModeling.People#getEntailment()
	 * @see #getPeople()
	 * @generated
	 */
	EAttribute getPeople_Entailment();

	/**
	 * Returns the meta object for the attribute '{@link CoffeeModeling.People#getSpecial_population <em>Special population</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Special population</em>'.
	 * @see CoffeeModeling.People#getSpecial_population()
	 * @see #getPeople()
	 * @generated
	 */
	EAttribute getPeople_Special_population();

	/**
	 * Returns the meta object for class '{@link CoffeeModeling.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process</em>'.
	 * @see CoffeeModeling.Process
	 * @generated
	 */
	EClass getProcess();

	/**
	 * Returns the meta object for the attribute '{@link CoffeeModeling.Process#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see CoffeeModeling.Process#getId()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_Id();

	/**
	 * Returns the meta object for the attribute '{@link CoffeeModeling.Process#getDate_init <em>Date init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date init</em>'.
	 * @see CoffeeModeling.Process#getDate_init()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_Date_init();

	/**
	 * Returns the meta object for the attribute '{@link CoffeeModeling.Process#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see CoffeeModeling.Process#getName()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_Name();

	/**
	 * Returns the meta object for the attribute '{@link CoffeeModeling.Process#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see CoffeeModeling.Process#getDescription()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_Description();

	/**
	 * Returns the meta object for the attribute '{@link CoffeeModeling.Process#getDate_end <em>Date end</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date end</em>'.
	 * @see CoffeeModeling.Process#getDate_end()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_Date_end();

	/**
	 * Returns the meta object for the containment reference list '{@link CoffeeModeling.Process#getPeople <em>People</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>People</em>'.
	 * @see CoffeeModeling.Process#getPeople()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_People();

	/**
	 * Returns the meta object for class '{@link CoffeeModeling.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see CoffeeModeling.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for the attribute '{@link CoffeeModeling.Feature#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see CoffeeModeling.Feature#getId()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Id();

	/**
	 * Returns the meta object for the attribute '{@link CoffeeModeling.Feature#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see CoffeeModeling.Feature#getName()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Name();

	/**
	 * Returns the meta object for the attribute '{@link CoffeeModeling.Feature#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see CoffeeModeling.Feature#getValue()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Value();

	/**
	 * Returns the meta object for the attribute '{@link CoffeeModeling.Feature#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see CoffeeModeling.Feature#getDescription()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Description();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CoffeeModelingFactory getCoffeeModelingFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link CoffeeModeling.impl.OriginImpl <em>Origin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CoffeeModeling.impl.OriginImpl
		 * @see CoffeeModeling.impl.CoffeeModelingPackageImpl#getOrigin()
		 * @generated
		 */
		EClass ORIGIN = eINSTANCE.getOrigin();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORIGIN__ID = eINSTANCE.getOrigin_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORIGIN__NAME = eINSTANCE.getOrigin_Name();

		/**
		 * The meta object literal for the '<em><b>Average altitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORIGIN__AVERAGE_ALTITUDE = eINSTANCE.getOrigin_Average_altitude();

		/**
		 * The meta object literal for the '<em><b>Average latitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORIGIN__AVERAGE_LATITUDE = eINSTANCE.getOrigin_Average_latitude();

		/**
		 * The meta object literal for the '<em><b>Average longitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORIGIN__AVERAGE_LONGITUDE = eINSTANCE.getOrigin_Average_longitude();

		/**
		 * The meta object literal for the '<em><b>Anual production</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORIGIN__ANUAL_PRODUCTION = eINSTANCE.getOrigin_Anual_production();

		/**
		 * The meta object literal for the '<em><b>Average temperature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORIGIN__AVERAGE_TEMPERATURE = eINSTANCE.getOrigin_Average_temperature();

		/**
		 * The meta object literal for the '<em><b>Assortment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORIGIN__ASSORTMENT = eINSTANCE.getOrigin_Assortment();

		/**
		 * The meta object literal for the '<em><b>Details</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORIGIN__DETAILS = eINSTANCE.getOrigin_Details();

		/**
		 * The meta object literal for the '{@link CoffeeModeling.impl.ProductUnityImpl <em>Product Unity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CoffeeModeling.impl.ProductUnityImpl
		 * @see CoffeeModeling.impl.CoffeeModelingPackageImpl#getProductUnity()
		 * @generated
		 */
		EClass PRODUCT_UNITY = eINSTANCE.getProductUnity();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_UNITY__ID = eINSTANCE.getProductUnity_Id();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_UNITY__STATE = eINSTANCE.getProductUnity_State();

		/**
		 * The meta object literal for the '<em><b>Descripcion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_UNITY__DESCRIPCION = eINSTANCE.getProductUnity_Descripcion();

		/**
		 * The meta object literal for the '<em><b>Defect</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_UNITY__DEFECT = eINSTANCE.getProductUnity_Defect();

		/**
		 * The meta object literal for the '<em><b>Register</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_UNITY__REGISTER = eINSTANCE.getProductUnity_Register();

		/**
		 * The meta object literal for the '<em><b>Origin</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_UNITY__ORIGIN = eINSTANCE.getProductUnity_Origin();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_UNITY__FEATURE = eINSTANCE.getProductUnity_Feature();

		/**
		 * The meta object literal for the '{@link CoffeeModeling.impl.DefectImpl <em>Defect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CoffeeModeling.impl.DefectImpl
		 * @see CoffeeModeling.impl.CoffeeModelingPackageImpl#getDefect()
		 * @generated
		 */
		EClass DEFECT = eINSTANCE.getDefect();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFECT__NAME = eINSTANCE.getDefect_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFECT__ID = eINSTANCE.getDefect_Id();

		/**
		 * The meta object literal for the '{@link CoffeeModeling.impl.PeopleImpl <em>People</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CoffeeModeling.impl.PeopleImpl
		 * @see CoffeeModeling.impl.CoffeeModelingPackageImpl#getPeople()
		 * @generated
		 */
		EClass PEOPLE = eINSTANCE.getPeople();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PEOPLE__ID = eINSTANCE.getPeople_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PEOPLE__NAME = eINSTANCE.getPeople_Name();

		/**
		 * The meta object literal for the '<em><b>Birthdate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PEOPLE__BIRTHDATE = eINSTANCE.getPeople_Birthdate();

		/**
		 * The meta object literal for the '<em><b>Experience years</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PEOPLE__EXPERIENCE_YEARS = eINSTANCE.getPeople_Experience_years();

		/**
		 * The meta object literal for the '<em><b>Entailment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PEOPLE__ENTAILMENT = eINSTANCE.getPeople_Entailment();

		/**
		 * The meta object literal for the '<em><b>Special population</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PEOPLE__SPECIAL_POPULATION = eINSTANCE.getPeople_Special_population();

		/**
		 * The meta object literal for the '{@link CoffeeModeling.impl.ProcessImpl <em>Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CoffeeModeling.impl.ProcessImpl
		 * @see CoffeeModeling.impl.CoffeeModelingPackageImpl#getProcess()
		 * @generated
		 */
		EClass PROCESS = eINSTANCE.getProcess();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS__ID = eINSTANCE.getProcess_Id();

		/**
		 * The meta object literal for the '<em><b>Date init</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS__DATE_INIT = eINSTANCE.getProcess_Date_init();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS__NAME = eINSTANCE.getProcess_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS__DESCRIPTION = eINSTANCE.getProcess_Description();

		/**
		 * The meta object literal for the '<em><b>Date end</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS__DATE_END = eINSTANCE.getProcess_Date_end();

		/**
		 * The meta object literal for the '<em><b>People</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__PEOPLE = eINSTANCE.getProcess_People();

		/**
		 * The meta object literal for the '{@link CoffeeModeling.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CoffeeModeling.impl.FeatureImpl
		 * @see CoffeeModeling.impl.CoffeeModelingPackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__ID = eINSTANCE.getFeature_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__NAME = eINSTANCE.getFeature_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__VALUE = eINSTANCE.getFeature_Value();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__DESCRIPTION = eINSTANCE.getFeature_Description();

	}

} //CoffeeModelingPackage
