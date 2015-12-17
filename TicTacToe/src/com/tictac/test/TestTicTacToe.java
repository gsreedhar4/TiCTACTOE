package com.tictac.test;

import java.net.URI;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import org.glassfish.jersey.client.ClientConfig;

public class TestTicTacToe {
	public static void main(String[] args)
	{		
		ClientConfig config = new ClientConfig();
	    Client client = ClientBuilder.newClient(config);
	    WebTarget service = client.target(getBaseURI());
	    
	    Response response = (Response) service.path("TicTacService").path("play").path("1").path("1").request(MediaType.APPLICATION_JSON);
		
		System.out.println(response.getStatus());
		
	}
	
	private static URI getBaseURI() {
	    return UriBuilder.fromUri("http://localhost:8080/TicTacToe/").build();
	  }
}
