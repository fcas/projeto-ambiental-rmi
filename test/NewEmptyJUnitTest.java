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
        
        m.attFluxoVeiculos(1, "TRAFEGO_ON");
        m.attFluxoVeiculos(2, "TRAFEGO_ON");
        m.attFluxoVeiculos(3, "TRAFEGO_ON");
        m.attFluxoVeiculos(4, "TRAFEGO_ON");
        m.attFluxoVeiculos(1, "TRAFEGO_OFF");
        m.attFluxoVeiculos(2, "TRAFEGO_OFF");
        m.attFluxoVeiculos(3, "TRAFEGO_OFF");
        m.attFluxoVeiculos(4, "TRAFEGO_OFF");
        
        m.attProbChuva(1, "RAIN_ON");
        m.attProbChuva(2, "RAIN_ON");
        m.attProbChuva(3, "RAIN_ON");
        m.attProbChuva(4, "RAIN_ON");
        m.attProbChuva(1, "RAIN_OFF");
        m.attProbChuva(2, "RAIN_OFF");
        m.attProbChuva(3, "RAIN_OFF");
        m.attProbChuva(4, "RAIN_OFF");
        
        m.attChuvaAcida(1, "AQUI", "south");
        m.attChuvaAcida(2, "AQUI", "south");
        m.attChuvaAcida(3, "AQUI", "south");
        m.attChuvaAcida(4, "AQUI", "south");
        m.attChuvaAcida(1, "OUTRO", "south");
        m.attChuvaAcida(2, "OUTRO", "south");
        m.attChuvaAcida(3, "OUTRO", "south");
        m.attChuvaAcida(4, "OUTRO", "south");
        m.attChuvaAcida(1, "ACID_OFF", "south");
        m.attChuvaAcida(2, "ACID_OFF", "south");
        m.attChuvaAcida(3, "ACID_OFF", "south");
        m.attChuvaAcida(4, "ACID_OFF", "south");
        
        m.attQuantRuido(1, "NOISE_ON", 23);
        m.attQuantRuido(2, "NOISE_ON", 23);
        m.attQuantRuido(3, "NOISE_ON", 23);
        m.attQuantRuido(4, "NOISE_ON", 23);
        m.attQuantRuido(1, "NOISE_OFF", 23);
        m.attQuantRuido(2, "NOISE_OFF", 23);
        m.attQuantRuido(3, "NOISE_OFF", 23);
        m.attQuantRuido(4, "NOISE_OFF", 23);
        m.attQuantRuido(1, "NOISE_ON", 12);
        m.attQuantRuido(2, "NOISE_ON", 12);
        m.attQuantRuido(3, "NOISE_ON", 12);
        m.attQuantRuido(4, "NOISE_ON", 12);
        m.attQuantRuido(1, "NOISE_OFF", 12);
        m.attQuantRuido(2, "NOISE_OFF", 12);
        m.attQuantRuido(3, "NOISE_OFF", 12);
        m.attQuantRuido(4, "NOISE_OFF", 12);
        
        m.attTemp(1, 10);
        m.attTemp(1, 20);
        m.attTemp(1, 30);
        m.attTemp(1, 40);
        m.attTemp(1, 50);
        m.attTemp(2, 10);
        m.attTemp(2, 20);
        m.attTemp(2, 30);
        m.attTemp(2, 40);
        m.attTemp(2, 50);
        m.attTemp(3, 10);
        m.attTemp(3, 20);
        m.attTemp(3, 30);
        m.attTemp(3, 40);
        m.attTemp(3, 50);
        m.attTemp(4, 10);
        m.attTemp(4, 20);
        m.attTemp(4, 30);
        m.attTemp(4, 40);
        m.attTemp(4, 50);
        
        m.attClimaBom(1, "BEAUTIFUL_ON");
        m.attClimaBom(2, "BEAUTIFUL_ON");
        m.attClimaBom(3, "BEAUTIFUL_ON");
        m.attClimaBom(4, "BEAUTIFUL_ON");
        m.attClimaBom(1, "BEAUTIFUL_OFF");
        m.attClimaBom(2, "BEAUTIFUL_OFF");
        m.attClimaBom(3, "BEAUTIFUL_OFF");
        m.attClimaBom(4, "BEAUTIFUL_OFF");
        
        m.attIncidIncendio(1, "FIRE_ON");
        m.attIncidIncendio(2, "FIRE_ON");
        m.attIncidIncendio(3, "FIRE_ON");
        m.attIncidIncendio(4, "FIRE_ON");
        m.attIncidIncendio(1, "FIRE_OFF");
        m.attIncidIncendio(2, "FIRE_OFF");
        m.attIncidIncendio(3, "FIRE_OFF");
        m.attIncidIncendio(4, "FIRE_OFF");
        
        m.attClimaQuenteSeco(1, "HOTDRY_ON");
        m.attClimaQuenteSeco(2, "HOTDRY_ON");
        m.attClimaQuenteSeco(3, "HOTDRY_ON");
        m.attClimaQuenteSeco(4, "HOTDRY_ON");
        m.attClimaQuenteSeco(1, "HOTDRY_OFF");
        m.attClimaQuenteSeco(2, "HOTDRY_OFF");
        m.attClimaQuenteSeco(3, "HOTDRY_OFF");
        m.attClimaQuenteSeco(4, "HOTDRY_OFF");
        
        m.attQuantLixo(1, "VAZIA");
        m.attQuantLixo(2, "VAZIA");
        m.attQuantLixo(3, "VAZIA");
        m.attQuantLixo(4, "VAZIA");
        m.attQuantLixo(1, "ENCHENDO");
        m.attQuantLixo(2, "ENCHENDO");
        m.attQuantLixo(3, "ENCHENDO");
        m.attQuantLixo(4, "ENCHENDO");
        m.attQuantLixo(1, "CHEIA");
        m.attQuantLixo(2, "CHEIA");
        m.attQuantLixo(3, "CHEIA");
        m.attQuantLixo(4, "CHEIA");
        
        m.attAgenteProx(1, "LIMITE", "teste", 5);
        m.attAgenteProx(2, "LIMITE", "teste", 5);
        m.attAgenteProx(3, "LIMITE", "teste", 5);
        m.attAgenteProx(4, "LIMITE", "teste", 5);
        m.attAgenteProx(1, "GATHERING_ON", "teste", 5);
        m.attAgenteProx(2, "GATHERING_ON", "teste", 5);
        m.attAgenteProx(3, "GATHERING_ON", "teste", 5);
        m.attAgenteProx(4, "GATHERING_ON", "teste", 5);
        m.attAgenteProx(1, "GATHERING_OFF", "teste", 5);
        m.attAgenteProx(2, "GATHERING_OFF", "teste", 5);
        m.attAgenteProx(3, "GATHERING_OFF", "teste", 5);
        m.attAgenteProx(4, "GATHERING_OFF", "teste", 5);
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}