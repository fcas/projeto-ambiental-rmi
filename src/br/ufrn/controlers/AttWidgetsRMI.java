/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufrn.controlers;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Jorge
 */
public interface AttWidgetsRMI extends Remote {

    //=====PollutionWidget=====
    public void attIndicePol(Integer area, Integer indexPolluition) throws RemoteException;

    public void attFluxoVeiculos(Integer area, Integer vehicleFlow) throws RemoteException;

    //este metodo deve atualizar o PollutionWidget e o TemperatureWidget
    public void attVelVento(Integer area, Integer windSpeed) throws RemoteException;

    public void attdirVento(Integer area, String directionWind) throws RemoteException;

    public void attProbChuva(Integer area, Integer willRain) throws RemoteException;

    public void attQuantRuido(Integer area, Integer noise) throws RemoteException;

    //======TemperatureWidget=====
    public void attTemp(Integer area, Integer temperature) throws RemoteException;

    public void attHumid(Integer area, Integer humidity) throws RemoteException;

    public void attIncidIncendio(Integer area, Integer isFire) throws RemoteException;

    //=====DumpWidget===
    public void attQuantLixo(Integer area, Integer trash) throws RemoteException;

    public void attAgenteProx(Integer area, String agentNearName) throws RemoteException;

    public void attDistAgente(Integer area, Integer agentDistance) throws RemoteException;
}