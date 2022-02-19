package com.dio.base;



public class Order {
	
	private final String code;
	private final double totalValue;
	
	public Order(String code, double totalValue) {
		this.code = code;
		this.totalValue = totalValue;
		
	}
	
	
	
	
	/*@Override
	public String toString() {
		return "Order={"
				+ "code='" +  code +"'" +
				"}";
	}
*/
	
	public double calculateFee() {
		 if(this.totalValue>100) {
			 return this.totalValue * 0.99;
			
		}else {
			return this.totalValue;
		}
	}
	/*
	 *função para o uso de switch case
	public double calculateFee2() {
		 switch (totalValue) {
		case 100: 
			return totalValue * 0.99;
		case 200:
			return totalValue * 1.99;
		default:
			return totalValue;
		}
		
	}
*/
}
