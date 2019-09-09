package com.facundo.ws.exceptions;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;


@Provider
public class NullPointerExceptionMapper implements ExceptionMapper<NullPointerException> {

	public Response toResponse(NullPointerException exception) {
		return Response.status(404).entity(exception.getMessage())
		        .type("text/plain").build();		
	
}

}
