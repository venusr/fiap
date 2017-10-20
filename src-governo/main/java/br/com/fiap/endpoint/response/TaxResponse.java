package br.com.fiap.endpoint.response;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.model.Tax;

public class TaxResponse {
	private List<Tax> taxes = new ArrayList<>();

	public List<Tax> getTaxes() {
		Tax tax1 = new Tax();
		tax1.setName("PIS");
		tax1.setPercent(2.0);
		taxes.add(tax1);
		
		Tax tax2 = new Tax();
		tax2.setName("COFINS");
		tax2.setPercent(4.0);
		taxes.add(tax2);

		Tax tax3 = new Tax();
		tax3.setName("ISS");
		tax3.setPercent(6.0);
		taxes.add(tax3);
		
		return taxes;
	}

	public void setTaxes(List<Tax> taxes) {
		this.taxes = taxes;
	}
	

	

	
}
