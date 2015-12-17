package com.tictac.pojo;

public class TicTacToe 
{

	private int cellId;
	//private boolean result;
	private String message;
	private boolean isGameOver;
	private boolean isCellOccupied;

	private String playerId;
	public int getCellId() {
		return cellId;
	}
	public void setCellId(int cellId) {
		this.cellId = cellId;
	}
	/*public boolean isResult() {
		return result;
	}
	public void setResult(boolean result) {
		this.result = result;
	}*/
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public boolean isGameOver() {
		return isGameOver;
	}
	public void setGameOver(boolean isGameOver) {
		this.isGameOver = isGameOver;
	}
	public String getPlayerId() {
		return playerId;
	}
	public void setPlayerId(String playerId) {
		this.playerId = playerId;
	}
	public boolean isCellOccupied() {
		return isCellOccupied;
	}
	public void setCellOccupied(boolean isCellOccupied) {
		this.isCellOccupied = isCellOccupied;
	}
	
}
