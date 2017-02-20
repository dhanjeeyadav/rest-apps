package com.rest.project.code;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.rest.project.code.model.Timestamp;
import com.rest.project.code.util.ISO8601Util;

@Path("timestamp")
public class TimeResource {
	private static long requestCounter=1;
@GET
@Produces("application/json")
public Timestamp getTimestamp(){
	return new Timestamp(ISO8601Util.now(),requestCounter++);
}
}
