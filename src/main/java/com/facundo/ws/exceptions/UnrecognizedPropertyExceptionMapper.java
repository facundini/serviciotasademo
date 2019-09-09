package com.facundo.ws.exceptions;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.codehaus.jackson.map.exc.UnrecognizedPropertyException;

@Provider
public class UnrecognizedPropertyExceptionMapper implements ExceptionMapper<UnrecognizedPropertyException>{

		public Response toResponse(UnrecognizedPropertyException exception) {
			return Response.status(404).entity(exception.getMessage())
			        .type("text/plain").build();		
		
	}
}
