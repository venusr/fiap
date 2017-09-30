package br.com.fiap.rs.exeplos;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("exemplo")
public class OlaWeb {
   
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String ola() {
	   return "Ola meu amigo";
    }
	
	
	@GET
	@Path("/vamos")
	@Produces(MediaType.TEXT_PLAIN)
	public String tudobem() {
		return "tudo bem";
	}
	
	@GET
	@Path("/saudacao/{nome}")
	@Produces(MediaType.TEXT_PLAIN)
    public String saudacao(@PathParam("nome") String nome) {
		return "boa tarde" + nome;
	}
	
	
}
