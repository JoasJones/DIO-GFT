package com.dio.base;



public class Order {
	
	private final String code;
	private final double totalValue;
	
	public Order(String code, double totalValue) {
		this.code = code;
		this.totalValue = totalValue;
		
	}
	
	
	@Override
	public String toString() {
		return "Order={"
				+ "code='" +  code +"'" + "Valor: " +totalValue +
				"}";
	}

	
	public double calculateFee() {
		 if(this.totalValue>100) {
			 return this.totalValue * 0.99;
			
		}else {
			return this.totalValue;
		}
	}
	
	

}
