package com.example.endpoint;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;

@Component
@Path("/v0")
public class RESTDemoEndpoint {

	@GET
	@Path("/provider")
	@Produces(MediaType.APPLICATION_JSON)
	public Object provider(@Context HttpHeaders httpHeaders) {

		return new Greeting("hello world from provider");
	}

	public class Greeting {
		String greeting;
		Greeting(String greeting){
			this.greeting = greeting;
		}
		public String getGreeting(){
			return greeting;
		}
		public void setGreeting(String greeting){
			this.greeting = greeting;
		}
	}

}



