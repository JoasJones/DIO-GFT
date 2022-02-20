package com.dio.base;



public class Order {
	
	private final String code;
	private final double totalValue;
	
	private String[] itens;
	
	public Order(String code, double totalValue) {
		this.code = code;
		this.totalValue = totalValue;
		
	}
	
	
	public void printItens() {
		for (String i: itens) {
			System.out.print(i);
		}
			
		
	}
	
	/*
	public void printItens() {
		for (int i = 0; i<itens.length; i++) {
			System.out.print(itens[i]);
		}
			
		
	}
	
	
	public void printItens() {
		int i = 0;
		
		do {
			System.out.println(itens[i]);
			i++;
		}while(i< itens.length);
			
		
	}
	
	
	public void printItens() {
		int i = 0;
		while (i< itens.length) {
			System.out.print(itens[i]);
			i++;
		}
		
	}
	
	@Override
	public String toString() {
		return "Order={"
				+ "code='" +  code +"'" +
				"}";
	}

	
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
