package br.com.fiap.exemplo.ws;

import javax.xml.ws.Endpoint;

public class PublicaService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
					HelloWeb service = new HelloWeb();
			Endpoint endpoint = Endpoint.publish("http://localhost:8080/hello", service);
		
	}

}
