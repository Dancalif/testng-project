/**
 * 
 */
package com.sqa.du.util.helper;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author dancalif
 *
 */
public class InfoTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Runs Before the Class executes - @BeforeClass");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Runs After the Class executes - @AfterClass");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		System.out.println("\tDo Setup for Test Method - @Before");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		System.out.println("\tDo Tear Down for Test Method - @After");
	}

	/**
	 * Test method for
	 * {@link com.sqa.jf.util.helper.Info#display2DInfo(java.lang.Object[][])}.
	 */
	@Test
	public void testDisplay2DInfo() {
		System.out.println("\t\tTest for display2DInfo - @Test");
	}

	/**
	 * Test method for
	 * {@link com.sqa.jf.util.helper.Info#displayInfo(java.lang.Object)}.
	 */
	@Test
	public void testDisplayInfoObject() {
		System.out.println("\t\tTest for displayInfoObject - @Test");
	}

	/**
	 * Test method for
	 * {@link com.sqa.jf.util.helper.Info#displayInfo(java.lang.Object[])}.
	 */
	@Test
	public void testDisplayInfoObjectArray() {
		System.out.println("\t\tTest for displayInfoObjectArray - @Test");
	}

	/**
	 * Test method for
	 * {@link com.sqa.jf.util.helper.Info#displayInfo(java.lang.Object, java.lang.Object, java.lang.Object[])}
	 * .
	 */
	@Test
	public void testDisplayInfoObjectObjectObjectArray() {
		System.out.println("\t\tTest for displayInfoObjectObjectObjectArray - @Test");
	}

	/**
	 * Test method for
	 * {@link com.sqa.jf.util.helper.Info#get2DInfo(java.lang.Object[][])}.
	 */
	@Test
	public void testGet2DInfo() {
		System.out.println("\t\tTest for get2DInfo - @Test");
	}

	/**
	 * Test method for
	 * {@link com.sqa.jf.util.helper.Info#getInfo(java.lang.Object)}.
	 */
	@Test
	public void testGetInfo() {
		System.out.println("\t\tTest for getInfo - @Test");
	}
}