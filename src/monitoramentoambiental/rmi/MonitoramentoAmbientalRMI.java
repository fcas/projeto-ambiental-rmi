/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package monitoramentoambiental.rmi;

import br.ufrn.GUI.MonitorCidade;
import br.ufrn.controlers.InstanciaWidget;

/**
 *
 * @author Jorge
 */
public class MonitoramentoAmbientalRMI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MonitorCidade monitorCidade = MonitorCidade.getInstance();
        monitorCidade.setVisible(true);

        InstanciaWidget instanciaWidget = InstanciaWidget.getInstance();
    }
}