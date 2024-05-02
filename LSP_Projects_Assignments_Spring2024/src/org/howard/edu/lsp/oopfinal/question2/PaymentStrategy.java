package org.howard.edu.lsp.oopfinal.question2;

//Interface defining the payment strategy
interface PaymentStrategy {
	void pay(double amount);
}

//Concrete class for credit card payment
class CreditCardPayment implements PaymentStrategy {
	private String creditCardNumber;

	public CreditCardPayment(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
 }

	 @Override
	 public void pay(double amount) {
	     System.out.println("Paid " + amount + " using credit card " + creditCardNumber);
	 }
}

//Concrete class for PayPal payment
class PayPalPayment implements PaymentStrategy {
	 private String email;
	
	 public PayPalPayment(String email) {
	     this.email = email;
	 }

	 @Override
	 public void pay(double amount) {
	     System.out.println("Paid " + amount + " using PayPal account " + email);
	 }
	}

//Concrete class for Bitcoin payment
class BitcoinPayment implements PaymentStrategy {
	private String bitcoinAddress;

	public BitcoinPayment(String bitcoinAddress) {
	     this.bitcoinAddress = bitcoinAddress;
 }

	 @Override
	 public void pay(double amount) {
	     System.out.println("Paid " + amount + " using Bitcoin address " + bitcoinAddress);
	 }
}

//Shopping cart class using the payment strategy
class ShoppingCart {
	 private PaymentStrategy paymentStrategy;
	
	 public ShoppingCart(PaymentStrategy paymentStrategy) {
	     this.paymentStrategy = paymentStrategy;
	 }

	 public void checkout(double amount) {
	     paymentStrategy.pay(amount);
	 }
}
