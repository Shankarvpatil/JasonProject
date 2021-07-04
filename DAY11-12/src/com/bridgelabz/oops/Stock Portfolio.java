package com.bridgelabz.programs;

public class StockPortfolio {

	private String name;	//name of the stock
	private int numberOfShares, price;	//share count and price of each share
	
	/**
	 * Constructor
	 * @param name - name of the stock
	 * @param numberOfShares - share count
	 * @param price - price of each share
	 */
	public StockPortfolio(String name , int numberOfShares, int price) {
		this.name = name;
		this.numberOfShares = numberOfShares;
		this.price = price;
	}
	
	
	/**
	 * @returns value of the all stocks
	 */
	public int getValue() {
		return numberOfShares * price;
	}
	
	/**
	 * @returns name of the stock
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @returns number of shares
	 */
	public int getNumberOfShares() {
		return numberOfShares;
	}
	
	/**
	 * @returns price of the each share
	 */
	public int getPrice() {
		return price;
	}
}
