package com.dio.base;

import java.math.BigDecimal;
import java.util.Formatter.BigDecimalLayoutForm;

/**
 * 
 * @author JOÁS JONES 
 * @version 1.0.0
 * @see BigDecimal
 * @since Release 10.0.0
 *
 */

public class Order {
	
	// definição das variaveis 
	private final String code;
	private final double totalValue;
	private final BigDecimal totalValue2;
	
	
	private String[] itens;
	
	/**
	 * CONSTRUTOR DA CLASSE 
	 * @param code codigo do pedido
	 * @param totalValue valor total do pedido double
	 * @param totalValue2 valor total do pedido double BigDecimal
	 */
	public Order(String code, double totalValue, BigDecimal totalValue2) {
		this.code = code;
		this.totalValue = totalValue;
		this.totalValue2 = totalValue2;
		
	}
	
	
	public void printItens() {
		for (String i: itens) {
			System.out.print(i);
		}
			
		
	}
	
	/**
	 * CALCULA AS TAXAS DE ACORDO COM O VALOR TOTAL DO PEDIDO. SE O PEDIDO FOR MAIOR QUE 100 UMA TAVA É COBRADA
	 * 
	 * @return VALOR TOTAL DO PEDIDO COM AS TAXAS
	 * @throws RuntimeException CASO O VALOR DO PEDIDO FOR NEGATIVO 
	 */
	public BigDecimal calculateFee() throws RuntimeException{
		 if(this.totalValue2.signum() <0) {
			 throw new RuntimeException("O Pedido não pode ter valor negativo");
		 }
		 if(this.totalValue2.compareTo(new BigDecimal("100.00"))>100) {
			 return this.totalValue2.multiply(new BigDecimal("0.99"));
		}
		 return this.totalValue2;
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
