package com.tictac.dao;

import com.tictac.pojo.TicTacToe;

public class TicTacToeDao 
{
	static String[] dashBoard = new String[9];
	static int turn = 0;
	
	public TicTacToe processGame(int cell, int playerTurn)
	{
		TicTacToe ticTac = new TicTacToe();
		ticTac.setCellId(cell);
		if(dashBoard[cell-1] == null)
		{
			ticTac.setCellOccupied(false);
			if(turn%2==0){
				dashBoard[cell-1] = "X";
				ticTac.setPlayerId("1");
			}
			else
			{
				dashBoard[cell-1] = "O";
				ticTac.setPlayerId("2");
			}
			turn ++;
		    checkForWinner(dashBoard[cell-1], ticTac);		    
		}
		else
		{
			ticTac.setCellOccupied(true);
			ticTac.setMessage("Cell already occupied");
		}		
		
		return ticTac;
	}
	
	
	public void checkForWinner(String mark, TicTacToe ticTac)
	{
		int[][] winningCombinations = {{0,1,2},{3,4,5},{6,7,8},{0,3,6},{1,4,7},{2,5,8},{0,4,8},{2,4,6}};
		for(int i = 0; i < winningCombinations.length; i++)
		{
			if(dashBoard[winningCombinations[i][0]]==mark && dashBoard[winningCombinations[i][1]]==mark &&dashBoard[winningCombinations[i][2]]==mark)
			{
				dashBoard = new String[9];
				ticTac.setMessage("Player "+mark+" WON !!"); 
				ticTac.setGameOver(true);
			}			
		}
		boolean isFilled = true;
		if(!ticTac.isGameOver())
		{
			for(int i=0; i<dashBoard.length;i++ )
			{
				if(dashBoard[i] == null)
				{
					isFilled =false;
				}
			}
			if(isFilled)
			{
				dashBoard = new String[9];
				ticTac.setMessage("Tie!!!!"); 
				ticTac.setGameOver(true);
			}
			else
			{
				ticTac.setGameOver(false);
			}
		}		
	}
}
