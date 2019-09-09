package com.facundo.ws.service;


import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.facundo.ws.rest.Consulta;



@Path("/")
public class ConsultaService {
	
	
	@POST
	@Path("/")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String consulta(Consulta consulta) {
	
		
		if(consulta.getMarca().equalsIgnoreCase("SQUA")) {
			consulta.setImporte(consulta.getImporte()*1.021);
			consulta.setTasa(Consulta.TASA_SQUA);
		}
		else if(consulta.getMarca().equalsIgnoreCase("SCO")) {
			consulta.setImporte(consulta.getImporte()*1.02);
			consulta.setTasa(Consulta.TASA_SCO);

		}
		else if(consulta.getMarca().equalsIgnoreCase("PERE")){
			consulta.setImporte(consulta.getImporte()*1.009);
			consulta.setTasa(Consulta.TASA_PERE);
		}
		else {
			return "Petición erronea";
		}
		
		
		
		String pattern = "{ \"marca\":\"%s\","
				+ "\"importe total\":\"%s\","
				+ "\"tasa\":%s}";
		   return String.format(pattern, consulta.getMarca(), consulta.getImporte(), consulta.getTasa());

	}
}
