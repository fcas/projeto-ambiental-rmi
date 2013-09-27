/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufrn.publish;

import com.sun.corba.se.impl.protocol.giopmsgheaders.Message;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class Publish {
    
    
    
    private Client client = Client.create();
    private static String URL_BASE_HUB = "http://127.0.0.1:8080/hub/";
    private String topico;
    private String oldmessage = "";

    public Publish(String topico) {
        this.topico = topico;
    }

    public String getTopico() {
        return topico;
    }
    
    
    public void criarTopico(){
        WebResource resource = client.resource(URL_BASE_HUB+"register");
        resource.put(topico);
    }
    
    public void publicar(String mensagem){
        if(!mensagem.equals(oldmessage)){
        WebResource resource = client.resource(URL_BASE_HUB+"publish/"+topico);
        resource.put(mensagem);
        oldmessage = mensagem;
        }
    }
    
    
}
