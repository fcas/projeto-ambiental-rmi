/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import br.ufrn.GUI.MonitorCidade;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author felipe
 */
public class NewEmptyJUnitTest {
    MonitorCidade m = new MonitorCidade();
    
    public NewEmptyJUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testSubscriber(){
        m.attNivelPol(1, "BOA");
        m.attNivelPol(2, "BOA");
        m.attNivelPol(3, "BOA");
        m.attNivelPol(4, "BOA");
        m.attNivelPol(1, "REGULAR");
        m.attNivelPol(2, "REGULAR");
        m.attNivelPol(3, "REGULAR");
        m.attNivelPol(4, "REGULAR");
        m.attNivelPol(1, "INADEQUADA");
        m.attNivelPol(2, "INADEQUADA");
        m.attNivelPol(3, "INADEQUADA");
        m.attNivelPol(4, "INADEQUADA");
        m.attNivelPol(1, "MA");
        m.attNivelPol(2, "MA");
        m.attNivelPol(3, "MA");
        m.attNivelPol(4, "MA");
        m.attNivelPol(1, "PESSIMA");
        m.attNivelPol(2, "PESSIMA");
        m.attNivelPol(3, "PESSIMA");
        m.attNivelPol(4, "PESSIMA");
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}