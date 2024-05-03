package org.howard.edu.lsp.oopfinal.question2;

//Concrete class for Bitcoin payment
public class BitcoinPayment implements PaymentStrategy {
	private String bitcoinAddress;

	public BitcoinPayment(String bitcoinAddress) {
	     this.bitcoinAddress = bitcoinAddress;
	}

	 public void pay(double amount) {
	     System.out.println("Paid " + amount + " using Bitcoin address " + bitcoinAddress);
	 }
}