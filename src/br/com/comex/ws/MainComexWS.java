package br.com.comex.ws;

import javax.xml.ws.Endpoint;

public class MainComexWS {

	public static void main(String[] args) {
		ComexWS servico = new ComexWS();
		//String url = "http://localhost:8080/comexws"; ?
		//String url = "http://172.17.0.2:8080/comexws"; ?
		String url = "http://0.0.0.0:8080/comexws";
		System.out.println("ComexWS Rodando em: " +url);
		
		Endpoint.publish(url, servico);
	}
}

