/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufrn.services;

/**
 *
 * @author Zeff
 */
public interface AtualizaMonitor {

    //Atualiza icones sobre poluicao
    public void attNivelPol(Integer area, String levelPollution);

    public void attFluxoVeiculos(Integer area, String vehicleFlow);

    public void attProbChuva(Integer area, String willRain);

    public void attChuvaAcida(Integer area, String localAcidRain, String directionWind);

    public void attQuantRuido(Integer area, String noise, Integer db);

    //atualiza icones sobre temperatura
    public void attTemp(Integer area, Integer temperature);

    public void attClimaBom(Integer area, String clima);

    public void attIncidIncendio(Integer area, String isFire);

    public void attClimaQuenteSeco(Integer area, String hotDry);

    //atualizar icones sobre o lixo
    public void attQuantLixo(Integer area, String content);

    public void attAgenteProx(Integer area, String status, String agentNearName, Integer agentDistance);
}