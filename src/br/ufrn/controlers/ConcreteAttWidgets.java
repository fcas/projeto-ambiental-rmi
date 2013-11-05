package br.ufrn.controlers;

import br.ufrn.services.MonitoramentoArea;
import java.net.MalformedURLException;
import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jorge
 */
public class ConcreteAttWidgets extends Register implements AttWidgetsRMI, AddAtualizadores {

    private HashMap<Integer, AttWidgetsRMI> areaWdgets = new HashMap<Integer, AttWidgetsRMI>();
    private static ConcreteAttWidgets atualizarWidgets;
    private static Integer port = 1029;
    public static String address = "rmi://localhost:" + port.toString() + "/Monitoramento";

    public static ConcreteAttWidgets getInstance() {

        if (atualizarWidgets == null) {
            try {
                atualizarWidgets = new ConcreteAttWidgets();
            } catch (RemoteException ex) {
                Logger.getLogger(ConcreteAttWidgets.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return atualizarWidgets;
    }

    public ConcreteAttWidgets() throws RemoteException {
        super(address, port);
        try {
            super.register();
        } catch (MalformedURLException ex) {
            Logger.getLogger(ConcreteAttWidgets.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //=====PollutionWidget=====
    @Override
    public void attIndicePol(Integer area, Integer indexPolluition) throws RemoteException {

        AttWidgetsRMI atualizar = areaWdgets.get(area);

        if (atualizar != null) {
            atualizar.attIndicePol(area, indexPolluition);
        } else {
            System.out.println("não existe um pollution widget associado à area " + area);
        }
    }

    @Override
    public void attFluxoVeiculos(Integer area, Integer vehicleFlow) throws RemoteException {
        AttWidgetsRMI atualizar = areaWdgets.get(area);

        if (atualizar != null) {
            atualizar.attFluxoVeiculos(area, vehicleFlow);
        } else {
            System.out.println("não existe um pollution widget associado à area " + area);
        }
    }

    //este metodo deve atualizar o PollutionWidget e o TemperatureWidget
    @Override
    public void attVelVento(Integer area, Integer windSpeed) throws RemoteException {
        AttWidgetsRMI atualizar = areaWdgets.get(area);

        if (atualizar != null) {
            atualizar.attVelVento(area, windSpeed);
        } else {
            System.out.println("não existe um pollution widget associado à area " + area);
        }

    }

    @Override
    public void attdirVento(Integer area, String directionWind) throws RemoteException {
        AttWidgetsRMI atualizar = areaWdgets.get(area);

        if (atualizar != null) {
            atualizar.attdirVento(area, directionWind);
        } else {
            System.out.println("não existe um pollution widget associado à area " + area);
        }

    }

    @Override
    public void attProbChuva(Integer area, Integer willRain) throws RemoteException {
        AttWidgetsRMI atualizar = areaWdgets.get(area);

        if (atualizar != null) {
            atualizar.attProbChuva(area, willRain);
        } else {
            System.out.println("não existe um pollution widget associado à area " + area);
        }
    }

    @Override
    public void attQuantRuido(Integer area, Integer noise) throws RemoteException {
        AttWidgetsRMI atualizar = areaWdgets.get(area);

        if (atualizar != null) {
            atualizar.attQuantRuido(area, noise);
        } else {
            System.out.println("não existe um pollution widget associado à area " + area);
        }
    }

    //======TemperatureWidget=====
    @Override
    public void attTemp(Integer area, Integer temperature) throws RemoteException {
        AttWidgetsRMI atualizar = areaWdgets.get(area);

        if (atualizar != null) {
            atualizar.attTemp(area, temperature);
        } else {
            System.out.println("não existe um pollution widget associado à area " + area);
        }
    }

    @Override
    public void attHumid(Integer area, Integer humidity) throws RemoteException {
        AttWidgetsRMI atualizar = areaWdgets.get(area);

        if (atualizar != null) {
            atualizar.attHumid(area, humidity);
        } else {
            System.out.println("não existe um pollution widget associado à area " + area);
        }
    }

    @Override
    public void attIncidIncendio(Integer area, Integer isFire) throws RemoteException {
        AttWidgetsRMI atualizar = areaWdgets.get(area);

        if (atualizar != null) {
            atualizar.attIncidIncendio(area, isFire);
        } else {
            System.out.println("não existe um pollution widget associado à area " + area);
        }
    }

    //=====DumpWidget===
    @Override
    public void attQuantLixo(Integer area, Integer content) throws RemoteException {
        AttWidgetsRMI atualizar = areaWdgets.get(area);

        if (atualizar != null) {
            atualizar.attQuantLixo(area, content);
        } else {
            System.out.println("não existe um areawidget associado à area " + area);
        }
    }

    @Override
    public void attAgenteProx(Integer area, String agentNearName) throws RemoteException {
        AttWidgetsRMI atualizar = areaWdgets.get(area);

        if (atualizar != null) {
            atualizar.attAgenteProx(area, agentNearName);
        } else {
            System.out.println("não existe um pollution widget associado à area " + area);
        }
    }

    @Override
    public void attDistAgente(Integer area, Integer agentDistance) throws RemoteException {
        AttWidgetsRMI atualizar = areaWdgets.get(area);

        if (atualizar != null) {
            atualizar.attDistAgente(area, agentDistance);
        } else {
            System.out.println("não existe um pollution widget associado à area " + area);
        }
    }

    @Override
    public void AddAtualizadoresWidgets(Integer area, AttWidgetsRMI atualizarWidgetsArea) {

        areaWdgets.put(area, atualizarWidgetsArea);

    }
}