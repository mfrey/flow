/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package owl.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

import rdfs.tests.RdfsTests;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>Owl</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class OwlAllTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new OwlAllTests("Owl Tests");
		suite.addTest(OwlTests.suite());
		suite.addTest(RdfsTests.suite());
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwlAllTests(String name) {
		super(name);
	}

} //OwlAllTests
