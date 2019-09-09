package com.facundo.ws.exceptions;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.codehaus.jackson.JsonParseException;

@Provider
public class JsonParseExceptionMapper implements ExceptionMapper<JsonParseException> {
	
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Response toResponse(JsonParseException exception) {
		return Response.status(404).entity(exception.getMessage())
		        .type("text/plain").build();		
	}

	
	}
	
