/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufrn.services;

import br.ufrn.controlers.AttWidgetsRMI;
import context.arch.enactor.Enactor;
import context.arch.enactor.EnactorXmlParser;
import context.arch.widget.Widget;
import context.arch.widget.WidgetXmlParser;
import java.rmi.RemoteException;

/**
 *
 * @author Jorge
 */
public class MonitoramentoArea implements AttWidgetsRMI {

    private Widget areaIN;
    private Enactor areaEnactor;

    public MonitoramentoArea(Integer area) {

        areaIN = WidgetXmlParser.createWidget("Informa/area-widget-input_" + area.toString() + ".xml");

        areaIN.updateData("area", area);
        areaIN.updateData("indexPollution", -100);
        areaIN.updateData("vehicleFlow", -100);
        areaIN.updateData("directionWind", "norte");
        areaIN.updateData("willRain", -100);
        areaIN.updateData("noise", -100);
        areaIN.updateData("temperature", -300);
        areaIN.updateData("humidity", -100);
        areaIN.updateData("windSpeed", -100);
        areaIN.updateData("content", -100);
        areaIN.updateData("agentNearName", "agente 1");
        areaIN.updateData("agentDistance", -100);

        //Enactors
        areaEnactor = EnactorXmlParser.createEnactor("Informa/area-enactor_" + area.toString() + ".xml");

    }

    @Override
    public void attQuantLixo(Integer area, Integer content) {
        areaIN.updateData("content", content);
    }

    @Override
    public void attAgenteProx(Integer area, String agentNearName) {
        areaIN.updateData("agentNearName", agentNearName);
    }

    @Override
    public void attIndicePol(Integer area, Integer indexPolluition) {
        areaIN.updateData("indexPollution", indexPolluition);
    }

    @Override
    public void attFluxoVeiculos(Integer area, Integer vehicleFlow) {
        areaIN.updateData("vehicleFlow", vehicleFlow);
    }

    @Override
    public void attVelVento(Integer area, Integer windSpeed) {
        areaIN.updateData("windSpeed", windSpeed);
    }

    @Override
    public void attdirVento(Integer area, String directionWind) {
        areaIN.updateData("directionWind", directionWind);
    }

    @Override
    public void attProbChuva(Integer area, Integer willRain) {
        areaIN.updateData("willRain", willRain);
    }

    @Override
    public void attQuantRuido(Integer area, Integer noise) {
        areaIN.updateData("noise", noise);
    }

    @Override
    public void attTemp(Integer area, Integer temperature) {
        areaIN.updateData("temperature", temperature);
    }

    @Override
    public void attHumid(Integer area, Integer humidity) {
        areaIN.updateData("humidity", humidity);
    }

    @Override
    public void attIncidIncendio(Integer area, Integer isFire) {
        areaIN.updateData("isFire", isFire);
        System.out.println("======== atualizando fogo =======");
    }

    @Override
    public void attDistAgente(Integer area, Integer agentDistance) throws RemoteException {
        areaIN.updateData("agentDistance", agentDistance);
    }
}