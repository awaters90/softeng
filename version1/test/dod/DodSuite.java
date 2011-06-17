/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dod;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author 20301065
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({dod.PlayerTest.class,dod.WorldTest.class,dod.DoDTest.class,dod.LocationTest.class})
public class DodSuite {

    /**
     * 
     * @throws Exception
     */
    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    /**
     *
     * @throws Exception
     */
    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    /**
     *
     * @throws Exception
     */
    @Before
    public void setUp() throws Exception {
    }

    /**
     *
     * @throws Exception
     */
    @After
    public void tearDown() throws Exception {
    }

}