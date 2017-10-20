package br.com.fiap.endpoint;

import javax.jws.WebService;
import br.com.fiap.endpoint.request.InvoiceRequest;
import br.com.fiap.endpoint.request.TaxRequest;
import br.com.fiap.endpoint.response.InvoiceResponse;
import br.com.fiap.endpoint.response.TaxResponse;

@WebService(serviceName = "Tax", portName = "TaxPort", targetNamespace = "http://br.com.fiap.government/", endpointInterface = "br.com.fiap.endpoint.TaxPort")
public class TaxPortImpl implements TaxPort {
	
	@Override
	public TaxResponse generate(TaxRequest body) {
		return new TaxResponse();
	}
}
