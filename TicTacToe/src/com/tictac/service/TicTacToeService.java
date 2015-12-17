package com.tictac.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.tictac.dao.TicTacToeDao;
import com.tictac.pojo.TicTacToe;


@Path("/TicTacService")
public class TicTacToeService
{
	TicTacToeDao ticTacDao = new TicTacToeDao();
	
	   @GET
	   @Path("/play/{cell}/{turn}")
	   @Produces(MediaType.APPLICATION_JSON)
	   public TicTacToe getUsers(@PathParam("cell") int cell, @PathParam("turn") int playerTurn){
		  TicTacToe ticTac =    ticTacDao.processGame(cell, playerTurn);
	      return ticTac;
	  }	
}
